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
public class Servicio {
    String accion;
    String noServidor;
    String Siguiente;
    String x;
    String y;
    String alto;
    String ancho;
    String tasaLlegada;
    String tiempo;
    String tamanio;
    String idProductos;
    String nombre;
    String descripccion;
    String linea;
    String cantidad;

    public Servicio(String accion, String noServidor, String Siguiente, String x, String y, String alto, String ancho, String tasaLlegada, String tiempo, String tamanio, String idProductos, String nombre, String descripccion, String linea, String cantidad) {
        this.accion = accion;
        this.noServidor = noServidor;
        this.Siguiente = Siguiente;
        this.x = x;
        this.y = y;
        this.alto = alto;
        this.ancho = ancho;
        this.tasaLlegada = tasaLlegada;
        this.tiempo = tiempo;
        this.tamanio = tamanio;
        this.idProductos = idProductos;
        this.nombre = nombre;
        this.descripccion = descripccion;
        this.linea = linea;
        this.cantidad = cantidad;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public void setNoServidor(String noServidor) {
        this.noServidor = noServidor;
    }

    public void setSiguiente(String Siguiente) {
        this.Siguiente = Siguiente;
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

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public void setIdProductos(String idProductos) {
        this.idProductos = idProductos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripccion(String descripccion) {
        this.descripccion = descripccion;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getAccion() {
        return accion;
    }

    public String getNoServidor() {
        return noServidor;
    }

    public String getSiguiente() {
        return Siguiente;
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

    public String getTiempo() {
        return tiempo;
    }

    public String getTamanio() {
        return tamanio;
    }

    public String getIdProductos() {
        return idProductos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripccion() {
        return descripccion;
    }

    public String getLinea() {
        return linea;
    }

    public String getCantidad() {
        return cantidad;
    }
    
    
}
