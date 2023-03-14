/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin20_2;

public class Morcego extends Mamifero implements IPodeVoar {

    @Override
    public void voar() {
        System.out.println("El murcielago puede volar");
    }

    @Override
    public void camiñar() {
        System.out.println("El murcielago es un mamifero que puede caminar");
    }
    
}
