/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg04.practicaprogramada1;

/**
 *
 * @author Joel
 */
public class PagoPaypal extends Pago implements Notificable {
    
    private String correo;

    public PagoPaypal(double monto, String moneda, String receptor, String correo) {
        super(monto, moneda, receptor);
        this.correo = correo;
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando pago con PayPal para la cuenta: " + correo);
        System.out.println(getInfoBasica());
        enviarNotificacion();
    }

    @Override
    public void enviarNotificacion() {
        System.out.println("Notificacion enviada al correo PayPal.");
    }
}
