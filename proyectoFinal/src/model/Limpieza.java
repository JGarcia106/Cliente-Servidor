/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Joel
 */
public class Limpieza implements Serializable {

    private Long id;
    private Habitacion habitacion;
    private LocalDate fechaProgramada;
    private EstadoLimpieza estado = EstadoLimpieza.PENDIENTE;
    private String comentario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public LocalDate getFechaProgramada() {
        return fechaProgramada;
    }

    public void setFechaProgramada(LocalDate fechaProgramada) {
        this.fechaProgramada = fechaProgramada;
    }

    public EstadoLimpieza getEstado() {
        return estado;
    }

    public void setEstado(EstadoLimpieza estado) {
        this.estado = estado;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}

