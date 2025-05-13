package cl.trabajo.Persona.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.trabajo.Persona.dto.PersonaDTO;
import cl.trabajo.Persona.repository.PersonaRepository;
import cl.trabajo.Persona.service.IPersonaService;

@Service
public class PersonaService implements IPersonaService {
    @Autowired
    PersonaRepository repo;

    @Override
    public PersonaDTO insertPersonaDTO(PersonaDTO persona) {
        PersonaDTO aux = repo.save(persona);
        return aux;
    }

    @Override
    public PersonaDTO updatePersonaDTO(int rut, PersonaDTO persona) {
        persona.setRut(rut);
        PersonaDTO aux = repo.save(persona);
        return aux;
    }

    @Override
    public PersonaDTO deletePersonaDTO(int rut) {
        repo.deleteById(rut);
        return null;
    }

    @Override
    public List<PersonaDTO> getAll() {
        List<PersonaDTO> aux = new ArrayList<>();
        repo.findAll().forEach(aux::add);
        return aux;
    }

    @Override
    public PersonaDTO getByRut(int rut) {
        return repo.findById(rut).get();
    }

}
