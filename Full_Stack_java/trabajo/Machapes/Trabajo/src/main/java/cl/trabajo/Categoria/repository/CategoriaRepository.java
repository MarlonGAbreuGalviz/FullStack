package cl.trabajo.Categoria.repository;

import org.springframework.data.repository.CrudRepository;

import cl.trabajo.Categoria.dto.CategoriaDTO;

public interface CategoriaRepository extends CrudRepository<CategoriaDTO, Integer> {

}
