package cl.trabajo.Usuario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.trabajo.Usuario.dto.UsuarioDTO;
import cl.trabajo.Usuario.service.IUsuarioService;

@RequestMapping("/api/crud/usuario")
@RestController
public class UsuarioController {
    @Autowired
    IUsuarioService usuarioService;

    @PostMapping
    public UsuarioDTO insertUsuarioDTO(@RequestBody UsuarioDTO usuario) {
        UsuarioDTO aux = usuarioService.insertUsuariDto(usuario);
        return usuarioService.getByidUsuario(aux.getIdUsuario()); // recarga desde BD
    }

    @PutMapping("/{idUsuario}")
    public UsuarioDTO updateUsuarioDTO(@PathVariable int idUsuario, @RequestBody UsuarioDTO usuario) {
        UsuarioDTO aux = usuarioService.updateUsuarioDTO(idUsuario, usuario);
        return aux;
    }

    @DeleteMapping("/{idUsuario}")
    public UsuarioDTO deleteUsuarioDTO(@PathVariable int idUsuario) {
        UsuarioDTO aux = usuarioService.deleteUsuarioDTO(idUsuario);
        return aux;
    }

    @GetMapping
    public List<UsuarioDTO> getAll() {
        return usuarioService.getAll();
    }

    @GetMapping("/{idUsuario}")
    public UsuarioDTO getByidRol(@PathVariable int idUsuario) {
        return usuarioService.getByidUsuario(idUsuario);
    }
}
