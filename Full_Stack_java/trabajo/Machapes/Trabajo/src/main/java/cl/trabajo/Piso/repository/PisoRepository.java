package cl.trabajo.Piso.repository;

import org.springframework.data.repository.CrudRepository;

import cl.trabajo.Piso.dto.PisoDTO;

public interface PisoRepository extends CrudRepository<PisoDTO, Integer> {

}
