/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg03_._poliformismo;

/**
 *
 * @author Joel
 */
public class Circulo extends Figuras{
    
    public double radio;
    
    public Circulo(){
        this.radio = 0.0d;
    }
    public Circulo(double radio){
        super("Circulo");
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    @Override
    public double getPerimetro() {
        return 2* Math.PI * this.radio;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nArea: " + this.getArea()
                + "\nPerimetro: " + this.getPerimetro();
    }
}
