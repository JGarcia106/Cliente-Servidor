/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg03_._poliformismo;

/**
 *
 * @author Joel
 */
public abstract class Figuras {

    private String nombre;
    private double area;
    private double perimetro;

    public Figuras() {
        this.nombre = "";
    }

    public Figuras(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double getArea();

    public abstract double getPerimetro();

    @Override
    public String toString() {
        return "\nNombre: " + this.getNombre();
    }
}
