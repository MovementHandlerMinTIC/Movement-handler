package com.MovementHandler.Mh.Controller;

import com.MovementHandler.Mh.entities.Empleado;
import com.MovementHandler.Mh.services.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmpleadoController {

    @Autowired
    public IEmpleadoService empleadoService;

    @GetMapping("/empleado/{id}")
    public Optional<Empleado> findById(@PathVariable long id){
        return empleadoService.findById(id);
    }
    @GetMapping("/empleado")
    public List<Empleado> findAll(){
        return  empleadoService.findAll();
    }
    @PostMapping("/empleado")
    public Empleado createEmpleado(@RequestBody Empleado empleado){
        return empleadoService.createEmpleado(empleado);
    }
    @PutMapping("/empleado/{id}")
    public Empleado updateEmpleado(@PathVariable long id, @RequestBody Empleado empleado){
        return empleadoService.updateEmpleado(id, empleado);
    }
    @DeleteMapping("/empleado/{id}")
    public void deleteEmpleado(@PathVariable long id) {
        empleadoService.deleteEmpleado(id);
    }
}
