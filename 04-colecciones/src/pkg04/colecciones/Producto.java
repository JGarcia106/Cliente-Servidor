/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg04.colecciones;

import java.util.Objects;

/**
 *
 * @author Joel
 */
public class Producto implements Comparable<Producto> {

    private String referencia;
    private String nombre;
    private float precio;

    public Producto(String referencia, String nombre, float precio) {
        this.referencia = referencia;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int hashCode() {
        return Objects.hash(referencia, nombre, precio);
    }

    @Override
    public int compareTo(Producto o) {
        return Float.compare(precio, o.getPrecio());
    }

    @Override
    public String toString() {
        return "Producto{" + "referencia=" + referencia + ", nombre=" + nombre + ", precio=" + precio + '}';
    }

}
