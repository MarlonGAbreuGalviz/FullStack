package cl.trabajo.CopiaLibro.controller;

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

import cl.trabajo.CopiaLibro.dto.CopiaLibroDTO;
import cl.trabajo.CopiaLibro.service.ICopiaLibroService;

@RequestMapping("/api/crud/copiaLibro")
@RestController
public class CopiaLibroController {
    @Autowired
    ICopiaLibroService CopiaLibroService;

    @PostMapping
    public CopiaLibroDTO insertCopiaLibroDTO(@RequestBody CopiaLibroDTO copiaLibro) {
        CopiaLibroDTO aux = CopiaLibroService.insertCopiaLibroDTO(copiaLibro);
        return aux;
    }

    @PutMapping("/{idCopiaLibro}")
    public CopiaLibroDTO updateCopiaLibroDTO(@PathVariable int idCopiaLibro, @RequestBody CopiaLibroDTO copiaLibro) {
        CopiaLibroDTO aux = CopiaLibroService.updateCopiaLibroDTO(idCopiaLibro, copiaLibro);
        return aux;
    }

    @DeleteMapping("/{idCopiaLibro}")
    public CopiaLibroDTO deleteCopiaLibroDTO(@PathVariable int idCopiaLibro) {
        CopiaLibroDTO aux = CopiaLibroService.deleteCopiaLibroDTO(idCopiaLibro);
        return aux;
    }

    @GetMapping
    public List<CopiaLibroDTO> getAll() {
        return CopiaLibroService.getAll();
    }

    @GetMapping("/{idCopiaLibro}")
    public CopiaLibroDTO getByidCopiaLibro(@PathVariable int idCopiaLibro) {
        return CopiaLibroService.getByidCopiaLibro(idCopiaLibro);
    }
}
