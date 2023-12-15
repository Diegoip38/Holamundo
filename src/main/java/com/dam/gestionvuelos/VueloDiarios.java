/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dam.gestionvuelos;

import java.util.Date;

/**
 *
 * @author diegoip
 */
public class VueloDiarios {
    
    private String CodigoVueloBase;
    private VuelosBase vueloBase;
    private Date fechaVuelo;
    private Date horaSalida;
    private Date horaLlegada;
    private int plazasOcupadas;
    private float precio;
   

    public VueloDiarios() {
    }

    public VueloDiarios(VuelosBase vueloBase, Date fechaVuelo, Date horaSalida, Date horaLlegada, int plazasOcupadas, float precio) {
        this.vueloBase = vueloBase;
        this.fechaVuelo = fechaVuelo;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.plazasOcupadas = plazasOcupadas;
        this.precio = precio;
        
    }

    
    
    public VueloDiarios(String CodigoVueloBase, Date fechaVuelo, Date horaSalida, Date horaLlegada, int plazasOcupadas, float precio) {
        this.CodigoVueloBase = CodigoVueloBase;
        this.fechaVuelo = fechaVuelo;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.plazasOcupadas = plazasOcupadas;
        this.precio = precio;
    }

    public String getCodigoVueloBase() {
        return CodigoVueloBase;
    }

    public void setCodigoVueloBase(String CodigoVueloBase) {
        this.CodigoVueloBase = CodigoVueloBase;
    }

    public VuelosBase getVueloBase() {
        return vueloBase;
    }

    public void setVueloBase(VuelosBase vueloBase) {
        this.vueloBase = vueloBase;
    }

    public Date getFechaVuelo() {
        return fechaVuelo;
    }

    public void setFechaVuelo(Date fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Date getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(Date horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public int getPlazasOcupadas() {
        return plazasOcupadas;
    }

    public void setPlazasOcupadas(int plazasOcupadas) {
        this.plazasOcupadas = plazasOcupadas;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "VueloDiarios{" + "CodigoVueloBase=" + CodigoVueloBase + ", vueloBase=" + vueloBase + ", fechaVuelo=" + fechaVuelo + ", horaSalida=" + horaSalida + ", horaLlegada=" + horaLlegada + ", plazasOcupadas=" + plazasOcupadas + ", precio=" + precio + '}';
    }
    
    
    
}
