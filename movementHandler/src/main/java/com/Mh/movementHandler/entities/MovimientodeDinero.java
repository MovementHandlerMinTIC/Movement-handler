package com.Mh.movementHandler.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor

public class    MovimientodeDinero {
    private double movimientoDinero,montoPositivo,montoNegativo;
    private String usuarioAdministrador;
    
}
