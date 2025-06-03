/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg04.practicaprogramada1;

/**
 *
 * @author Joel
 */
public class PagoTarjetaCredito extends Pago implements Notificable {
    
    private String numeroTarjeta;

    public PagoTarjetaCredito(double monto, String moneda, String receptor, String numeroTarjeta) {
        super(monto, moneda, receptor);
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando pago con tarjeta: " + numeroTarjeta);
        System.out.println(getInfoBasica());
        enviarNotificacion();
    }

    @Override
    public void enviarNotificacion() {
        System.out.println("Notificacion enviada al titular de la tarjeta.");
    }
}
