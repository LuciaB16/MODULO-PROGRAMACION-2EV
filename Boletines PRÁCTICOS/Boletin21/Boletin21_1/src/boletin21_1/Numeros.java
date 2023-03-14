/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin21_1;

public class Numeros {
    
     public float[] Numeros(){
        float[] numeros = new float[6];
        int i;
        
        for (i=0;i< numeros.length;i++){
            numeros[i] = (int)(Math.random()*50);
        }
        
          return numeros;   
          
        
    }
    
    public void amosarMetodo(float[] numeros){
        
        for(int i=numeros.length-1;i>=0;i--){
            
            System.out.println(i+1+ "--->" +numeros[i]);
            
        } 
       
    }  
}
