/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplostring;

public class PruebasString {
    
       
    public int length(String nome){
        int numLetras= nome.length();
         return numLetras;     
    }
    
    public String toUpperCase(String nome){
        String nomMayus= nome.toUpperCase();
        return nomMayus;
    }
    
    public String toLowerCase(String nome){
        String nomMinus = nome.toLowerCase();
        return nomMinus;
    }
    
    public int compareTo(String nome){
        int comparar = nome.compareTo("Nabuconodosor");
        return comparar;
    }
    
    public int compareToIgnoreCase(String nome){
        int compararIg= nome.compareToIgnoreCase("NaBucoNodosor");
        return compararIg;
    }
    
      
    public void arrayString (String nome){
        char[] nomeArray = nome.toCharArray();
         for(int i=0; i<nomeArray.length;i++){
             System.out.println("Array con String= " +nomeArray[i]);
         }
                           
    }
    
    public String substring(String nome){
        String cortar = nome.substring(0, 4);//Tb se puede cortar por la letra poniendo 'c'
        return cortar;
    }
}
