/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dam.gestionvuelos;

/**
 *
 * @author Diegoip
 */
public class CompaniasClass {
    
    private int prefijo;
    private String codigo;
    private String nombre;
    private String dirección;
    private String municipio;
    private String telfInPas;
    private String telfInAero;

    public CompaniasClass() 
    {
        
    }
    
    public CompaniasClass(int prefijo,String codigo, String nombre, String dirección, String municipio, String telfInPas, String telfInAero) 
    {
        this.prefijo = prefijo;
        this.codigo = codigo;
        this.nombre = nombre;
        this.dirección = dirección;
        this.municipio = municipio;
        this.telfInPas = telfInPas;
        this.telfInAero = telfInAero;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    
    public int getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(int prefijo) {
        this.prefijo = prefijo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getTelfInPas() {
        return telfInPas;
    }

    public void setTelfInPas(String telfInPas) {
        this.telfInPas = telfInPas;
    }

    public String getTelfInAero() {
        return telfInAero;
    }

    public void setTelfInAero(String telfInAero) {
        this.telfInAero = telfInAero;
    }

    @Override
    public String toString() {
        return "CompaniasClass{" + "prefijo=" + prefijo + ", codigo=" + codigo + ", nombre=" + nombre + ", direcci\u00f3n=" + dirección + ", municipio=" + municipio + ", telfInPas=" + telfInPas + ", telfInAero=" + telfInAero + '}';
    }
    
    
    
}
