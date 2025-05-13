package cl.trabajo.Donacion.repository;

import org.springframework.data.repository.CrudRepository;

import cl.trabajo.Donacion.dto.DonacionDTO;

public interface DonacionRepository extends CrudRepository<DonacionDTO, Integer> {

}
