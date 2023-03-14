/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin21_4;

import javax.swing.JOptionPane;

public class Boletin21_4 {

    public static void main(String[] args) {
        
        int num= Integer.parseInt(JOptionPane.showInputDialog("Introduce numero DNI"));
        Nif obx = new Nif(num);
       
        
        System.out.println("La letra que corresponde a ese DNI es: " + obx.calcularLetraDni());
        
        
        
        
    }
    
}
