package com.upao.msmatriculas.domain.services;

import com.upao.msmatriculas.domain.entities.Mensaje;

import java.util.List;

public interface MensajeService {
    boolean Registrar(Mensaje mensaje);
    List<Mensaje> ListarTodos();

    void eliminar(String id);

}
