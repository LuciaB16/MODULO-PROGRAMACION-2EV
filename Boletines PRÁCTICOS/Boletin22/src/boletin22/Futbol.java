/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin22;

import com.Lucia.datos.PedirDatos;
import java.util.Arrays;

public class Futbol {
    
    private Equipo[] equipos= new Equipo[20];

    
    public void setEquipos(Equipo[] equipos) {
        this.equipos = equipos;
    }

    @Override
    public String toString() {
        return "equipos=" + Arrays.toString(equipos);
    }
    
    

    public void mostrarTabla() {
        
        System.out.print("Equipo/jornada   ");
        for (int i= 0; i<equipos[0].getGoles().length; i++) {
            System.out.print("X" + (i + 1) + "	");

        }
        System.out.print("Goles totales");
        System.out.println();
        
        for (int i = 0; i<equipos.length; i++) {
            System.out.print(equipos[i].getNombre());
            System.out.print("          ");
           
            for (int j = 0; j<equipos[i].getGoles().length; j++) {
                System.out.print(equipos[i].getGoles()[j]);
                System.out.print("	");
            }
            System.out.print(equipos[i].getGolesTotales());
            System.out.println();
        }
    }

    public void listaOrdenada() {
        
        System.out.println("Lista ordenada por orden de menor numero de goles: ");
        
        for (int i = 0; i<equipos.length - 1; i++) {
            for (int j = i + 1; j<equipos.length; j++) {
                if (equipos[i].getGolesTotales() > equipos[j].getGolesTotales()) {
                    Equipo aux = equipos[i];
                    equipos[i] = equipos[j];
                    equipos[j] = aux;
                }

            }
        }
        for (int i = 0; i < equipos.length; i++) {
            System.out.println(equipos[i].getNombre() + "           	" + equipos[i].getGolesTotales());
        }
    }

    
    public void equipoMasGolesJornada() {
        
        int numJornadas = equipos[0].getGoles().length;
        
        for (int i = 0; i < numJornadas; i++) {
            String equipoMasGoles = null;
            int maximoGoles = -1;
            
            for (int j = 0; j < equipos.length; j++) {
                
                int[] golesDelEquipo = equipos[j].getGoles();
                int golesDeLaJornada = golesDelEquipo[i];
                
                if (golesDeLaJornada > maximoGoles) {
                    maximoGoles = golesDeLaJornada;
                    equipoMasGoles = equipos[j].getNombre();
                }
            }
            System.out.println("El " + equipoMasGoles + " es el equipo que mas goles marco en la jornada  " + (i + 1) + " con " + maximoGoles + " goles.");
        }
    }

    public void equipoYJornadaDeMasGoles() {
        
        int numJornadas = equipos[0].getGoles().length;
        String equipoMasGoles = null;
        int maximoGoles = -1;
        int maximaJornada=-1;
        
        for (int i = 0; i< numJornadas; i++) {
            for (int j = 0; j < equipos.length; j++) {
                
                int[] golesDelEquipo= equipos[j].getGoles();
                int golesDelEquipoEnLaJornada= golesDelEquipo[i];
                
                if (golesDelEquipoEnLaJornada > maximoGoles) {
                    maximoGoles = golesDelEquipoEnLaJornada;
                    equipoMasGoles = equipos[j].getNombre();
                    maximaJornada=i+1;
                }
            }
        }
        System.out.println("El " + equipoMasGoles + " es el que mas goles marco, en total " + maximoGoles + " y en la jornada "+maximaJornada);
    }
    
    public void consultaEquipoJornada(){
        
        String nomEquipo=PedirDatos.pedirString("Escribe el nombre del equipo");
        int jornada=PedirDatos.pedirInt("Escribe el numero de la jornada");
        
        for (int i = 0; i<equipos.length; i++) {
            
            if(equipos[i].getNombre().equalsIgnoreCase(nomEquipo)){
                int[] jornadas=equipos[i].getGoles();
                System.out.println("Los goles que marco el "+nomEquipo+" en la jornada "+jornada+" fueron en total: "+jornadas[jornada-1]);
            }
            
        }
        
    }
}
