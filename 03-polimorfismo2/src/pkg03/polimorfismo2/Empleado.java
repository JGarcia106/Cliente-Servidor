/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg03.polimorfismo2;

/**
 *
 * @author Joel
 */
public class Empleado extends Usuario{

    public Empleado(String nombre, String correo) {
        super(nombre, correo);
    }
    
    @Override
    public void autenticar(){
        System.out.println("\nAutenticacion con privilegio de empleado estandar");
    }
    
} 
    
