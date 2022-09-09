package com.MovementHandler.Mh.Controller;

import com.MovementHandler.Mh.Repository.IPerfilRepository;
import com.MovementHandler.Mh.entities.Perfil;
import com.MovementHandler.Mh.services.IPerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PerfilController {

    @Autowired
    private IPerfilService perfilService;

    @GetMapping("/perfil/{id}")
    public Perfil findById(@PathVariable String id){
        return perfilService.findById(id);
    }
    @GetMapping("/perfil")
    public List<Perfil> findAll(){
        return  perfilService.findAll();
    }
    @PostMapping("/perfil")
    public Perfil createPerfil(@RequestBody Perfil perfil){
        return perfilService.createPerfil(perfil);
    }
    @PatchMapping("/perfil/{id}")
    public Perfil updatePerfil(@PathVariable String id, @RequestBody Perfil perfil){
        return perfilService.updatePerfil(id, perfil);
    }
    @DeleteMapping("/perfil/{id}")
    public void deletePerfil(@PathVariable String id){
        perfilService.deletePerfil(id);
    }
}
