/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg02.herencia;

/**
 *
 * @author Joel
 */
public class Taxista extends Persona {
    private int experiencia;
    
    public Taxista(){
        this.experiencia = 0;
    }

    public Taxista(int experiencia) {
        this.experiencia = experiencia;
    }

    public Taxista(String nombre, int edad, String tipoLicencia, int experiencia) {
        super(edad, nombre);
        this.experiencia = experiencia;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    
    @Override
    public String toString(){
        return super.toString() 
                + "\nExperiencia: " + this.getExperiencia();
    }
    
}
