/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg04.interfaces;

/**
 *
 * @author Joel
 */
public class Animal {

    private String nombre;
    private String raza;

    public Animal(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String toString() {
        return "\nNombre: " + this.nombre + "\nRaza: " + this.raza;
    }

}
