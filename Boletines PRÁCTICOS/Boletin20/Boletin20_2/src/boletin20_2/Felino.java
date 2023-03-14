/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin20_2;

public class Felino extends Mamifero implements IPodeNadar{

    @Override
    public void nadar() {
        System.out.println("El felino puede nadar");
    }

    @Override
    public void camiñar() {
        System.out.println("El felino es un mamifero que puede caminar");
    }
    
    
    
}
