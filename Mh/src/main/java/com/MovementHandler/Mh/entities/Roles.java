package com.MovementHandler.Mh.entities;

public class Roles {
    private String rol;

    public Roles (int op){
        if (op == 1){
            this.rol= "Admin";
        }
        else if (op == 2) {
            this.rol = "Operario";
        }
    }

    public String getRol() {
        return rol;
    }

    public void setRol(int op) {
        if (op == 1){
            this.rol= "Admin";
        }
        else if (op == 2) {
            this.rol = "Operario";
        }
    }
}
