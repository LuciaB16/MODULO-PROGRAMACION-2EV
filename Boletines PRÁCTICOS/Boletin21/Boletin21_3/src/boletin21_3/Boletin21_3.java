/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin21_3;

import javax.swing.JOptionPane;

public class Boletin21_3 {

    public static void main(String[] args) {
        
        Notas obx = new Notas();
        int opcion;
        
        int [] aux= null;
        
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(" **MENU** \n 1-->Crear array \n 2-->Nota Alumno \n 3-->Nombres Aprobados" +
        "\n 4-->Orden notas \n 5--> Nota Alumno pedida \n 6-->mostrar \n 7--> AprobadosSuspensos"
                    + "\n 8--> Nota Mas Alta \n 9-->Nota media \n 10 --> Ordenar Sort \n 11-->Salir"));
            
          switch(opcion){
              
              case 1: aux= obx.crearNotasAlumnos();
              break;
              
              case 2: obx.NotaAlumnoDeterminado("h");
              break;
                          
              case 3: obx.nombreAprobados();
              break;
              
              case 4: obx.ordenarNotas2();
              break;
              
              case 5: obx.NotaAlumnoDeterminado(JOptionPane.showInputDialog("Introduce nombre a buscar"));
              break;
              
              case 6: obx.amosarArray();
              break;
              
              case 7: obx.mostrarAprobadosYSuspensos(aux);
              break;
              
              case 8: obx.notaMasAlta(aux);
              break;
              
              case 9: obx.notaMedia(aux);
              break;
              
              case 10: obx.ordenarSort(aux);
              break;
              
              case 11: System.exit(0);
              
              default:
                  System.out.println("Opcion incorrecta");
              
             
          }
        }while (opcion<=11);
        
    }
    
}
