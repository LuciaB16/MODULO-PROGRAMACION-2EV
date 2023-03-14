/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin27;

import com.Lucia.datos.PedirDatos;
import java.io.File;
import java.util.ArrayList;

public class Boletin27 {

    public static void main(String[] args) {
        
        Metodos obx = new Metodos();
        File f = new File("libreria.txt");
       
        
        ArrayList<Libro>listaLibro= obx.leerObjeto(f);
        int opcion;
        
        do{
            opcion= PedirDatos.pedirInt("**Menu** \n 1--> Escribir libro \n 2-->Añadir libro"
                    + "\n 3-->Consultar libro \n 4--> Mostrar fichero \n 5-->Borrar libro"
                    + "\n 6--> Modificar precio \n 7--> Salir (0)");
            
        switch(opcion){
            
            case 1: obx.escribirLibro(f);
                    obx.leerObjeto(f);
                break;
                
            case 2: obx.añadirLibro(f);
                    obx.leerObjeto(f);
                break;
                
            case 3: obx.consultarLibro(listaLibro);
                break;
                
            case 4: obx.mostrarFichero(f);
                break;
                
            case 5: ArrayList<Libro>nueva = obx.borrarLibro(listaLibro);
                    obx.reemplazarFichero(f, nueva);
                    listaLibro= obx.leerObjeto(f);
                break;
                
            case 6: obx.modificar(listaLibro);
                    obx.reemplazarFichero(f, listaLibro);
                    listaLibro= obx.leerObjeto(f);
                break;
                
            case 7: System.exit(0);
                   break;
                   
            default:
                System.out.println("Opcion incorrecta");
                
                
        }
        
      }while(opcion<=7);
   }

    
}
