/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg08.hilo3tienda;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Joel
 */
public class Hilo3Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        ExecutorService ejecutor = Executors.newFixedThreadPool(5);
        for (int i = 1; i <= 25; i++) {
            ejecutor.execute(new Cliente(i, tienda));
        }
        ejecutor.shutdown();
        while (!ejecutor.isTerminated());
    }
    
}
