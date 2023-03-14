/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin27;

import com.Lucia.datos.PedirDatos;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Metodos {
    
    FileWriter ou=null;
    PrintWriter fich=null;
    Scanner sc;
    
    
    public void escribirLibro(File fichero){
        
        try{     
          ou=new FileWriter(fichero);
          fich=new PrintWriter(ou);
          
          fich.println(new Libro (PedirDatos.pedirString("Nombre del libro: "),
                  PedirDatos.pedirString("Autor: "),
                  PedirDatos.pedirFloat("Precio: "),
                  PedirDatos.pedirInt("Unidades: ")));
          
        }catch (IOException ex){
            System.out.println("Error al escribir" + ex.getMessage());
        }
        finally{
            fich.close();
        }          
    }
    
    
    public void añadirLibro(File fichero){
        
        try{     
          ou=new FileWriter(fichero,true);
          fich=new PrintWriter(ou);
          
          fich.println(new Libro (PedirDatos.pedirString("Nombre del libro: "),
                  PedirDatos.pedirString("Autor: "),
                  PedirDatos.pedirFloat("Precio: "),
                  PedirDatos.pedirInt("Unidades: ")));
          
        }catch (IOException ex){
            System.out.println("Error al escribir" + ex.getMessage());
        }
        finally{
            fich.close();
        }          
    }
    
    
    public void consultarLibro(ArrayList<Libro>lista){
        
        String nomLibro = PedirDatos.pedirString("Introduce nombre del libro a buscar");
        
        Iterator it= lista.iterator();
        Libro lib;
        
        while(it.hasNext()){
            lib=(Libro) it.next();
             if(lib.getNombre().equalsIgnoreCase(nomLibro)){
                 System.out.println("El precio de este libro es: " + lib.getPrecio());
                          
            }else
                System.out.println("No tenemos ese libro en la libreria");
        }
                
    }
    
    
    
    public void mostrarFichero(File fichero){
        System.out.println(fichero);
    }
    
    
    public ArrayList<Libro> borrarLibro(ArrayList<Libro>lista){
        
        ArrayList<Libro>nueva = new ArrayList<>();
        
        for(Libro lib:lista){
            if(lib.getUnidades()>0){
                lista.add(lib);
            }
        }
         return nueva;
        
    }   
    
    
    public void modificar(ArrayList<Libro>lista){
        
        String nomBuscar = PedirDatos.pedirString("Introduce nombre del libro al que le quieres "
                + "cambiar el precio");
        
        for(Libro elemento:lista){
            if(elemento.getNombre().equalsIgnoreCase(nomBuscar)){
                float nuevoPrecio= PedirDatos.pedirFloat("Introduce nuevo precio");
                elemento.setPrecio(nuevoPrecio);
                
          }
            else{
                System.out.println("Ese libro no esta en la libreria");
            }
        }
        
    }
    
    
    
    
    public ArrayList<Libro> leerObjeto (File fichero){
             
        ArrayList<Libro>lista=new ArrayList<>();
        String[]aux= new String[4];
        
       try{ 
          sc= new Scanner(fichero);
         
          while(sc.hasNextLine()){
              aux= sc.nextLine().split(",");
              lista.add(new Libro(aux[0],aux[1],Float.parseFloat(aux[2]),Integer.parseInt(aux[3])));
          }
          
        }catch (FileNotFoundException ex){
                System.out.println("Error de lectura" + ex.getMessage());
                }
       
       finally{
           sc.close();
       }
       
       return lista;
       } 
    


    public void reemplazarFichero(File fichero,ArrayList<Libro>lista){
        
        try{
            ou=new FileWriter(fichero);
            fich= new PrintWriter(ou);
            
            for(int i=0; i<lista.size();i++){
            fich.println(lista.get(i));
            }
        }catch (IOException ex){
               System.out.println("Error de escritura" + ex.getMessage()); 
                }
        
        finally{
            fich.close();
        }
    }

    }


