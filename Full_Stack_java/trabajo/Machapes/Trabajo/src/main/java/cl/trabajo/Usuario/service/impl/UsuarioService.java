package cl.trabajo.Usuario.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.trabajo.Usuario.dto.UsuarioDTO;
import cl.trabajo.Usuario.repository.UsuarioRepository;
import cl.trabajo.Usuario.service.IUsuarioService;

@Service
public class UsuarioService implements IUsuarioService {
    @Autowired
    UsuarioRepository repo;

    @Override
    public UsuarioDTO insertUsuariDto(UsuarioDTO usuario) {
        UsuarioDTO aux = repo.save(usuario);
        return aux;
    }

    @Override
    public UsuarioDTO updateUsuarioDTO(int idRol, UsuarioDTO usuario) {
        usuario.setIdRol(idRol);
        UsuarioDTO aux = repo.save(usuario);
        return aux;
    }

    @Override
    public UsuarioDTO deleteUsuarioDTO(int idRol) {
        repo.deleteById(idRol);
        return null;
    }

    @Override
    public List<UsuarioDTO> getAll() {
        List<UsuarioDTO> aux = new ArrayList<>();
        repo.findAll().forEach(aux::add);
        return aux;
    }

    @Override
    public UsuarioDTO getByidRol(int idRol) {
        return repo.findById(idRol).get();
    }
}
