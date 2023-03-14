/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin20_2;

public class Papagaio extends Aves implements IPodeVoar,IPodeCamiñar {

    @Override
    public void voar() {
        System.out.println("El papagayo es un ave que puede volar");
    }

    @Override
    public void camiñar() {
        System.out.println("El papagayo es un ave que puede caminar");
    }
    
}
