/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg04.colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Joel
 */
public class Arraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String elemento = "";
        ArrayList nombre = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            nombre.add(JOptionPane.showInputDialog("Digite un nombre: "));
        }

        //añadir un elemento en la pos 2
        nombre.add(2, "prueba");

        //imprimir el array se ocupa un iterator
        Iterator<String> nombreIt = nombre.iterator();
        while (nombreIt.hasNext()) {
            elemento += nombreIt.next() + " / ";
        }
        JOptionPane.showMessageDialog(null, elemento);
    }

}
