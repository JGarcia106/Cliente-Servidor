/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg02.estatico;

import javax.swing.JOptionPane;

/**
 *
 * @author Joel
 */
public class Estatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuadrado.setLado(Integer.parseInt(JOptionPane.showInputDialog("Digite el valor del lado: ")));
        JOptionPane.showMessageDialog(null, "El area del cuadrado es: " + Cuadrado.calcularArea());
    }
    
}
