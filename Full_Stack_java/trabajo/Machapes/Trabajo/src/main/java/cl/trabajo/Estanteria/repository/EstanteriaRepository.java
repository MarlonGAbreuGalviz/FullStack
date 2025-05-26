package cl.trabajo.Estanteria.repository;

import org.springframework.data.repository.CrudRepository;

import cl.trabajo.Estanteria.dto.EstanteriaDTO;

public interface EstanteriaRepository extends CrudRepository<EstanteriaDTO, Integer> {

}
