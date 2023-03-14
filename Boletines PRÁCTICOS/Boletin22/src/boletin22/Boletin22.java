/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin22;

public class Boletin22 {

    public static void main(String[] args) {
       
        Equipo celta = new Equipo("Celta");
        celta.setGoles(new int[]{3, 4, 2});
        
        Futbol futbol = new Futbol();
        futbol.setEquipos(new Equipo[]{
            celta, 
            new Equipo("Bilbao", new int[]{1, 2, 1}),
            new Equipo("Malaga", new int[]{3, 0, 1}), });
       

        futbol.mostrarTabla();
        
        futbol.listaOrdenada();
        
        futbol.equipoMasGolesJornada();
        
        futbol.equipoYJornadaDeMasGoles();
        
        futbol.consultaEquipoJornada();
    }

}
    