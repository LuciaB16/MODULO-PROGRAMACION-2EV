/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin18;

import java.util.Scanner;

public class Boletin18 {

    public static void main(String[] args){
        
        ConversorTemperaturas obx = new ConversorTemperaturas();
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce temperatura en grados centigrados");
        float grados= sc.nextFloat();
        
        try{         
        
            System.out.println("Los grados Fahrenheit son= " + obx.centigradosAFahrenheit(grados)+ "y los grados Reamur son= " +  obx.centigradosAReamur(grados));
        
        }catch (TemperaturaErradaExcepcion exc){
            System.out.println("Que la temperatura no sea menor de 80 grados" + exc.toString());
        }
        System.out.println("Fin del programa");
    }
    
}
