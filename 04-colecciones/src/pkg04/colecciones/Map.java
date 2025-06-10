/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg04.colecciones;

import java.util.HashMap;

/**
 *
 * @author Joel
 */
public class Map {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Map<String, Producto> hashMap = new HashMap<>();
        Producto tec = new Producto("PC00123", "Mouse Optico", 3700);
        hashMap.put("PC00000", tec);
        hashMap.put("PC00124", new Producto("PC00124", "Silla Gamer", 145000));
        hashMap.put("PC00125", new Producto("PC00125", "Teclado Cougar", 45000));
        hashMap.put("PC00126", new Producto("PC00126", "Ram DDR4", 14500));

        //preguntamos si existe un producto con la referencia x
        if (hashMap.containsKey("PC00127")) {
            System.out.println("El map contiene la referencia");
        } else {
            System.out.println("El map no contiene la referencia");
        }

        //si contiene un valor
        if (hashMap.containsValue(tec)) {
            System.out.println("El map contiene el objeto");
        } else {
            System.out.println("El map no contiene el objeto");
        }

        for (String mapa : hashMap.keySet()) {
            System.out.println(hashMap.get(mapa));
        }
    }

}
