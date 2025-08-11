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
public class Usuario implements Serializable {

    private Long id;
    private Long idCliente; // nullable
    private Rol rol;
    private String usuario;
    private String contrasenia;

    public Usuario() {
    }

    public Usuario(Long id, Long idCliente, Rol rol, String usuario, String contrasenia) {
        this.id = id;
        this.idCliente = idCliente;
        this.rol = rol;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        return String.format("Usuario[%d,%s]", id, usuario);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Usuario && Objects.equals(id, ((Usuario) o).id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
