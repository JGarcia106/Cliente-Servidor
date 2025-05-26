/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg03_._poliformismo;

/**
 *
 * @author Joel
 */
public class Cuadrado extends Figuras {

    private double lado;

    public Cuadrado(double lado) {
        super("Cuadrado");
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return this.lado * this.lado;
    }

    @Override
    public double getPerimetro() {
        return this.lado * 4;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nArea: " + this.getArea()
                + "\nPerimetro: " + this.getPerimetro();
    }
}
