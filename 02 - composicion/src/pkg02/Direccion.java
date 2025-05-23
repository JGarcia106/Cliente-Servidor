/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg02;

/**
 *
 * @author Joel
 */
public class Direccion {

    private String calle;
    private String ciudad;
    private String pais;

    public Direccion() {
        this.calle = "";
        this.ciudad = "";
        this.pais = "";
    }

    public Direccion(String calle, String ciudad, String pais) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    @Override
    public String toString(){
        return "\nCalle: " + this.getCalle()
                + "\nCiudad: " + this.getCiudad()
                + "\nPais " + this.getPais();
    }
    
}
