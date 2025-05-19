package cl.trabajo.Rol.controller;

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

import cl.trabajo.Rol.dto.RolDTO;
import cl.trabajo.Rol.service.IRolService;

@RequestMapping("/api/crud/rol")
@RestController
public class RolController {
    @Autowired
    IRolService RolService;

    @PostMapping
    public RolDTO insertRolDTO(@RequestBody RolDTO Rol) {

        RolDTO aux = RolService.insertRolDTO(Rol);
        return aux;
    }

    @PutMapping("/{idRol}")
    public RolDTO updateRolDTO(@PathVariable int idRol, @RequestBody RolDTO Rol) {
        RolDTO aux = RolService.updateRolDTO(idRol, Rol);
        return aux;
    }

    @DeleteMapping("/{idRol}")
    public RolDTO deleteRolDTO(@PathVariable int idRol) {
        RolDTO aux = RolService.deleteRolDTO(idRol);
        return aux;
    }

    @GetMapping
    public List<RolDTO> getAll() {
        return RolService.getAll();
    }

    @GetMapping("/{idRol}")
    public RolDTO getByidRol(@PathVariable int idRol) {
        return RolService.getByidRol(idRol);
    }
}
