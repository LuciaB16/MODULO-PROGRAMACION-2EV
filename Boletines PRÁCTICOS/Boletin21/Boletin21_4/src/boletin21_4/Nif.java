/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin21_4;

public class Nif {
    
    private int numDni;

    public Nif(int numDni) {
        this.numDni = numDni;
    }
    
    public char calcularLetraDni(){
        int resto= numDni%23;
        
        char [] letras = new char[] {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        return letras[resto];
    }
}
    
  