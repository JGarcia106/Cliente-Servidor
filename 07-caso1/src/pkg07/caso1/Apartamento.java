/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg07.caso1;

/**
 *
 * @author Joel
 */
public abstract class Apartamento {
    private int numero;
    private double metrosCuadrados;
    private String tipo;

    public Apartamento(int numero, double metrosCuadrados, String tipo) {
        this.numero = numero;
        this.metrosCuadrados = metrosCuadrados;
        this.tipo = tipo;
    }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public double getMetrosCuadrados() { return metrosCuadrados; }
    public void setMetrosCuadrados(double metrosCuadrados) { this.metrosCuadrados = metrosCuadrados; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public abstract double calcularAlquiler();
    public abstract String descripcion();
}

