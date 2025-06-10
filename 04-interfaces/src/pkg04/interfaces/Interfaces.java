/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg04.interfaces;

/**
 *
 * @author Joel
 */
public class Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal a[] = new Animal[4];
        a[0] = new Gato("Felix", "Persa");
        a[1] = new Gato("Cleo", "Angora");
        a[2] = new Perro("Firu", "Mestizo");
        a[3] = new Perro("Paquita", "Chihuahua");

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + "\n---------------");
        }
    }
}

