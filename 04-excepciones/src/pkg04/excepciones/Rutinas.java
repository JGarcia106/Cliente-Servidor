/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg04.excepciones;

import javax.swing.JOptionPane;

/**
 *
 * @author Joel
 */
public class Rutinas {
    //programa que solo recibe números pares, si ingrese un impar mostrar el error
    public void ejemplo1() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite un valor: "));
        try {
            if (n % 2 == 0) {
                JOptionPane.showMessageDialog(null, "El numero ingresado es par\n"
                        + n + " es valido");
            } else {
                throw new Exception("Error: el numero ingresado es impar");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ejemplo1();
        }
    }

    //validar que solo se ingresen números
    public void ejemplo2() {
        int total = 0, n1 = 0, n2 = 0;
        boolean esNum = false;
        while (!esNum) {
            try {
                n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un valor: "));
                n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro valor: "));
                esNum = true;//si no lanza ninguna exception, se cambia el estado a verdadero
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "No se permiten letras");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "error de entrada y salida");
                System.out.println(e.getMessage());
            } finally {
                total = n1 + n2;
            }
            JOptionPane.showMessageDialog(null, "La sumatoria es " + total);
        }
    }
}
