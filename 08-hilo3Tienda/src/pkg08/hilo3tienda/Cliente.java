/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg08.hilo3tienda;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Joel
 */
public class Cliente implements Runnable{
    int idCliente;
    Tienda tienda;
    static int numVestidores = 5;
    static Semaphore semaforo = new Semaphore(numVestidores);

    public Cliente(int id, Tienda tienda) {
        this.idCliente = id;
        this.tienda = tienda;
    }
    
    public void run() {
        try{
            semaforo.acquire();
            this.tienda.usarVestidor(idCliente);
        }catch (InterruptedException e) {
            System.out.println("Hilo interrumpido");
        }   
        semaforo.release();
    } 
}
