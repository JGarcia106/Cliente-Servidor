/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg04.interfaces;

/**
 *
 * @author Joel
 */
public class Gato extends Animal implements Mascota {

    public Gato(String nombre, String raza) {
        super(nombre, raza);
    }

    @Override
    public String hacerSonido() {
        return "Miau";
    }

    @Override
    public String dormir() {
        return "Gato dormido";
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n" + hacerSonido() + "\n" + dormir();
    }

}
