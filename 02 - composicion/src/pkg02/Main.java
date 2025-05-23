/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg02;

/**
 *
 * @author Joel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Direccion dir1 = new Direccion("Calle Marin Canas", "Heredia", "CR");
        Direccion dir2 = new Direccion("Calle Terreros", "Heredia", "CR");
        
        Persona per = new Persona ("Juan Jose", dir1);
        Empresa emp = new Empresa ("Fidelitas", dir2);
        
        System.out.println(per);
        System.out.println(emp);
    }
    
}
