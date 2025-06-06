package cl.trabajo.Usuario.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.trabajo.Rol.dto.RolDTO;
import cl.trabajo.Rol.repository.RolRepository;
import cl.trabajo.Usuario.dto.UsuarioDTO;
import cl.trabajo.Usuario.repository.UsuarioRepository;
import cl.trabajo.Usuario.service.IUsuarioService;

@Service
public class UsuarioService implements IUsuarioService {
    @Autowired
    UsuarioRepository repo;

    @Autowired
    private RolRepository rolRepo;

    @Override
    public UsuarioDTO insertUsuariDto(UsuarioDTO usuario) {
        // Obtener el Rol completo desde la base de datos usando el idRol
        RolDTO rolCompleto = rolRepo.findById(usuario.getRol().getIdRol()).orElse(null);
        usuario.setRol(rolCompleto); // Reemplazar con el objeto completo

        return repo.save(usuario);
    }

    @Override
    public UsuarioDTO updateUsuarioDTO(int idUsuario, UsuarioDTO usuario) {
        usuario.setIdUsuario(idUsuario);
        UsuarioDTO aux = repo.save(usuario);
        return aux;
    }

    @Override
    public UsuarioDTO deleteUsuarioDTO(int idUsuario) {
        repo.deleteById(idUsuario);
        return null;
    }

    @Override
    public List<UsuarioDTO> getAll() {
        List<UsuarioDTO> aux = new ArrayList<>();
        repo.findAll().forEach(aux::add);
        return aux;
    }

    @Override
    public UsuarioDTO getByidUsuario(int idUsuario) {
        return repo.findById(idUsuario).get();
    }
}
