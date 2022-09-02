package com.MovementHandler.Mh.entities;
public class Empleado {
    private String nombreEmpleado, correoEmpleado, empresaEmpleado, rolEmpleado;
    private  long idEmpleado;

    public Empleado(long idEmpleado,String nombreEmpleado, String correoEmpleado, String empresaEmpleado, String rolEmpleado){
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado=nombreEmpleado;
        this.correoEmpleado=correoEmpleado;
        this.empresaEmpleado=empresaEmpleado;
        this.rolEmpleado=rolEmpleado;

    }

    public Empleado() {
    }

    public long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public String getEmpresaEmpleado() {
        return empresaEmpleado;
    }

    public void setEmpresaEmpleado(String empresaEmpleado) {
        this.empresaEmpleado = empresaEmpleado;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }

}