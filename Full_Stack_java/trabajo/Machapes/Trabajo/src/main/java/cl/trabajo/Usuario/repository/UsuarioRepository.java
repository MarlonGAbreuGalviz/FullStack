package cl.trabajo.Usuario.repository;

import org.springframework.data.repository.CrudRepository;

import cl.trabajo.Usuario.dto.UsuarioDTO;

public interface UsuarioRepository extends CrudRepository<UsuarioDTO, Integer> {

}
