/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg02.estatico;

/**
 *
 * @author Joel
 */
public class Cuadrado {
    private static int lado;
    private static int area;
    
    public Cuadrado(){
        Cuadrado.lado = 0;
        Cuadrado.area = 0;
    }

    public static int getLado() {
        return lado;
    }

    public static void setLado(int aLado) {
        lado = aLado;
    }
    
    
    public static int calcularArea(){
        area = lado * lado;
        return area;
    }
    
    public static void prueba(){
        System.out.println("Esto es una prubea");
    }
}
