/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dam.logica;

import com.dam.gestionvuelos.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

 
/**
 *
 * @author diegoip
 */
public class LogicaNegocio {
    
    public static void Inicialize() {
        InicializeAereopuerto();
        InicializeMunicipios();
        
    }
     public static void InicializeAereopuerto() {
         addAeropuerto(new Aeropuerto("","",""));
    }
    
    //LogicaAeropuerto
    public static ValidationResult addAeropuerto(Aeropuerto a) {
        ValidationResult ret = new ValidationResult(true, "");
        Aeropuerto aux = getAeropuertoByCodigoIATA(a.getCodigoIATA());
        
        if(aux==null){
        lstAeropuerto.add(a);
        }
        else
       ret = new ValidationResult(false,"ya existe el aeropuerto");
        return ret;
    }
     
    private static  List<Aeropuerto> lstAeropuerto = new ArrayList <Aeropuerto>();          
    
    public static  List<Aeropuerto> getAllAeropuertos(){
        return new ArrayList <Aeropuerto>();          
    }
    
    public static Aeropuerto getAeropuertoByCodigoIATA(String codigoIATA) {
        //Obtener Aeropuerto de lista
        Aeropuerto valorSalida=null;
        for(Aeropuerto A: lstAeropuerto)
        {
            if(A.getCodigoIATA().equals(codigoIATA)){
                valorSalida=A;
                return valorSalida;
            }
        }
        return valorSalida;
    }
    public static Aeropuerto aeropuertoBase=getAeropuertoByCodigoIATA("OVD");
   
    public static void updateAeropuerto(String codigoIATA, Aeropuerto newComp) {
        Aeropuerto oldComp = getAeropuertoByCodigoIATA(codigoIATA);
        if(oldComp != null){
        oldComp.setCodigoIATA(newComp.getCodigoIATA());
        oldComp.setCodigoMunicipio(newComp.getCodigoMunicipio());
        oldComp.setNombre(newComp.getNombre());
        }
        else{
            System.out.println("este aeropuerto no existe");
        }}

//---------------------------------------------------------------------------------------------------
    
//LogicaCompañia
     public static void InicializeCompania() {
         addCompania(new CompaniasClass(0,"","","","","",""));
    }
    public static ValidationResult addCompania(CompaniasClass comp) {
        ValidationResult ret = new ValidationResult(true, "");
        CompaniasClass aux = getCompaniaByCodigo(comp.getCodigo());
        
        if(aux==null){
        lstCompania.add(comp);
        }
        else
       ret = new ValidationResult(false,"ya existe la compañia");
        return ret;
    }
     private static  List<CompaniasClass> lstCompania = new ArrayList <CompaniasClass>();
    
     public static  List<CompaniasClass> getAllCompania(){
        return new ArrayList <CompaniasClass>();          
    }
     
    
     public static CompaniasClass getCompaniaByPrefijo(int prefijo) {   
         CompaniasClass valorSalida=null;
        for(CompaniasClass C: lstCompania)
        {
            if(C.getPrefijo()==prefijo){
                valorSalida=C;
                return valorSalida;
            }
        }
        return valorSalida;
     }
    
    public static CompaniasClass getCompaniaByCodigo(String codigo) {
        CompaniasClass valorSalida=null;
        for(CompaniasClass C: lstCompania)
        {
            if(C.getCodigo().equals(codigo)){
                valorSalida=C;
                return valorSalida;
            }
        }
        return valorSalida;
    }
    
     public static void deleteCompaniaByCodigo(String codigo) {
        
        CompaniasClass delC = getCompaniaByCodigo(codigo);
        if (delC != null)
            lstCompania.remove(delC);
        
    }
    
     public static void updateCompania(String codigo, CompaniasClass newComp) {
        CompaniasClass oldComp = getCompaniaByCodigo(codigo);
        if(oldComp != null){
        oldComp.setPrefijo(newComp.getPrefijo());
        oldComp.setCodigo(newComp.getCodigo());
        oldComp.setNombre(newComp.getNombre());
        oldComp.setDirección(newComp.getDirección());
        oldComp.setMunicipio(newComp.getMunicipio());
        oldComp.setTelfInPas(newComp.getTelfInPas());
        oldComp.setTelfInAero(newComp.getTelfInPas());          
       
        }
        else{
            System.out.println("esta Compañia no existe");
        }
    }
     
    //---------------------------------------------------------------------------------------------
     
    //LogicaVueloBase
    private static  List<VuelosBase> lstVueloBase = new ArrayList <VuelosBase>();
    
    public static  List<VuelosBase> getAllVueloBase(){
        return new ArrayList <VuelosBase>();            
    }
    
    public static VuelosBase getVueloBaseCodigo(String codigo) {
     VuelosBase valorSalida=null;
        for(VuelosBase B: lstVueloBase)
        {
            if(B.getCodigoVuelo().equals(codigo)){
                valorSalida=B;
                return valorSalida;
            }
        }
        return valorSalida;
    }
    
    public static VuelosBase getVueloBaseByDiaSemana(char dia){
        return new VuelosBase(); 
    }
    
    public static VuelosBase getVueloBaseByOrigen(String codigoIATA){
        return new VuelosBase();    
    }

    public static VuelosBase getVueloBaseByDestino(String codigoIATA){
        return new VuelosBase(); 
    }
    public static Date getFecha(int horas,int minutos){
        return null;
    }
    public static void deleteVueloBase(String codigo) {
        
         VuelosBase delC = getVueloBaseCodigo(codigo);
        if (delC != null)
            lstVueloBase.remove(delC);
    }
     public static void deleteMunicipio(String codigo) {
        
         VuelosBase delC = getVueloBaseCodigo(codigo);
        if (delC != null)
            lstVueloBase.remove(delC);
    }
    public static void updateVueloBase(String codigo, VuelosBase newvb) {
        VuelosBase oldVb = getVueloBaseCodigo(codigo);
        if(oldVb != null){
        oldVb.setCodigoVuelo(newvb.getCodigoVuelo());
        oldVb.setNumeroPlazas(newvb.getNumeroPlazas());
       // oldVb.setHoraSalida(newvb.getHoraSalida());
       // oldVb.setHoraLlegada(newvb.getHoraLlegada());
        oldVb.setDiasOperacion(newvb.getDiasOperacion());
        oldVb.setAorigen(newvb.getAorigen());
        oldVb.setAdestino(newvb.getAdestino());
        }
        else{
            System.out.println("este Vuelo no existe");}
    }
    
//-----------------------------------------------------------------------------------------------

//LogicaVueloDiario

    
    
//----------------------------------------------------------------------------------------------- 
    
//Logica Municipios
    public static void InicializeMunicipios() {
         addCompania(new CompaniasClass(0,"","","","","",""));
    }
    
    private static  List<Municipio> lstMunicipio = new ArrayList <Municipio>();

     public static Municipio getMunicipioByCodigo(String codigo) {
        //Obtener Aeropuerto de lista
        Municipio valorSalida=null;
        for(Municipio M: lstMunicipio)
        {
            if(M.getCodigo().equals(codigo)){
                valorSalida=M;
                return valorSalida;
            }
        }
        return valorSalida;
    }
    
    public static ValidationResult addMunicipio(Municipio m) {
        ValidationResult ret = new ValidationResult(true, "");
        Municipio aux = getMunicipioByCodigo(m.getCodigo());
        
        if(aux==null){
        lstMunicipio.add(m);
        }
        else
       ret = new ValidationResult(false,"ya existe el municipio");
        return ret;
    }
    
     public static  List<Municipio> getAllMunicipio(){
        return new ArrayList <Municipio>();          
    }
}