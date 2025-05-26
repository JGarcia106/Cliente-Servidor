/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg03_._poliformismo;

/**
 *
 * @author Joel
 */
public class _poliformismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figuras f[] = new Figuras[4];
        f[0] = new Cuadrado(12);
        f[1] = new Circulo(3);
        f[2] = new Circulo(8);
        f[3] = new Triangulo(10, 4);
        for (int i = 0; i < f.length; i++) {
            System.out.println("\n"
                    + f[i]
                    + "\n");
        }
    }
}
