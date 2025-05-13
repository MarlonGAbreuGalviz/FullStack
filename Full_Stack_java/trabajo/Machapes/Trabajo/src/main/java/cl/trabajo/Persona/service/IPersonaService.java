package cl.trabajo.Persona.service;

import java.util.List;

import cl.trabajo.Persona.dto.PersonaDTO;

public interface IPersonaService {
    PersonaDTO insertPersonaDTO(PersonaDTO persona);

    PersonaDTO updatePersonaDTO(int rut, PersonaDTO persona);

    PersonaDTO deletePersonaDTO(int rut);

    List<PersonaDTO> getAll();

    PersonaDTO getByRut(int rut);
}
