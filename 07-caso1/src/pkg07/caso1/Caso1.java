/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg07.caso1;

import javax.swing.JOptionPane;

/**
 *
 * @author Joel
 */
public class Caso1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Residencial complejo = new Residencial();

        try {
            String[] opciones = {"Lujo", "Estándar"};
            for (int i = 0; i < 3; i++) {
                String tipo = (String) JOptionPane.showInputDialog(null,
                        "Seleccione el tipo de apartamento:",
                        "Tipo", JOptionPane.QUESTION_MESSAGE, null,
                        opciones, opciones[0]);

                int numero = Integer.parseInt(JOptionPane.showInputDialog("Número de apartamento:"));
                double metros = Double.parseDouble(JOptionPane.showInputDialog("Metros cuadrados:"));

                Apartamento apto;
                if (tipo.equals("Lujo")) {
                    apto = new ApartamentoDeLujo(numero, metros);
                } else {
                    apto = new ApartamentoNormal(numero, metros);
                }

                complejo.registrarApartamento(apto);
                JOptionPane.showMessageDialog(null, apto.descripcion() + " registrado con éxito.");
            }

            double total = complejo.calcularIngresoTotal();
            JOptionPane.showMessageDialog(null, "Ingreso total del complejo: $" + total);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: formato numérico inválido.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error inesperado: " + e.getMessage());
        }
    }
}

