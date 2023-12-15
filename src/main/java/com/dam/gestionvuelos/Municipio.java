/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dam.gestionvuelos;

/**
 *
 * @author diegoip
 */
public class Municipio {
    private String codigo;
    private String nombre;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
    public Municipio(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }    

    @Override
    public String toString() {
        return "Municipio{" + "codigo=" + codigo + ", nombre=" + nombre + '}';
    }
    
    
}
