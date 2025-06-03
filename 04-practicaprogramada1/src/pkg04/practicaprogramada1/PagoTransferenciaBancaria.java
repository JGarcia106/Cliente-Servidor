/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg04.practicaprogramada1;

/**
 *
 * @author Joel
 */
public class PagoTransferenciaBancaria extends Pago{
    
    private String numeroCuenta;
    private String banco;

    public PagoTransferenciaBancaria(double monto, String moneda, String receptor, String numeroCuenta, String banco) {
        super(monto, moneda, receptor);
        this.numeroCuenta = numeroCuenta;
        this.banco = banco;
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando transferencia a la cuenta: " + numeroCuenta + " del banco " + banco);
        System.out.println(getInfoBasica());
    }
}
