/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lucia.libro;

import com.Lucia.datos.PedirDatos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Metodos {
    
     public ArrayList<Libro> añadirLibro (ArrayList<Libro>lista){
      
        Libro lib = new Libro(PedirDatos.pedirString("Titulo: "),PedirDatos.pedirString("Autor: "),
         PedirDatos.pedirString("ISBN: "), PedirDatos.pedirFloat("Prezo: "),PedirDatos.pedirInt("Unidades: "));
        lista.add(lib);
       
        return lista;
     }
     
       public void borrarLibro(ArrayList<Libro>lista) throws libroExcepcion{
            if(lista.isEmpty()){
                throw new libroExcepcion("No hay libros");
           
       }else{
                
           String isbnBuscar =PedirDatos.pedirString("Introduce el ISBN del libro a borrar");
        Iterator it = lista.iterator();
        Libro lib;
      
        while(it.hasNext()){
            lib= (Libro)it.next();
            if(lib.getIsbn().equalsIgnoreCase(isbnBuscar))
                 it.remove();
        }
            }
           
       }
       
       public void ordenar(ArrayList<Libro>lista)throws libroExcepcion{
           if(lista.isEmpty()){
                throw new libroExcepcion("No hay libros");
              }else{  
      Collections.sort(lista);
   }
       }
       
       public void mostrarLibro(ArrayList<Libro>lista)throws libroExcepcion{
           if(lista.isEmpty()){
                throw new libroExcepcion("No hay libros");
                
           }else{
             System.out.println(lista);
    }
       }
       
        public void borrarLibroBaja(ArrayList<Libro>lista)throws libroExcepcion{
        if(lista.isEmpty()){
                throw new libroExcepcion("No hay libros");
                
        }else{     
            //int unidadesBuscar =PedirDatos.pedirInt("Introduce el numero de unidades del libro");
        Iterator it = lista.iterator();
        Libro lib;
      
        while(it.hasNext()){
            lib= (Libro)it.next();
             //if(lib.getUnidades()==unidadesBuscar)
             if(lib.getUnidades()==0)
                 it.remove();
            
        }
        }
      }
       
       public int buscarLibro(ArrayList<Libro>lista)throws libroExcepcion{
            if(lista.isEmpty()){
                throw new libroExcepcion("No hay libros");
                
            }else{
        String libroBuscar= PedirDatos.pedirString("Introduce el ISBN del libro a buscar");
        int encontrado=0;
        
            for(Libro elemento:lista){
                 if(libroBuscar == null ? elemento.getIsbn() == null : libroBuscar.equals(elemento.getIsbn())){
                    System.out.println("El libro se llama: " + elemento.getTitulo() + ",\n el autor es: " + elemento.getAutor() + 
                            ",\n el ISBN es: " +elemento.getIsbn()+",\n el precio es: " +elemento.getPrezo()+ 
                            ",\n y el numero de unidades que hay es : " +elemento.getUnidades());
                    encontrado=1;
                 }
               }
            if(encontrado==0)
                System.out.println("Ese libro no esta en la libreria");
            
            return encontrado;
         }
            
       }
}
