package cl.trabajo.Persona.repository;

import org.springframework.data.repository.CrudRepository;

import cl.trabajo.Persona.dto.PersonaDTO;

public interface PersonaRepository extends CrudRepository<PersonaDTO, Integer> {

}
