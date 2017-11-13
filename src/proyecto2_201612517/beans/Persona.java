/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2_201612517.beans;

/**
 *
 * @author Coac_96
 */
public class Persona {
    String tl;
    String tiempo;
    String  tamanio;
    String x;
    String y;

    public Persona(String tl, String tiempo, String tamanio, String x, String y) {
        this.tl = tl;
        this.tiempo = tiempo;
        this.tamanio = tamanio;
        this.x = x;
        this.y = y;
    }

    public void setTl(String tl) {
        this.tl = tl;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public void setX(String x) {
        this.x = x;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getTl() {
        return tl;
    }

    public String getTiempo() {
        return tiempo;
    }

    public String getTamanio() {
        return tamanio;
    }

    public String getX() {
        return x;
    }

    public String getY() {
        return y;
    }
    
    
}
