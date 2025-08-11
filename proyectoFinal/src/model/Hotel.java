/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Joel
 */
public class Hotel implements Serializable {

    private Long id;
    private String nombre;
    private String ubicacion;
    private String telefono;
    private String email;
    private List<Habitacion> habitaciones = new ArrayList<>();

    public Hotel() {
    }

    public Hotel(Long id, String nombre, String ubicacion, String telefono, String email) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.telefono = telefono;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void addHabitacion(Habitacion h) {
        habitaciones.add(h);
        h.setHotel(this);
    }

    @Override
    public String toString() {
        return String.format("Hotel[%d,%s]", id, nombre);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Hotel && Objects.equals(id, ((Hotel) o).id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
