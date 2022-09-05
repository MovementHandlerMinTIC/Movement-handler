package com.MovementHandler.Mh.entities;


import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor

public class MovimientoDeDinero {
    private double montoMovimiento; 
    private String conceptoMovimiento, usuarioEncargado;
    private long idMovimientoDeDinero;

    public MovimientoDeDinero() {

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

    public void setUsuarioEncargado(String usuarioEncargado) {
        this.usuarioEncargado = usuarioEncargado;
    }

    public long getIdMovimientoDeDinero() {
        return idMovimientoDeDinero;
    }

    public void setIdMovimientoDeDinero(long idMovimientoDeDinero) {
        this.idMovimientoDeDinero = idMovimientoDeDinero;
    }


}