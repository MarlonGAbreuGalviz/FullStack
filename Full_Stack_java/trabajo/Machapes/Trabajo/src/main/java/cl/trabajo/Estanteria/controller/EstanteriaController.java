package cl.trabajo.Estanteria.controller;

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

import cl.trabajo.Estanteria.dto.EstanteriaDTO;
import cl.trabajo.Estanteria.service.IEstanteriaService;

@RequestMapping("/api/crud/estanteria")
@RestController
public class EstanteriaController {
    @Autowired
    IEstanteriaService EstanteriaService;

    @PostMapping
    public EstanteriaDTO insertEstanteriaDTO(@RequestBody EstanteriaDTO estanteria) {
        EstanteriaDTO aux = EstanteriaService.insertEstanteriaDTO(estanteria);
        return aux;
    }

    @PutMapping("/{idEstanteria}")
    public EstanteriaDTO updateEstanteriaDTO(@PathVariable int idEstanteria, @RequestBody EstanteriaDTO estanteria) {
        EstanteriaDTO aux = EstanteriaService.updateEstanteriaDTO(idEstanteria, estanteria);
        return aux;
    }

    @DeleteMapping("/{idEstanteria}")
    public EstanteriaDTO deleteEstanteriaDTO(@PathVariable int idEstanteria) {
        EstanteriaDTO aux = EstanteriaService.deleteEstanteriaDTO(idEstanteria);
        return aux;
    }

    @GetMapping
    public List<EstanteriaDTO> getAll() {
        return EstanteriaService.getAll();
    }

    @GetMapping("/{idEstanteria}")
    public EstanteriaDTO getByidEstanteria(@PathVariable int idEstanteria) {
        return EstanteriaService.getByidEstanteria(idEstanteria);
    }
}
