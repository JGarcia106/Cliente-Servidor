/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg03.polimorfismo2;

/**
 *
 * @author Joel
 */
public class Polimorfismo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario us[] = new Usuario [3];
        us[0] = new Administrador("Juan Arce","jarce@empresa.com");
        us[1] = new Cliente("Vanessa Gomez","vanegomez@gmail.com");
        us[2] = new Empleado("Pepe Gonzales", "pepegon@empresa.com");
        
        for (int i = 0; i < us.length; i++) {
            us[i].autenticar();
            System.out.println(us[i]);
        }
    }
}