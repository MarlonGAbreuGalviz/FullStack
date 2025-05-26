package cl.trabajo.Piso.controller;

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

import cl.trabajo.Piso.dto.PisoDTO;
import cl.trabajo.Piso.service.IPisoService;

@RequestMapping("/api/crud/piso")
@RestController
public class PisoController {
    @Autowired
    IPisoService PisoService;

    @PostMapping
    public PisoDTO insertPisoDTO(@RequestBody PisoDTO piso) {
        PisoDTO aux = PisoService.insertPisoDTO(piso);
        return aux;
    }

    @PutMapping("/{idPiso}")
    public PisoDTO updatePisoDTO(@PathVariable int idPiso, @RequestBody PisoDTO piso) {
        PisoDTO aux = PisoService.updatePisoDTO(idPiso, piso);
        return aux;
    }

    @DeleteMapping("/{idPiso}")
    public PisoDTO deletePisoDTO(@PathVariable int idPiso) {
        PisoDTO aux = PisoService.deletePisoDTO(idPiso);
        return aux;
    }

    @GetMapping
    public List<PisoDTO> getAll() {
        return PisoService.getAll();
    }

    @GetMapping("/{idPiso}")
    public PisoDTO getByidPiso(@PathVariable int idPiso) {
        return PisoService.getByidPiso(idPiso);
    }
}
