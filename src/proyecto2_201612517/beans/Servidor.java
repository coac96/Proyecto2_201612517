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
public class Servidor {
    int nombre;
    int siguiente;
    int x;
    int y;
    int alto;
    int ancho;
    int tasaLlegada;

    public Servidor(int nombre, int siguiente, int x, int y, int alto, int ancho, int tasaLlegada) {
        this.nombre = nombre;
        this.siguiente = siguiente;
        this.x = x;
        this.y = y;
        this.alto = alto;
        this.ancho = ancho;
        this.tasaLlegada = tasaLlegada;
    }

    public int getNombre() {
        return nombre;
    }

    public int getSiguiente() {
        return siguiente;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getAlto() {
        return alto;
    }

    public int getAncho() {
        return ancho;
    }

    public int getTasaLlegada() {
        return tasaLlegada;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public void setSiguiente(int siguiente) {
        this.siguiente = siguiente;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setTasaLlegada(int tasaLlegada) {
        this.tasaLlegada = tasaLlegada;
    }
    
    
   
            
            
}
