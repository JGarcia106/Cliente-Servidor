/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg04.colecciones;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Joel
 */
public class Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("----Set de Frutas-----");
        Set<String> frutas = new HashSet();
        frutas.add("uvas");
        frutas.add("manzanas");
        frutas.add("peras");

        frutas.add(JOptionPane.showInputDialog("Ingrese una nueva fruta: ").toLowerCase());

        for (String f : frutas) {
            System.out.println(f + " / ");
        }

        String eliminar = JOptionPane.showInputDialog("Ingrese la fruta a eliminar: ").toLowerCase();
        frutas.remove(eliminar);

        //otra forma de imprmir
        System.out.println(frutas);
    }

}
