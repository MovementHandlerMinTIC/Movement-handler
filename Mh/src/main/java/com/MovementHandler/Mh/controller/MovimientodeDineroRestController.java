package com.MovementHandler.Mh.controller;


import com.MovementHandler.Mh.entities.Empleado;
import com.MovementHandler.Mh.entities.MovimientoDeDinero;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MovimientodeDineroRestController {
    @GetMapping("/MovimientoDinero/{id}")
    public MovimientoDeDinero findById(@PathVariable long id) {
        MovimientoDeDinero movimientoDinero = new MovimientoDeDinero();
        movimientoDinero.setMontoMovimiento(170.000);
        movimientoDinero.setConceptoMovimiento("insumos");
        movimientoDinero.setUsuarioEncargado("administrador");
        movimientoDinero.setIdMovimientoDeDinero(1);
        return movimientoDinero;


    }

    @GetMapping("/MovimientoDinero/{id}")
    public List<MovimientoDeDinero> findAll() {
        List<MovimientoDeDinero> movimientoDinero = new ArrayList<>();
        MovimientoDeDinero movimientoDinero1 = new MovimientoDeDinero();
        movimientoDinero1.setMontoMovimiento(170.000);
        movimientoDinero1.setConceptoMovimiento("insumos");
        movimientoDinero1.setUsuarioEncargado("administrador");
        movimientoDinero1.setIdMovimientoDeDinero(1);

        MovimientoDeDinero movimientoDinero2 = new MovimientoDeDinero();
        movimientoDinero2.setMontoMovimiento(200.000);
        movimientoDinero2.setConceptoMovimiento("Papeleria");
        movimientoDinero2.setUsuarioEncargado("operario");
        movimientoDinero2.setIdMovimientoDeDinero(2);
        return movimientoDinero;
    }

    @PostMapping("/MovimientoDinero/{id}")
    public MovimientoDeDinero create(@RequestBody MovimientoDeDinero movimientoDinero) {
        MovimientoDeDinero newMovimientoDeDinero = new MovimientoDeDinero();
        newMovimientoDeDinero.setIdMovimientoDeDinero(movimientoDinero.getIdMovimientoDeDinero());
        newMovimientoDeDinero.setConceptoMovimiento(movimientoDinero.getConceptoMovimiento());
        newMovimientoDeDinero.setMontoMovimiento(movimientoDinero.getMontoMovimiento());
        newMovimientoDeDinero.setUsuarioEncargado(movimientoDinero.getUsuarioEncargado());
        return newMovimientoDeDinero;
    }

    @PutMapping("/movimientoDinero/{id}")
    public MovimientoDeDinero update(@PathVariable int id, @RequestBody MovimientoDeDinero movimientodinero){
        MovimientoDeDinero upmovimientodinero = findById(id);
        upmovimientodinero.setConceptoMovimiento(movimientodinero.getConceptoMovimiento());
        upmovimientodinero.setMontoMovimiento(movimientodinero.getMontoMovimiento());
        return upmovimientodinero;
    }

    @DeleteMapping("/movimientoDinero/{id}")
    public void  delete(@PathVariable long id){MovimientoDeDinero delMovimientoDeDinero = findById(id);}

}
