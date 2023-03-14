/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin26;

import java.util.ArrayList;
import java.util.Collections;

public class Operaciones <T> {
    
    private T dato;

    public Operaciones() {
    }

    public Operaciones(T dato) {
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }
    
    
    public <T> void añadirElemento (T elemento,ArrayList<T>lista){
        lista.add(elemento);
    }
    
    public <T> void mostrar (ArrayList<T>lista){
        for(T elemento: lista){
            System.out.println(elemento);
        }
    }
    
        
    public <T> void minimoLista(ArrayList<T>lista){
        System.out.println("El elemento minimo de la lista es: " + Collections.min(lista, null));
        
    }
    
    public <T> void maximoLista(ArrayList<T>lista){
        System.out.println("El elemento maximo de la lista es: " + Collections.max(lista, null));
        
    }
    
    
    public <T> void buscarObjeto(T elemento,ArrayList<T>lista){
        if(lista.indexOf(elemento)>=0)
            System.out.println("El elemento " + elemento + "esta en la lista");
        
        else{
            System.out.println("-1");
        }
    }
    
   
    
     public <T> void eliminar (T elemento,ArrayList<T>lista){
        if(lista.indexOf(elemento)>=0){
            lista.remove(elemento);
            
             System.out.println("El elemento " + elemento + "se elimino");
        }
           
         else{
            System.out.println("null");
        }
    }
}
