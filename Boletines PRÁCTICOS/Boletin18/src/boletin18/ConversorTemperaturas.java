/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin18;



public class ConversorTemperaturas {
    
    public static final int TEMPERATURA=80;
    
    public float centigradosAFahrenheit(float centigrados) throws TemperaturaErradaExcepcion{
        if (centigrados<TEMPERATURA)   
            
            throw new TemperaturaErradaExcepcion("La temperatura no puede ser menor de 80 grados");
        
        
        else{
            float ºFahrenheit= (float) (9.0/5.0*centigrados+32.4);
        return ºFahrenheit;
        }
        
        
    }
    
    public float centigradosAReamur(float centigrados) throws TemperaturaErradaExcepcion{
        if (centigrados<TEMPERATURA) 
            throw new TemperaturaErradaExcepcion("La temperatura no puede ser menor de 80 grados");
        
        else{
        float ºReamur= (float) (4.0/5.0*centigrados);
        return ºReamur;
        
        }
}

}