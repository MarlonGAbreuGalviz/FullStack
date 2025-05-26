package cl.trabajo.CopiaLibro.repository;

import org.springframework.data.repository.CrudRepository;

import cl.trabajo.CopiaLibro.dto.CopiaLibroDTO;

public interface CopiaLibroRepository extends CrudRepository<CopiaLibroDTO, Integer> {

}