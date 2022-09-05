package com.MovementHandler.Mh.controller;

import com.MovementHandler.Mh.entities.Empleado;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;




import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpleadoRestController {
    @GetMapping("/empleado/{id}")
    public Empleado findById(@PathVariable int id){
        Empleado empleado = new Empleado();
        empleado.setIdEmpleado(id);
        empleado.setCorreoEmpleado("corrreo@correo.com");
        empleado.setRolEmpleado("Admin");
        empleado.setEmpresaEmpleado("Mintic");
        empleado.setNombreEmpleado("Argemiro");
        return  empleado;
    }

    @GetMapping("/empleado")
    public List<Empleado> findAll(){
        List<Empleado> empleados = new ArrayList<>();
        Empleado empleado1 = new Empleado();
        empleado1.setIdEmpleado(1);
        empleado1.setCorreoEmpleado("corrreo@correo.com");
        empleado1.setRolEmpleado("Admin");
        empleado1.setEmpresaEmpleado("Mintic");
        empleado1.setNombreEmpleado("Argemiro");
        empleados.add(empleado1);
        Empleado empleado2 = new Empleado();
        empleado2.setIdEmpleado(2);
        empleado2.setCorreoEmpleado("corrreo@correo.com");
        empleado2.setRolEmpleado("Operario");
        empleado2.setEmpresaEmpleado("Mintic");
        empleado2.setNombreEmpleado("Argemiro");
        empleados.add(empleado2);
        return empleados;
    }

    @PostMapping("/empleado")
    public Empleado createEmpleado(@RequestBody Empleado empleado){
        Empleado newEmpleado = new Empleado();
        newEmpleado.setIdEmpleado(empleado.getIdEmpleado());
        newEmpleado.setNombreEmpleado(empleado.getNombreEmpleado());
        newEmpleado.setEmpresaEmpleado(empleado.getEmpresaEmpleado());
        newEmpleado.setCorreoEmpleado(empleado.getCorreoEmpleado());
        newEmpleado.setRolEmpleado(empleado.getRolEmpleado());
        return  newEmpleado;
    }

    @PutMapping("/empleado/{id}")
    public Empleado updateEmpleado(@PathVariable int id, @RequestBody Empleado empleado){
        Empleado putEmpleado = findById(id);
        putEmpleado.setCorreoEmpleado(empleado.getCorreoEmpleado());
        putEmpleado.setRolEmpleado(empleado.getRolEmpleado());
        return putEmpleado;
    }

    @DeleteMapping("/empleado/{id}")
    public void  deleteEmpleado(@PathVariable int id){Empleado deleEmpleado = findById(id);}

}
