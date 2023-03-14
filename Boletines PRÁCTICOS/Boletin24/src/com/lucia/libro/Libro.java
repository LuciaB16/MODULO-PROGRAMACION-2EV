/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lucia.libro;

public class Libro implements Comparable {
    
    private String titulo;
    private String autor;
    private String isbn;
    private float prezo;
    private int unidades;

    public Libro() {
    }

    public Libro(String titulo, String autor, String isbn, float prezo, int unidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.prezo = prezo;
        this.unidades = unidades;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "titulo=" + titulo + ", autor=" + autor + ", ISBN=" + isbn + ", prezo=" + prezo + ", unidades=" + unidades;
    }
    
    
     @Override
        public int compareTo(Object o){
        Libro x = (Libro)o;
         
        if(this.titulo.compareToIgnoreCase(x.titulo)>0)
             return 1;
         
         else if(this.titulo.compareToIgnoreCase(x.titulo)<0)
              return -1;
         
             else
              return 0;
    }
    
    
}


