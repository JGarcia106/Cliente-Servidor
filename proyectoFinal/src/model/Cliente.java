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
public class Cliente implements Serializable {

    private Long id;
    private String nombreCompleto;
    private String email;
    private String telefono;
    private boolean planLealtad;

    public Cliente() {
    }

    public Cliente(Long id, String nombreCompleto, String email, String telefono, boolean planLealtad) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.telefono = telefono;
        this.planLealtad = planLealtad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isPlanLealtad() {
        return planLealtad;
    }

    public void setPlanLealtad(boolean planLealtad) {
        this.planLealtad = planLealtad;
    }

    @Override
    public String toString() {
        return String.format("Cliente[%d,%s]", id, nombreCompleto);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Cliente && Objects.equals(id, ((Cliente) o).id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

