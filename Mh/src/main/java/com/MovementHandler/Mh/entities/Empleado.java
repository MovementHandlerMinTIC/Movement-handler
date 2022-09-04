package com.MovementHandler.Mh.entities;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
@Table(name="Empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idEmpleado;
    @Column(name = "nombre")
    private String nombreEmpleado;
    @Column(name = "correo")
    private String correoEmpleado;
    @Column(name = "perfil")
    private Perfil perfilEmpleado;
    @Column(name = "rol")
    private Roles rolEmpleado;
    @Column(name = "empresa")
    private  Empresa empresaEmpleado;
    @Column(name = "transaccion")
    private MovimientodeDinero transacciónEmpleado;
    @Column(name = "fecha_actualizacion")
    private String updatedAt;
    @Column(name = "fecha_creación")
    private String createdAt;
    public Empleado(long idEmpleado, String correoEmpleado, Perfil perfilEmpleado, Roles rolEmpleado, Empresa empresaEmpleado, MovimientodeDinero transacciónEmpleado, String updatedAt, String createdAt, String nombreEmpleado) {
        this.idEmpleado = idEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.perfilEmpleado = perfilEmpleado;
        this.rolEmpleado = rolEmpleado;
        this.empresaEmpleado = empresaEmpleado;
        this.transacciónEmpleado = transacciónEmpleado;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.nombreEmpleado = nombreEmpleado;
    }

    public Empleado() {
    }

    public long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public Perfil getPerfilEmpleado() {
        return perfilEmpleado;
    }

    public void setPerfilEmpleado(Perfil perfilEmpleado) {
        this.perfilEmpleado = perfilEmpleado;
    }

    public Roles getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(Roles rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }

    public Empresa getEmpresaEmpleado() {
        return empresaEmpleado;
    }

    public void setEmpresaEmpleado(Empresa empresaEmpleado) {
        this.empresaEmpleado = empresaEmpleado;
    }

    public MovimientodeDinero getTransacciónEmpleado() {
        return transacciónEmpleado;
    }

    public void setTransacciónEmpleado(MovimientodeDinero transacciónEmpleado) {
        this.transacciónEmpleado = transacciónEmpleado;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", correoEmpleado='" + correoEmpleado + '\'' +
                ", perfilEmpleado=" + perfilEmpleado +
                ", rolEmpleado=" + rolEmpleado +
                ", empresaEmpleado=" + empresaEmpleado +
                ", transacciónEmpleado=" + transacciónEmpleado +
                ", updatedAt=" + updatedAt +
                ", createdAt=" + createdAt +
                ", nombreEmpleado='" + nombreEmpleado + '\'' +
                '}';
    }
}