package cl.trabajo.Sede.repository;

import org.springframework.data.repository.CrudRepository;

import cl.trabajo.Sede.dto.SedeDTO;

public interface SedeRepository extends CrudRepository<SedeDTO, Integer> {

}
