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
public class Servidores {
    String noServidor;
    String siguiente;
    String x;
    String y;
    String alto;
    String ancho;
    String tasaLlegada;

    public Servidores(String noServidor, String siguiente, String x, String y, String alto, String ancho, String tasaLlegada) {
        this.noServidor = noServidor;
        this.siguiente = siguiente;
        this.x = x;
        this.y = y;
        this.alto = alto;
        this.ancho = ancho;
        this.tasaLlegada = tasaLlegada;
    }

    public String getNoServidor() {
        return noServidor;
    }

    public String getSiguiente() {
        return siguiente;
    }

    public String getX() {
        return x;
    }

    public String getY() {
        return y;
    }

    public String getAlto() {
        return alto;
    }

    public String getAncho() {
        return ancho;
    }

    public String getTasaLlegada() {
        return tasaLlegada;
    }

    public void setNoServidor(String noServidor) {
        this.noServidor = noServidor;
    }

    public void setSiguiente(String siguiente) {
        this.siguiente = siguiente;
    }

    public void setX(String x) {
        this.x = x;
    }

    public void setY(String y) {
        this.y = y;
    }

    public void setAlto(String alto) {
        this.alto = alto;
    }

    public void setAncho(String ancho) {
        this.ancho = ancho;
    }

    public void setTasaLlegada(String tasaLlegada) {
        this.tasaLlegada = tasaLlegada;
    }
                
            

}
