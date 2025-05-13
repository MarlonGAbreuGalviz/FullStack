package cl.trabajo.Prestamo.repository;

import org.springframework.data.repository.CrudRepository;

import cl.trabajo.Prestamo.dto.PrestamoDTO;

public interface PrestamoRepository extends CrudRepository<PrestamoDTO, Integer> {

}
