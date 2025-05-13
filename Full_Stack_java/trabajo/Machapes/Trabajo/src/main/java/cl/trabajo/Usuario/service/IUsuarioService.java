package cl.trabajo.Usuario.service;

import java.util.List;

import cl.trabajo.Usuario.dto.UsuarioDTO;

public interface IUsuarioService {
    UsuarioDTO insertUsuariDto(UsuarioDTO usuario);

    UsuarioDTO updateUsuarioDTO(int idRol, UsuarioDTO usuario);

    UsuarioDTO deleteUsuarioDTO(int idRol);

    List<UsuarioDTO> getAll();

    UsuarioDTO getByidRol(int idRol);
}
