/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg03_._poliformismo;

/**
 *
 * @author Joel
 */
public class Triangulo extends Figuras{
    
    private double base;
    private double altura;
    
    public Triangulo(){
        this.base = 0.0d;
        this.altura = 0.0d;
    }
    public Triangulo(double base, double lado){
        super("Triangulo");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return this.base * this.altura / 2;
    }

    @Override
    public double getPerimetro() {
        return this.base + this.altura + this.base;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nArea: " + this.getArea()
                + "\nPerimetro: " + this.getPerimetro();
    }
}
