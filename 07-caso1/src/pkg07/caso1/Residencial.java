/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg07.caso1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Joel
 */
public class Residencial implements Admin {

    private List<Apartamento> apartamentos;

    public Residencial() {
        apartamentos = new ArrayList<>();
    }

    @Override
    public void registrarApartamento(Apartamento apto) {
        apartamentos.add(apto);
    }

    @Override
    public double calcularIngresoTotal() {
        double total = 0;
        for (Apartamento apto : apartamentos) {
            total += apto.calcularAlquiler();
        }
        return total;
    }

    public List<Apartamento> getApartamentos() {
        return apartamentos;
    }
}

