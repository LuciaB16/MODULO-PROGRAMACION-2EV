/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin21_2;

public class Boletin21_2 {

    public static void main(String[] args) {
        
        Notas obx= new Notas();
        int[] aux;
        
        aux= obx.crearNotas();
        obx.mostrarAprobadosYSuspensos(aux);
        obx.notaMedia(aux);
        obx.notaMasAlta(aux);
    }
    
}
