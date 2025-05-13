package cl.harrys.bd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.harrys.bd.dto.PerritoDTO;

@Repository
public interface PerritoRepository extends CrudRepository<PerritoDTO,String> {

}
