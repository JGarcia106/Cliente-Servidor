/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg07.caso1;

/**
 *
 * @author Joel
 */
public class ApartamentoNormal extends Apartamento {

    public ApartamentoNormal(int numero, double metrosCuadrados) {
        super(numero, metrosCuadrados, "Estándar");
    }

    @Override
    public double calcularAlquiler() {
        return getMetrosCuadrados() * 15.0;
    }

    @Override
    public String descripcion() {
        return "Apartamento estándar #" + getNumero();
    }
}

