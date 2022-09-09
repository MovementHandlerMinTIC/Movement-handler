package com.MovementHandler.Mh.services;

import com.MovementHandler.Mh.entities.Perfil;

import java.util.List;

public interface IPerfilService {
    Perfil findById(String id);
    List<Perfil> findAll();
    Perfil createPerfil(Perfil perfil);
    Perfil updatePerfil(String id, Perfil perfil);
    void deletePerfil(String id);
}
