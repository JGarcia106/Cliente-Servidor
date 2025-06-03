/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg04.practicaprogramada1;

/**
 *
 * @author Joel
 */
public class Practicaprogramada1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pago pago1 = new PagoTarjetaCredito(150.00, "Colones", "Compania Z", "1234-5678-9101-1121");
        Pago pago2 = new PagoPaypal(200.00, "Colones", "Tienda X", "caracoles@paypal.com");
        Pago pago3 = new PagoTransferenciaBancaria(300.00, "Colones", "Proveedor Y", "001122334455", "Banco de Costa Rica");

        ejecutarPago(pago1);
        System.out.println();
        ejecutarPago(pago2);
        System.out.println();
        ejecutarPago(pago3);
    }

    public static void ejecutarPago(Pago pago) {
        pago.procesarPago();
    }
}

