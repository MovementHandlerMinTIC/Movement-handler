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
    
    public static void main(String[] args){
        MovimientodeDinero mov1= new MovimientodeDinero(10.000, "Venta de cuaderno", "Carolina Rojas");
        System.out.println("Monto del movimiento: "+ mov1.getMontoMovimiento());
        mov1.setMontoMovimiento(-10.0);
        System.out.println("Monto del movimiento: "+ mov1.getMontoMovimiento());
        System.out.println("Concepto del movimiento: "+ mov1.getConceptoMovimiento());
        mov1.setConceptoMovimiento("Venta de cuaderno especial");
        System.out.println("Concepto del movimiente: "+ mov1.conceptoMovimiento);
        System.out.println("Encargado del movimiento: "+ mov1.getUsuarioEncargado());

    }
}