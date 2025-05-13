package cl.trabajo.Sede.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.trabajo.Sede.dto.SedeDTO;
import cl.trabajo.Sede.repository.SedeRepository;
import cl.trabajo.Sede.service.ISedeService;

@Service
public class SedeService implements ISedeService {
    @Autowired
    SedeRepository repo;

    @Override
    public SedeDTO insertSedeDTO(SedeDTO sede) {
        SedeDTO aux = repo.save(sede);
        return aux;
    }

    @Override
    public SedeDTO updateSedeDTO(int idSede, SedeDTO sede) {
        sede.setIdSede(idSede);
        SedeDTO aux = repo.save(sede);
        return aux;
    }

    @Override
    public SedeDTO deleteSedeDTO(int idSede) {
        repo.deleteById(idSede);
        return null;
    }

    @Override
    public List<SedeDTO> getAll() {
        List<SedeDTO> aux = new ArrayList<>();
        repo.findAll().forEach(aux::add);
        return aux;
    }

    @Override
    public SedeDTO getByidSede(int idSede) {
        return repo.findById(idSede).get();
    }
}
