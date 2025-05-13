package cl.trabajo.Libro.repository;

import org.springframework.data.repository.CrudRepository;

import cl.trabajo.Libro.dto.LibroDTO;

public interface LibroRepository extends CrudRepository<LibroDTO, Integer> {

}
