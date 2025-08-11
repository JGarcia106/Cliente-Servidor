/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.HabitacionDAO;
import dao.ReservaDAO;
import dao.ClienteDAO;
import exception.BusinessException;
import exception.DBException;
import exception.NotFoundException;
import model.*;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Joel
 */
public class ReservationService {

    private final ReservaDAO reservaDAO = new ReservaDAO();
    private final HabitacionDAO habitacionDAO = new HabitacionDAO();
    private final ClienteDAO clienteDAO = new ClienteDAO();

    public Reserva reservar(Long clienteId, Long habitacionId, LocalDate desde, LocalDate hasta) throws BusinessException, DBException, NotFoundException {
        if (desde == null || hasta == null) {
            throw new BusinessException("Fechas no pueden ser nulas");
        }
        if (!hasta.isAfter(desde)) {
            throw new BusinessException("Fecha de salida debe ser posterior a la de entrada");
        }

        Cliente cliente = clienteDAO.findById(clienteId);
        Habitacion habitacion = habitacionDAO.findById(habitacionId);

        List<Reserva> colisiones = reservaDAO.findByHabitacionBetween(habitacionId, desde, hasta);
        if (!colisiones.isEmpty()) {
            throw new BusinessException("Habitación ya reservada en el intervalo solicitado.");
        }

        Reserva r = new Reserva(null, cliente, habitacion, desde, hasta);
        r.setConfirmadaPorColaborador(false);
        return reservaDAO.create(r);
    }

    public List<Habitacion> buscarDisponibles(LocalDate desde, LocalDate hasta) throws DBException {
        return habitacionDAO.listDisponiblesBetweenDates(desde, hasta);
    }
}

