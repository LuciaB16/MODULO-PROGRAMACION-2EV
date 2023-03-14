/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin24;

import com.Lucia.datos.PedirDatos;
import com.lucia.libro.Libro;
import com.lucia.libro.Metodos;
import com.lucia.libro.libroExcepcion;
import java.util.ArrayList;

public class Boletin24 {

    public static void main(String[] args) {
        
        ArrayList <Libro> ListaLibro = new ArrayList<>();
        
        Metodos obx = new Metodos();
        int opcion;
        do{
        
        
        opcion =PedirDatos.pedirInt("***MENU*** \n\n 1---> Añadir libro \n 2---> Vender (borrar) libros \n 3---> Mostrar libros "
                + "\n 4---> Ordenar libros por titulo \n 5---> Dar libro de baja \n 6---> Consultar libro "
                + "\n 7---> Salir \n\n Teclea una opcion de las anteriores");
        
        switch (opcion){
            case 1: obx.añadirLibro(ListaLibro);
                    break;
                    
            case 2: try{
                obx.borrarLibro(ListaLibro);
            }catch(libroExcepcion e){
                System.out.println(e.getMessage());
                   
            }     break;
                    
            case 3: try{
                obx.mostrarLibro(ListaLibro);
            }catch(libroExcepcion e){
                System.out.println(e.getMessage());
              
            }     break;
                    
            case 4: try{
                    obx.ordenar(ListaLibro);
              }catch(libroExcepcion e){
                System.out.println(e.getMessage());
            }       break;
                    
            case 5: try{
                obx.borrarLibroBaja(ListaLibro);
            }catch(libroExcepcion e){
                System.out.println(e.getMessage());
            }       break;
            
            case 6:  try{
                obx.buscarLibro(ListaLibro);
            }catch(libroExcepcion e){
                System.out.println(e.getMessage());
            }       break;
            
            case 7: System.exit(0);
                    break;
                    
            default:
                System.out.println("Opcion incorrecta");
                
    }    
        }while (opcion<=6);
}
    
}
