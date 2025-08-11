/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Joel
 */
public class Reserva implements Serializable {

    private Long id;
    private Cliente cliente;
    private Habitacion habitacion;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private EstadoReserva estado = EstadoReserva.ACTIVA;
    private LocalDate fechaReserva;
    private boolean confirmadaPorColaborador;

    public Reserva() {
    }

    public Reserva(Long id, Cliente cliente, Habitacion habitacion, LocalDate entrada, LocalDate salida) {
        this.id = id;
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fechaEntrada = entrada;
        this.fechaSalida = salida;
        this.fechaReserva = LocalDate.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public EstadoReserva getEstado() {
        return estado;
    }

    public void setEstado(EstadoReserva estado) {
        this.estado = estado;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public boolean isConfirmadaPorColaborador() {
        return confirmadaPorColaborador;
    }

    public void setConfirmadaPorColaborador(boolean confirmadaPorColaborador) {
        this.confirmadaPorColaborador = confirmadaPorColaborador;
    }

    @Override
    public String toString() {
        return String.format("Reserva[%d,%s,%s->%s]", id, cliente.getNombreCompleto(), fechaEntrada, fechaSalida);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Reserva && Objects.equals(id, ((Reserva) o).id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
