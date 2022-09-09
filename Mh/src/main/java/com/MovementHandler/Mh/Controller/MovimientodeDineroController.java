package com.MovementHandler.Mh.Controller;

import com.MovementHandler.Mh.entities.MovimientodeDinero;
import com.MovementHandler.Mh.services.IEmpresaService;
import com.MovementHandler.Mh.services.IMovimientodeDineroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class MovimientodeDineroController {
    @Autowired
    private IMovimientodeDineroService movimientodeDineroService;
    @Autowired
    private IEmpresaService empresaService;



    @GetMapping("/transaccion/{id}")
    public Optional<MovimientodeDinero> findById (@PathVariable long id){
        return movimientodeDineroService.findById(id);
    }
    @GetMapping("/transaccion")
    public List<MovimientodeDinero> findAll(){
        return movimientodeDineroService.findAll();
    }

    @GetMapping("/empresa/{id}/transaccion")
    public List<MovimientodeDinero> findByidEmpresa(@PathVariable long id) {

        return movimientodeDineroService.findByempresa(empresaService.findById(id));
    }
    @PostMapping ("/transaccion")
    public MovimientodeDinero createMovimientodeDinero(@RequestBody MovimientodeDinero movimientodeDinero){
        return movimientodeDineroService.createMovimientodeDinero(movimientodeDinero);
    }
    @PatchMapping("/transaccion/{id}")
    public MovimientodeDinero updateMovimientodeDinero(@PathVariable long id, @RequestBody MovimientodeDinero movimientodeDinero){
        return movimientodeDineroService.updateMovimientodeDinero(id, movimientodeDinero);
    }
    @DeleteMapping("/transaccion/{id}")
    public void deleteMovimientodeDinero(@PathVariable long id){
        movimientodeDineroService.deleteMovimientodeDinero(id);
    }
}
