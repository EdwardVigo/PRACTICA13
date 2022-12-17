package com.upao.msmatriculas.infraestructure.repositories.implnosql;

import com.upao.msmatriculas.domain.entities.Mensaje;
import com.upao.msmatriculas.domain.repositories.MensajeRepository;
import com.upao.msmatriculas.infraestructure.repositories.MensajeNosqlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
@Component
public class MensajeNosqlRepositoryImpl implements MensajeRepository {
    @Autowired
    MensajeNosqlRepository mensajeNosqlRepository;
    @Override
    public boolean Registrar(Mensaje mensaje) {
        mensajeNosqlRepository.save(mensaje);
        return true;
    }
    @Override
    public List<Mensaje> buscarRemitente(String remitente){
        return mensajeNosqlRepository.findByremitente(remitente);
    }
    @Override
    public List<Mensaje> ListarTodos() {
        return mensajeNosqlRepository.findAll();

    }
    @Override
    public void eliminar(String id){
        mensajeNosqlRepository.deleteById(id);
    }
}
