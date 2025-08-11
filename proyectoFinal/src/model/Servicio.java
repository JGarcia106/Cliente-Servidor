/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Joel
 */
public class Servicio implements Serializable {

    private Long id;
    private String nombre;
    private String descripcion;

    public Servicio() {
    }

    public Servicio(Long id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return String.format("Serv[%d,%s]", id, nombre);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Servicio && Objects.equals(id, ((Servicio) o).id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
