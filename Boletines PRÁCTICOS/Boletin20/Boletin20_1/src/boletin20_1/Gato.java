/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin20_1;

public class Gato extends Mamifero implements IPodeNadar {

    @Override
    public void nadar() {
        System.out.println("El gato puede nadar");
       
    }

    @Override
    public void camiñar() {
        System.out.println("El gato es un mamifero y puede caminar");
        
    }
    
    
    
}
