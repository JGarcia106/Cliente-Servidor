/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg03.interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author Joel
 */
public class JuegoDados implements Juego {

    private int dado1, dado2;

    private String jugador1, jugador2;

    public JuegoDados() {
        this.dado1 = 0;
        this.dado2 = 0;
        this.jugador1 = "";
        this.jugador2 = "";
    }

    @Override
    public void iniciar() {
        jugador1 = JOptionPane.showInputDialog("Digite el nombre del jugador #1: ");
        jugador2 = JOptionPane.showInputDialog("Digite el nombre del jugador #2: ");
    }

    @Override
    public void jugar() {
        dado1 = (int) (Math.random() * 6) + 1;
        dado2 = (int) (Math.random() * 6) + 1;
        JOptionPane.showMessageDialog(null, "El jugador 1 obtuvo: " + dado1
                + "\nEl jugador 2 obtuvo: " + dado2);
    }

    @Override
    public void finalizar() {
        if (dado1 > dado2) {
            JOptionPane.showMessageDialog(null, "Ha ganado el jugador #1" + jugador1 + "con un puntaje de: " + dado1);
        } else if (dado2 > dado1) {
            JOptionPane.showMessageDialog(null, "Ha ganado el jugador #2" + jugador2 + "con un puntaje de: " + dado2);
        } else {
            JOptionPane.showMessageDialog(null, "Ha sido un empate: " + dado1 + "y" + dado2);
        }
    }
}
