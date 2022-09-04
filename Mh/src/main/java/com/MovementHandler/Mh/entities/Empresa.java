package com.MovementHandler.Mh.entities;

import java.util.Arrays;
import java.util.Date;

public class Empresa {

    private long idEmpresa;
    private String nombreEmpresa;
    private String documentoEmpresa;
    private String telefonoEmpresa;
    private String direccionEmpresa;
    private Usuario[] usuarios;
    private MovimientodeDinero[] transacciones;
    private String createdAt, updatedAt;

    public Empresa(long idEmpresa, String nombreEmpresa, String documentoEmpresa, String telefonoEmpresa, String direccionEmpresa, Usuario[] usuarios, MovimientodeDinero[] transacciones, String createdAt, String updatedAt) {
        this.idEmpresa = idEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.documentoEmpresa = documentoEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.usuarios = usuarios;
        this.transacciones = transacciones;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Empresa(long idEmpresa, String nombreEmpresa, String documentoEmpresa, String telefonoEmpresa, String direccionEmpresa, Usuario[] usuarios, String createdAt, String updatedAt) {
        this.idEmpresa = idEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.documentoEmpresa = documentoEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.usuarios = usuarios;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Empresa() {
    }

    public long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDocumentoEmpresa() {
        return documentoEmpresa;
    }

    public void setDocumentoEmpresa(String documentoEmpresa) {
        this.documentoEmpresa = documentoEmpresa;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public Usuario[] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario[] usuarios) {
        this.usuarios = usuarios;
    }

    public MovimientodeDinero[] getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(MovimientodeDinero[] transacciones) {
        this.transacciones = transacciones;
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
        return "Empresa{" +
                "idEmpresa=" + idEmpresa +
                ", nombreEmpresa='" + nombreEmpresa + '\'' +
                ", documentoEmpresa='" + documentoEmpresa + '\'' +
                ", telefonoEmpresa='" + telefonoEmpresa + '\'' +
                ", direccionEmpresa='" + direccionEmpresa + '\'' +
                ", usuarios=" + Arrays.toString(usuarios) +
                ", transacciones=" + Arrays.toString(transacciones) +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}