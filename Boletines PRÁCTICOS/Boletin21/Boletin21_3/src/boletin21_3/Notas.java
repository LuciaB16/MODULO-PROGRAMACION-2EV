/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin21_3;

import com.Lucia.datos.PedirDatos;
import java.util.Arrays;


public class Notas {
    
    int notas[]  = new int[4];
    String alumnos[]= new String[4];
    
     public int[] crearNotasAlumnos (){
        
        for(int i=0; i<notas.length;i++){
            
           alumnos[i]= PedirDatos.pedirString("Introduce el nombre del alumno");
           notas[i] = PedirDatos.pedirInt("Introduce la nota del alumno");
           
       }
      return notas;
     }
     
      public void NotaAlumnoDeterminado(String alumBuscar){
          
                 
          for(int i=0;i<alumnos.length;i++){
              if(alumBuscar.equals(alumnos[i])){
                  System.out.println("El alumno " + alumnos[i] + " tiene de nota: " + notas[i]);
              }
              
            }       
      }
      
      public void amosarArray() {

        for (int i = 0; i < notas.length; i++) {

            System.out.println(alumnos[i]+" tiene de nota un: "+notas[i]);
        }
      }
     
    public void mostrarAprobadosYSuspensos (int[]notas){
        
        int aprobados=0;
        int suspensos=0;
        
        
        for(int i=0;i<notas.length;i++){
            if(notas[i]>=5){
                aprobados= aprobados+1;
            
            }
              else
                suspensos= suspensos+1;
           }
        
        System.out.println("El numero de aprobados es: " + aprobados + " y el numero de suspensos es: " + suspensos);
        
    }
    
    public void nombreAprobados(){
         
        for(int i=0;i<notas.length;i++){
            if(notas[i]>=5){
                System.out.println("El alumno " + alumnos[i] + " esta aprobado");              
                
            }
        }
    }
    
       
    public void ordenarSort(int[]notas){
      Arrays.sort(notas);
    }
    
    public void ordenarNotas2(){
        
        int aux;
        String aux2;
        
        for(int i=0;i<notas.length;i++){
            for(int j=i+1;j<notas.length;j++){
                
              if (notas[i]>notas[j]){
                aux=notas[i];
                notas[i]=notas[j];
                notas[j]=aux;
                
                aux2=alumnos[i];
                alumnos[i]=alumnos[j];
                alumnos[j]=aux2; 
                
                
            }
        }
        
        System.out.println("El alumno " + alumnos[i] + "tiene de nota: " + notas[i]);
            
    }
    }
  
    public void notaMedia(int[]notas){
        int acu=0;
        
        for(int i=0;i<notas.length;i++){
            
            acu= acu + notas[i];
        }
        
        float media= (acu/notas.length);
        
        System.out.println("La nota media de la clase es= " + media);
    }
    
    public void notaMasAlta (int[]notas){
        int notaMayor=0;
        
        for(int i=0;i<notas.length;i++){
           if(notas[i]>notaMayor){
               
               notaMayor=notas[i];
                
            }
            
        }
        
        System.out.println("La nota mas alta es: " + notaMayor);
    }
    
    
}
    
