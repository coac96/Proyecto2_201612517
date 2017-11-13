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
public class Nodo {
    private Producto dato;
    private Nodo siguiente;

    
    /**
     * Constructor que inicializamos el valor de las variables.
     */
    public Nodo(Producto dato, Nodo siguiente){
        this.dato = dato;
        this.siguiente = siguiente;
       
    }
        
    // Métodos get y set para los atributos.
    
    public Producto getValor() {
        return dato;
    }

    public void setValor(Producto dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }   

}
