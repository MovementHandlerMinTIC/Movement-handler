package com.MovementHandler.Mh.entities;

import java.util.Date;

public class    MovimientodeDinero {

    private long idTransaccion;
    private String conceptoTransaccion;
    private float montoTransaccion;
    private Usuario usuario;
    private Empresa empresa;
    private String createdAt, updatedAt;

    public MovimientodeDinero(long idTransaccion, String conceptoTransaccion, float montoTransaccion, Usuario usuario, Empresa empresa, String createdAt, String updatedAt) {
        this.idTransaccion = idTransaccion;
        this.conceptoTransaccion = conceptoTransaccion;
        this.montoTransaccion = montoTransaccion;
        this.usuario = usuario;
        this.empresa = empresa;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public MovimientodeDinero() {
    }

    public long getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(long idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getConceptoTransaccion() {
        return conceptoTransaccion;
    }

    public void setConceptoTransaccion(String conceptoTransaccion) {
        this.conceptoTransaccion = conceptoTransaccion;
    }

    public float getMontoTransaccion() {
        return montoTransaccion;
    }

    public void setMontoTransaccion(float montoTransaccion) {
        this.montoTransaccion = montoTransaccion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "MovimientodeDinero{" +
                "idTransaccion=" + idTransaccion +
                ", conceptoTransaccion='" + conceptoTransaccion + '\'' +
                ", montoTransaccion=" + montoTransaccion +
                ", usuario=" + usuario +
                ", empresa=" + empresa +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}