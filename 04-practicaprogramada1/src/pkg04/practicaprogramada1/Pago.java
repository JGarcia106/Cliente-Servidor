/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg04.practicaprogramada1;

/**
 *
 * @author Joel
 */
public abstract class Pago {
    
    private double monto;
    private String moneda;
    private String receptor;

    public Pago(double monto, String moneda, String receptor) {
        this.monto = monto;
        this.moneda = moneda;
        this.receptor = receptor;
    }

    public abstract void procesarPago();

    public String getInfoBasica() {
        return "Monto: " + monto + " " + moneda + ", Receptor: " + receptor;
    }
}
