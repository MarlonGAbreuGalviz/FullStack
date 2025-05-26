package cl.trabajo.Pasillo.repository;

import org.springframework.data.repository.CrudRepository;

import cl.trabajo.Pasillo.dto.PasilloDTO;

public interface PasilloRepository extends CrudRepository<PasilloDTO, Integer> {

}