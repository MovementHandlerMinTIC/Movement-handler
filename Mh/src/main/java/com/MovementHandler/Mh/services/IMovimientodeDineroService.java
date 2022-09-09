package com.MovementHandler.Mh.services;

import com.MovementHandler.Mh.entities.Empresa;
import com.MovementHandler.Mh.entities.MovimientodeDinero;

import java.util.List;
import java.util.Optional;

public interface IMovimientodeDineroService {

    Optional<MovimientodeDinero> findById(long id);
    List<MovimientodeDinero> findAll();
    List<MovimientodeDinero> findByempresa(Empresa idEmpresa);
    MovimientodeDinero createMovimientodeDinero(MovimientodeDinero movimientodeDinero);
    MovimientodeDinero updateMovimientodeDinero(long id, MovimientodeDinero movimientodeDinero);
    void deleteMovimientodeDinero(long id);
}
