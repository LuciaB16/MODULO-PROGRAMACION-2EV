/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin27;

public class Libro {
    
    private String nombre;
    private String autor;
    private float precio;
    private int unidades;

    public Libro() {
    }

    public Libro(String nombre, String autor, float precio, int unidades) {
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
        this.unidades = unidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", autor=" + autor + ", precio=" + precio + ", unidades=" + unidades;
    }
    
    
    
}
