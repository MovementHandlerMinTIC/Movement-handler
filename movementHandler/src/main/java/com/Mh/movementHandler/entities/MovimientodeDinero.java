package com.Mh.movementHandler.entities;


//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;
//
//@Getter
//@Setter
//@ToString
//@AllArgsConstructor

public class    MovimientodeDinero {
    private double montoMovimiento; 
    private String conceptoMovimiento, usuarioEncargado;

    public MovimientodeDinero(double montoMovimiento, String conceptoMovimiento, String usuarioEncargado) {
        this.montoMovimiento = montoMovimiento;
        this.conceptoMovimiento = conceptoMovimiento;
        this.usuarioEncargado = usuarioEncargado;
    }

    public MovimientodeDinero() {
    }

    public double getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(double montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }
    
    public String getUsuarioEncargado() {
        return usuarioEncargado;
    }
    
    public void setUsuarioEncargado(String usuarioENcargado){
        this.usuarioEncargado = usuarioENcargado;
    }
    

}