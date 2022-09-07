package com.MovementHandler.Mh.services;

import com.MovementHandler.Mh.Repository.IPerfilRepository;
import com.MovementHandler.Mh.entities.Perfil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PerfilService implements IPerfilService{

    @Autowired
    IPerfilRepository perfilRepository;

    @Override
    public Perfil findById(String id) {
        Optional<Perfil> perfil = perfilRepository.findById(id);
        return perfil.get();
    }

    @Override
    public List<Perfil> findAll(){
        List<Perfil> perfiles = (List<Perfil>) perfilRepository.findAll();
        return perfiles;
    }

    @Override
    public Perfil createPerfil(Perfil perfil) {
        Perfil newPerfil = perfilRepository.save(perfil);
        return newPerfil;
    }

    @Override
    public Perfil updatePerfil(String id, Perfil perfil) {
        Perfil putPerfil = perfilRepository.save(perfil);
        return putPerfil;
    }

    @Override
    public void deletePerfil(String id) {
        perfilRepository.deleteById(id);
    }
}
