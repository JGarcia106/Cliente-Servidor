/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author Joel
 */
public class Habitacion implements Serializable {

    private Long id;
    private String numero;
    private TipoHabitacion tipo;
    private EstadoHabitacion estado = EstadoHabitacion.DISPONIBLE;
    private boolean permiteMascotas;
    private boolean movilidadReducida;
    private Hotel hotel;
    private Set<Servicio> servicios = new HashSet<>();
    private BigDecimal precioNoche;

    public Habitacion() {
    }

    public Habitacion(Long id, String numero, TipoHabitacion tipo, BigDecimal precio) {
        this.id = id;
        this.numero = numero;
        this.tipo = tipo;
        this.precioNoche = precio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public TipoHabitacion getTipo() {
        return tipo;
    }

    public void setTipo(TipoHabitacion tipo) {
        this.tipo = tipo;
    }

    public EstadoHabitacion getEstado() {
        return estado;
    }

    public void setEstado(EstadoHabitacion estado) {
        this.estado = estado;
    }

    public boolean isPermiteMascotas() {
        return permiteMascotas;
    }

    public void setPermiteMascotas(boolean permiteMascotas) {
        this.permiteMascotas = permiteMascotas;
    }

    public boolean isMovilidadReducida() {
        return movilidadReducida;
    }

    public void setMovilidadReducida(boolean movilidadReducida) {
        this.movilidadReducida = movilidadReducida;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Set<Servicio> getServicios() {
        return servicios;
    }

    public void addServicio(Servicio s) {
        servicios.add(s);
    }

    public BigDecimal getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(BigDecimal precioNoche) {
        this.precioNoche = precioNoche;
    }

    @Override
    public String toString() {
        return String.format("Hab[%d-%s,%s,%s]", id, numero, tipo.name(), estado.name());
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Habitacion && Objects.equals(id, ((Habitacion) o).id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
