package com.MovementHandler.Mh.services;

import com.MovementHandler.Mh.entities.Empleado;

import java.util.List;
import java.util.Optional;

public interface IEmpleadoService {
   public Optional<Empleado> findById(long id);
    public List<Empleado> findAll();
    public Empleado createEmpleado(Empleado empleado);
    public Empleado updateEmpleado(long id, Empleado empleado);
    public void deleteEmpleado(long id);

    class EmpresaService {
    }
}
