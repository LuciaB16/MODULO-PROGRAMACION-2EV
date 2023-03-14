/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin26;

import java.util.ArrayList;

public class Boletin26 {

    public static void main(String[] args) {
        
        Operaciones<Integer> listaEle= new Operaciones();
        ArrayList<Integer> listaEle1 = new ArrayList<>();
        
        listaEle.añadirElemento(2, listaEle1);
        listaEle.añadirElemento(6, listaEle1);
        listaEle.añadirElemento(1, listaEle1);
        listaEle.añadirElemento(8, listaEle1);
        listaEle.añadirElemento(5, listaEle1);
        
        listaEle.mostrar(listaEle1);
        
        listaEle.minimoLista(listaEle1);
        listaEle.maximoLista(listaEle1);
        listaEle.buscarObjeto(6, listaEle1);
        listaEle.eliminar(8, listaEle1);
        
        listaEle.mostrar(listaEle1);
        
        
    }
    
}
