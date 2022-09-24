package com.MovementHandler.Mh.Controller.Front;

import com.MovementHandler.Mh.entities.Empleado;
import com.MovementHandler.Mh.entities.Empresa;
import com.MovementHandler.Mh.services.EmpleadoService;
import com.MovementHandler.Mh.services.IEmpleadoService;
import com.MovementHandler.Mh.services.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class EmpleadoController {

    @Autowired
    public IEmpleadoService empleadoService;

    @Autowired
    public IEmpresaService empresaService;

// EMPLEADOS

    @GetMapping("/VerEmpleados")
    public String viewempleado(Model model, @ModelAttribute("mensaje") String mensaje) {
        List<Empleado> Listaempleados = empleadoService.findAll();
        model.addAttribute("emplelist", Listaempleados);
        model.addAttribute("mensaje", mensaje);
        return "verEmpleado";

    }

    @GetMapping("/AgregarEmpleado")
    public String nuevoEmpleado(Model model, @ModelAttribute("mensaje") String mmensaje) {
        Empleado empl = new Empleado();
        model.addAttribute("empl", empl);
        model.addAttribute("mensaje", mmensaje);
        List<Empresa> listaempresas = empresaService.findAll();
        model.addAttribute("emprelist",listaempresas);
        return "agregarEmpleado"; //Llamar HTML

    }

}
