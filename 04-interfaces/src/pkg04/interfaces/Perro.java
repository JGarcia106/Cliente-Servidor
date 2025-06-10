/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg04.interfaces;

/**
 *
 * @author Joel
 */
public class Perro extends Animal implements Mascota {

    public Perro(String nombre, String raza) {
        super(nombre, raza);
    }

    @Override
    public String hacerSonido() {
        return "Guau";
    }

    @Override
    public String dormir() {
        return "Perro dormido";
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n" + hacerSonido() + "\n" + dormir();
    }
}
    
