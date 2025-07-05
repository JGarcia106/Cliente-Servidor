/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg08.hilo3tienda;

/**
 *
 * @author Joel
 */
public class Tienda {
    public void usarVestidor(int idCliente) {
        long tiempoVestidor = (long) (Math.random() * 100000);
        try {
            System.out.println("El cliente " + idCliente + " acaba de entrar al vestidor");
            Thread.sleep(tiempoVestidor);
            System.out.println("El cliente " + idCliente + " ha terminado de usar el vestidor " + tiempoVestidor);   
        }catch (InterruptedException e) {
            System.out.println("Hubo un problema probandose la ropa");
        }
    }
}
