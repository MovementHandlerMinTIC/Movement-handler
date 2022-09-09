package com.MovementHandler.Mh.Repository;

import com.MovementHandler.Mh.entities.Empresa;
import com.MovementHandler.Mh.entities.MovimientodeDinero;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IMovimientodeDineroRepository  extends CrudRepository <MovimientodeDinero, Long>{
    @Transactional(readOnly = true)
    List<MovimientodeDinero> findByempresa(Empresa idEmpresa);
}
