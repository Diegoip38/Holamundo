/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dam.gestionvuelos;

/**
 *
 * @author diegoip
 */
public class Aeropuerto {
 
    private String codigoIATA;
    private String codigoMunicipio;
    private String nombre;

    public Aeropuerto() 
    {
        
    }

    public Aeropuerto(String codigoIATA, String codigoMunicipio,String nombre) 
    {
        this.codigoIATA = codigoIATA;
        this.codigoMunicipio = codigoMunicipio;
        this.nombre=nombre;
    }

    public String getCodigoIATA() {
        return codigoIATA;
    }

    public void setCodigoIATA(String codigoIATA) {
        this.codigoIATA = codigoIATA;
    }

    public String getCodigoMunicipio() {
        return codigoMunicipio;
    }

    public void setCodigoMunicipio(String codigoMunicipio) {
        this.codigoMunicipio = codigoMunicipio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Aeropuerto{" + "codigoIATA=" + codigoIATA + ", codigoMunicipio=" + codigoMunicipio + ", nombre=" + nombre + '}';
    }
    
    
    
}
