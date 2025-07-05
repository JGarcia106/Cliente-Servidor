/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg08.hilo2barras;

import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author Joel
 */
public class hiloProceso extends Thread {

    private JProgressBar barra;
    private JLabel duracion, ganador;
    private int tiempo;
    private String corredor;

    public hiloProceso(JProgressBar barra, JLabel ganador, JLabel tiempo, String corredor) {
        this.barra = barra;
        this.ganador = ganador;
        this.duracion = tiempo;
        this.corredor = corredor;
    }

    private void contabilizarPorSegundos() {
        try {
            int segundos = 1 + new Random().nextInt(15);
            this.tiempo += segundos;
            Thread.sleep(segundos * 10);
            this.barra.repaint();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            this.barra.setValue(i);
            this.contabilizarPorSegundos();
        }
        this.duracion.setText(String.valueOf(this.tiempo));
        if (this.ganador.getText().isEmpty()) {
            this.ganador.setText("El ganador es el corredor # " + this.corredor);
        }
    }
}
