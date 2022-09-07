package com.MovementHandler.Mh.entities;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Empleados")
public class Empleado {
<<<<<<< HEAD
    private String nombreEmpleado, correoEmpleado, empresaEmpleado, rolEmpleado;
    private  long idEmpleado;

    public Empleado(long idEmpleado,String nombreEmpleado, String correoEmpleado, String empresaEmpleado, String rolEmpleado){
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado=nombreEmpleado;
        this.correoEmpleado=correoEmpleado;
        this.empresaEmpleado=empresaEmpleado;
        this.rolEmpleado=rolEmpleado;

=======

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Empleado", nullable = false)
    private long idEmpleado;
    @Column(name = "nombre_empleado", nullable = false)
    private String nombreEmpleado;
    @Column(name = "correo_empleado", nullable = false)
    private String correoEmpleado;
    @OneToOne
    @JoinColumn(name = "id_perfil")
    private Perfil perfilEmpleado;
    @Column(name = "rol_empleado", nullable = false)
    private Enum_Roles rolEmpleado;
    @ManyToOne
    @JoinColumn(name = "id_Empresa")
    private  Empresa empresaEmpleado;
    @OneToMany
    @JoinColumn(name = "id_tansacciones")
    @OrderColumn
    private MovimientodeDinero[] transaccionesEmpleado;
    @Column(name = "fecha_actualizacion")
    private LocalDate updatedAt;
    @Column(name = "fecha_creacion", nullable = false)
    private LocalDate createdAt;
    public Empleado(long idEmpleado, String correoEmpleado, Perfil perfilEmpleado, Enum_Roles rolEmpleado, Empresa empresaEmpleado, MovimientodeDinero[] transaccionesEmpleado, LocalDate updatedAt, LocalDate createdAt, String nombreEmpleado) {
        this.idEmpleado = idEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.perfilEmpleado = perfilEmpleado;
        this.rolEmpleado = rolEmpleado;
        this.empresaEmpleado = empresaEmpleado;
        this.transaccionesEmpleado = transaccionesEmpleado;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.nombreEmpleado = nombreEmpleado;
>>>>>>> release
    }
    public Empleado() {
    }

    public long getIdEmpleado() {
        return idEmpleado;
<<<<<<< HEAD
    }

    public void setIdEmpleado(long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
=======
>>>>>>> release
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

    public Enum_Roles getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(Enum_Roles rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }

    public Empresa getEmpresaEmpleado() {
        return empresaEmpleado;
    }

    public void setEmpresaEmpleado(Empresa empresaEmpleado) {
        this.empresaEmpleado = empresaEmpleado;
    }

    public MovimientodeDinero[] getTransaccionesEmpleado() {
        return transaccionesEmpleado;
    }

    public void setTransacciónEmpleado(MovimientodeDinero[] transaccionesEmpleadonEmpleado) {
        this.transaccionesEmpleado = transaccionesEmpleadonEmpleado;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
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
                ", transacciónEmpleado=" + transaccionesEmpleado +
                ", updatedAt=" + updatedAt +
                ", createdAt=" + createdAt +
                ", nombreEmpleado='" + nombreEmpleado + '\'' +
                '}';
    }
}