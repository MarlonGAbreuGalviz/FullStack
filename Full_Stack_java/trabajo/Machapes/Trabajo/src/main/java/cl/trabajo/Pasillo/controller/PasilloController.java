package cl.trabajo.Pasillo.controller;

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

import cl.trabajo.Pasillo.dto.PasilloDTO;
import cl.trabajo.Pasillo.service.IPasilloService;

@RequestMapping("/api/crud/pasillo")
@RestController
public class PasilloController {
    @Autowired
    IPasilloService PasilloService;

    @PostMapping
    public PasilloDTO insertPasilloDTO(@RequestBody PasilloDTO pasillo) {
        PasilloDTO aux = PasilloService.insertPasilloDTO(pasillo);
        return aux;
    }

    @PutMapping("/{idPasillo}")
    public PasilloDTO updatePasilloDTO(@PathVariable int idPasillo, @RequestBody PasilloDTO pasillo) {
        PasilloDTO aux = PasilloService.updatePasilloDTO(idPasillo, pasillo);
        return aux;
    }

    @DeleteMapping("/{idPasillo}")
    public PasilloDTO deletePasilloDTO(@PathVariable int idPasillo) {
        PasilloDTO aux = PasilloService.deletePasilloDTO(idPasillo);
        return aux;
    }

    @GetMapping
    public List<PasilloDTO> getAll() {
        return PasilloService.getAll();
    }

    @GetMapping("/{idPasillo}")
    public PasilloDTO getByidPasillo(@PathVariable int idPasillo) {
        return PasilloService.getByidPasillo(idPasillo);
    }
}

