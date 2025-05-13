package cl.trabajo.Autor.repository;

import org.springframework.data.repository.CrudRepository;

import cl.trabajo.Autor.dto.AutorDTO;

public interface AutorRepository extends CrudRepository<AutorDTO, Integer> {

}
