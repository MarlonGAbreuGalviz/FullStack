package cl.trabajo.Multa.repository;

import org.springframework.data.repository.CrudRepository;

import cl.trabajo.Multa.dto.MultaDTO;

public interface MultaRepository extends CrudRepository<MultaDTO, Integer> {

}
