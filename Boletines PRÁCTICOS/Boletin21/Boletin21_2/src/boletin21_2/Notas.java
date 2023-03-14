/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin21_2;

import com.Lucia.datos.PedirDatos;

public class Notas {
    
    public int [] crearNotas (){
        
        int [] notas = new int [5];
        
        for(int i=0; i<notas.length;i++)
           notas[i] = PedirDatos.pedirInt("Introduce la nota del alumno");
        
      return notas;
    
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
