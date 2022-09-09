package com.MovementHandler.Mh.Repository;

import com.MovementHandler.Mh.entities.MovimientodeDinero;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface IMovimientodeDineroRepository  extends CrudRepository <MovimientodeDinero, Long>{
    @Transactional(readOnly = true)
    List<MovimientodeDinero> findByEmpresa(long idEmpresa);
}
