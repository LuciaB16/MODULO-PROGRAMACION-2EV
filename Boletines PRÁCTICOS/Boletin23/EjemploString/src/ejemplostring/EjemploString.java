/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplostring;

public class EjemploString {

    public static void main(String[] args) {
        
        String nome = "Nabuconodosor";
        
        PruebasString obx = new PruebasString();
        
        System.out.println("El numero de letras es: " + obx.length(nome));
        
        System.out.println("El nombre en mayusculas es: " + obx.toUpperCase(nome));
        
        System.out.println("El nombre en minusculas es: " + obx.toLowerCase(nome));
        
        System.out.println("Los nombres son iguales (si son iguales se mostrara un 0): " + obx.compareTo(nome));
        
        System.out.println("Los nombres son iguales (si son iguales se mostrara un 0): " + obx.compareToIgnoreCase(nome));
        
        obx.arrayString(nome);
        
        System.out.println("El nombre cortado por la c es: " +obx.substring(nome));
     }
     
    
}
