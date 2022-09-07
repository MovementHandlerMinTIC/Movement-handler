package com.MovementHandler.Mh.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Perfiles")
public class Perfil {
    @Id
    @Column(name = "id_perfil", nullable = false, unique = true)
    private String idProfile;
    @Column(name = "imagen_perfil")
    private String image;
    @Column(name = "telefono_perfil", nullable = false)
    private String phone;
    @OneToOne
    @JoinColumn(name = "id_empleado")
    private Empleado empleado;
    @Column(name = "fecha_creacion", nullable = false)
    private LocalDate createdAt;
    @Column(name = "fecha_actualizacion")
    private LocalDate updatedAt;

    public Perfil(String idProfile, String image, String phone, Empleado empleado, LocalDate createdAt, LocalDate updatedAt) {
        this.idProfile = idProfile;
        this.image = image;
        this.phone = phone;
        this.empleado = empleado;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Perfil (){

    }

    public String getIdProfile() {
        return idProfile;
    }

    public void setIdProfile(String idProfile) {
        this.idProfile = idProfile;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Perfil{" +
                "idProfile='" + idProfile + '\'' +
                ", image='" + image + '\'' +
                ", phone='" + phone + '\'' +
                ", empleado=" + empleado +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                '}';
    }
}
