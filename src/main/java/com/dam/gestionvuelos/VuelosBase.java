/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.dam.gestionvuelos;

import java.util.Date;
/**
 *
 * @author Diegoip
 */
public class VuelosBase {

    private String codigoVuelo;
    private int numeroPlazas;
    private Date horaSalida;
    private Date horaLlegada;
    private String diasOperacion;
    private String aeropuertoOrigen;
    private String aeropuertoDestino;
    private Aeropuerto AeropuertoOrigenObj;
    private Aeropuerto AeropuertoDestinoObj;

    public VuelosBase() {
    }

    public VuelosBase(String codigoVuelo, int numeroPlazas, Date horaSalida, Date horaLlegada, String diasOperacion, String aeropuertoOrigen, String aeropuertoDestino) {
        this.codigoVuelo = codigoVuelo;
        this.numeroPlazas = numeroPlazas;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.diasOperacion = diasOperacion;
        this.aeropuertoOrigen = aeropuertoOrigen;
        this.aeropuertoDestino = aeropuertoDestino;
    }

    public VuelosBase(String codigoVuelo, int numeroPlazas, Date horaSalida, Date horaLlegada, String diasOperacion, Aeropuerto AeropuertoOrigenObj, Aeropuerto AeropuertoDestinoObj) {
        this.codigoVuelo = codigoVuelo;
        this.numeroPlazas = numeroPlazas;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.diasOperacion = diasOperacion;
        this.AeropuertoOrigenObj = AeropuertoOrigenObj;
        this.AeropuertoDestinoObj = AeropuertoDestinoObj;
    }

        
    
    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
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

    public String getDiasOperacion() {
        return diasOperacion;
    }

    public void setDiasOperacion(String diasOperacion) {
        this.diasOperacion = diasOperacion;
    }

    public String getOrigen() {
        return aeropuertoOrigen;
    }

    public void setOrigen(String origen) {
        this.aeropuertoOrigen = origen;
    }

    public String getDestino() {
        return aeropuertoDestino;
    }

    public void setDestino(String destino) {
        this.aeropuertoDestino = destino;
    }

    public Aeropuerto getAorigen() {
        return AeropuertoOrigenObj;
    }

    public void setAorigen(Aeropuerto Aorigen) {
        this.AeropuertoOrigenObj = Aorigen;
    }

    public Aeropuerto getAdestino() {
        return AeropuertoDestinoObj;
    }

    public void setAdestino(Aeropuerto Adestino) {
        this.AeropuertoDestinoObj = Adestino;
    }

    @Override
    public String toString() {
        return "VuelosBase{" + "codigoVuelo=" + codigoVuelo + ", numeroPlazas=" + numeroPlazas + ", horaSalida=" + horaSalida + ", horaLlegada=" + horaLlegada + ", diasOperacion=" + diasOperacion + ", aeropuertoOrigen=" + aeropuertoOrigen + ", aeropuertoDestino=" + aeropuertoDestino + ", AeropuertoOrigenObj=" + AeropuertoOrigenObj + ", AeropuertoDestinoObj=" + AeropuertoDestinoObj + '}';
    }
    
    
         
    
}
