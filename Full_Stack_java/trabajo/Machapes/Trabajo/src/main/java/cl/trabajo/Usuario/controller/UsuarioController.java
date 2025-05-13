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
        return aux;
    }

    @PutMapping("/{idRol}")
    public UsuarioDTO updateUsuarioDTO(@PathVariable int idRol, @RequestBody UsuarioDTO usuario) {
        UsuarioDTO aux = usuarioService.updateUsuarioDTO(idRol, usuario);
        return aux;
    }

    @DeleteMapping("/{idRol}")
    public UsuarioDTO deleteUsuarioDTO(@PathVariable int idRol) {
        UsuarioDTO aux = usuarioService.deleteUsuarioDTO(idRol);
        return aux;
    }

    @GetMapping
    public List<UsuarioDTO> getAll() {
        return usuarioService.getAll();
    }

    @GetMapping("/{idRol}")
    public UsuarioDTO getByidRol(@PathVariable int idRol) {
        return usuarioService.getByidRol(idRol);
    }
}
