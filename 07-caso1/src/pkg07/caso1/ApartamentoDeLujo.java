/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg07.caso1;

/**
 *
 * @author Joel
 */
public class ApartamentoDeLujo extends Apartamento {

    public ApartamentoDeLujo(int numero, double metrosCuadrados) {
        super(numero, metrosCuadrados, "Lujo");
    }

    @Override
    public double calcularAlquiler() {
        return getMetrosCuadrados() * 20.0 + 500; // tarifa + extra lujo
    }

    @Override
    public String descripcion() {
        return "Apartamento de lujo #" + getNumero();
    }
}

