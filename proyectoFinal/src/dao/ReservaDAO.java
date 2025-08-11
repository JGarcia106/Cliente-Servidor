/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Reserva;
import exception.DBException;
import util.DBConnection;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Joel
 */
public class ReservaDAO {

    public Reserva create(Reserva r) throws DBException {
        String sql = "INSERT INTO reserva(id_cliente,id_habitacion,fecha_entrada,fecha_salida,estado,fecha_reserva,confirmada_por_colaborador) VALUES (?,?,?,?,?,?,?)";
        try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setLong(1, r.getCliente().getId());
            ps.setLong(2, r.getHabitacion().getId());
            ps.setDate(3, Date.valueOf(r.getFechaEntrada()));
            ps.setDate(4, Date.valueOf(r.getFechaSalida()));
            ps.setString(5, r.getEstado().name());
            ps.setDate(6, Date.valueOf(r.getFechaReserva()));
            ps.setBoolean(7, r.isConfirmadaPorColaborador());
            ps.executeUpdate();
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    r.setId(rs.getLong(1));
                }
            }
            return r;
        } catch (SQLException e) {
            throw new DBException("Error al crear reserva", e);
        }
    }

    public List<Reserva> findByHabitacionBetween(Long habitacionId, LocalDate desde, LocalDate hasta) throws DBException {
        String sql = "SELECT id_reserva, fecha_entrada, fecha_salida FROM reserva WHERE id_habitacion=? AND NOT (fecha_salida <= ? OR fecha_entrada >= ?)";
        try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setLong(1, habitacionId);
            ps.setDate(2, Date.valueOf(desde));
            ps.setDate(3, Date.valueOf(hasta));
            try (ResultSet rs = ps.executeQuery()) {
                List<Reserva> list = new ArrayList<>();
                while (rs.next()) {
                    Reserva r = new Reserva();
                    r.setId(rs.getLong("id_reserva"));
                    r.setFechaEntrada(rs.getDate("fecha_entrada").toLocalDate());
                    r.setFechaSalida(rs.getDate("fecha_salida").toLocalDate());
                    list.add(r);
                }
                return list;
            }
        } catch (SQLException e) {
            throw new DBException("Error findByHabitacionBetween", e);
        }
    }
}
