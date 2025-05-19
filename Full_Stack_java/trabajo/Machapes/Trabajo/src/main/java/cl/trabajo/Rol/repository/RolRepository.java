package cl.trabajo.Rol.repository;

import org.springframework.data.repository.CrudRepository;

import cl.trabajo.Rol.dto.RolDTO;

public interface RolRepository extends CrudRepository<RolDTO, Integer> {

}
