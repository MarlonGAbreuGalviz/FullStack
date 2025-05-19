package cl.trabajo.Ubicacion.controller;

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

import cl.trabajo.Ubicacion.dto.UbicacionDTO;
import cl.trabajo.Ubicacion.service.IUbicacionService;

@RequestMapping("/api/crud/ubicacion")
@RestController
public class UbicacionController {
    @Autowired
    IUbicacionService UbicacionService;

    @PostMapping
    public UbicacionDTO insertUbicacionDTO(@RequestBody UbicacionDTO Ubicacion) {
        UbicacionDTO aux = UbicacionService.insertUbicacionDTO(Ubicacion);
        return aux;
    }

    @PutMapping("/{idUbicacion}")
    public UbicacionDTO updateUbicacionDTO(@PathVariable int idUbicacion, @RequestBody UbicacionDTO Ubicacion) {
        UbicacionDTO aux = UbicacionService.updateUbicacionDTO(idUbicacion, Ubicacion);
        return aux;
    }

    @DeleteMapping("/{idUbicacion}")
    public UbicacionDTO deleteUbicacionDTO(@PathVariable int idUbicacion) {
        UbicacionDTO aux = UbicacionService.deleteUbicacionDTO(idUbicacion);
        return aux;
    }

    @GetMapping
    public List<UbicacionDTO> getAll() {
        return UbicacionService.getAll();
    }

    @GetMapping("/{idUbicacion}")
    public UbicacionDTO getByidUbicacion(@PathVariable int idUbicacion) {
        return UbicacionService.getByidUbicacion(idUbicacion);
    }
}
