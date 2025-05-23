/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg02.herencia;

/**
 *
 * @author Joel
 */
public class Persona {
    private int edad;
    private String nombre;
    
    public Persona(){
        this.edad = 0;
        this.nombre = "";
    }

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return "\nNombre: " + this.getNombre()
                +"\nEdad: " + this.getEdad();
    }
    
}
