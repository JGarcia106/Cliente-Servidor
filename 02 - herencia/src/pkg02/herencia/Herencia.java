/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg02.herencia;

/**
 *
 * @author Joel
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\nConductor: ");
        Conductor c1 = new Conductor("Luis",54,"B3");
        System.out.println(c1.toString());
        System.out.println("\nTaxista: ");
        Taxista t1 = new Taxista("Maria",34,"B1",5);
        System.out.println(t1.toString());
        
    }
    
}
