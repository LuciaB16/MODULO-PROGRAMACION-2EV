/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin22;

import java.util.Arrays;

public class Equipo {
    
    private String nombre;
    private int[] goles= new int[36];
    private int golesTotales;
    
    

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public Equipo(String nombre, int[] goles) {
        this.nombre = nombre;
        this.goles = goles;
        setGoles(goles);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getGoles() {
        return goles;
    }

    public void setGoles(int[] goles) {
        this.goles= goles;
        int acu= 0;
        for (int i= 0; i< goles.length; i++) {
            acu= acu+ goles[i];
        }
        golesTotales = acu;
    }

    public int getGolesTotales() {
        return golesTotales;
    }

    @Override
    public String toString() {
        return  "nombreEquipo=" + nombre + ", goles=" + Arrays.toString(goles);
    }
    
}
