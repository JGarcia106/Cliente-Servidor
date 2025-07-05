/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg08.hilo1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Joel
 */
public class Hilo1 extends Thread{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hilo1 h1 = new Hilo1();
        h1.start();
        Hilo1 h2 = new Hilo1();
        h2.start();
        Hilo1 h3 = new Hilo1();
        h3.start();
    }
    
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("This code is running a Thread");
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
