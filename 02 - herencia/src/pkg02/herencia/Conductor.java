/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg02.herencia;

/**
 *
 * @author Joel
 */
public class Conductor extends Persona {
    private String tipoLicencia;
    
    public Conductor(){
        this.tipoLicencia = "";
    }

    public Conductor(String tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }

    public Conductor(String nombre, int edad ,String tipoLicencia) {
        super(edad, nombre);
        this.tipoLicencia = tipoLicencia;
    }

    public String getTipoLicencia() {
        return tipoLicencia;
    }

    public void setTipoLicencia(String tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }
    
    @Override
    public String toString(){
        return super.toString()
                + "\nTipo de Licencia: " + this.getTipoLicencia();
    }
    
}