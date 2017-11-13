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
public class Lista {
    private int tamanio;
    private Nodo inicio;
    private Nodo fin;
    
    
    public void Lista(){
        inicio=null;
        fin = null;
        tamanio = 0;
    }
    
    
    public boolean listavacia(){
        if(inicio == null){
            return true;
        }else{
            return false;
        }
    }
   
    public void insertar(Producto objeto){
        Nodo actual;
        if(listavacia()){
            actual = new Nodo(objeto, null);
            inicio = actual;
            fin = actual;
        }else{
            actual = new Nodo(objeto, null);
            fin.setSiguiente(actual);
            fin = actual;   
        }
        tamanio++;
    }
    
    public void mostrarLista(){
        Nodo temporal;
        temporal = inicio;
        while(temporal != null){
            System.out.println(temporal.getValor().toString());
            temporal = temporal.getSiguiente();
        }
             
    }
    public Producto obtener(){
        Producto pr = inicio.getValor();
        this.inicio = inicio.getSiguiente();
        tamanio--;
        return pr;
    }
    
    public int tamanioP(){
        return tamanio;
    }
   
}
