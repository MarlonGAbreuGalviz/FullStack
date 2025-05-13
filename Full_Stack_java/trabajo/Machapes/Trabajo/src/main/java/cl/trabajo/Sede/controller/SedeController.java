package cl.trabajo.Sede.controller;

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

import cl.trabajo.Sede.dto.SedeDTO;
import cl.trabajo.Sede.service.ISedeService;

@RequestMapping("/api/crud/sede")
@RestController
public class SedeController {

    @Autowired
    ISedeService sedeService;

    @PostMapping
    public SedeDTO insertSedeDTO(@RequestBody SedeDTO sede) {

        SedeDTO aux = sedeService.insertSedeDTO(sede);
        return aux;
    }

    @PutMapping("/{idSede}")
    public SedeDTO updateSedeDTO(@PathVariable int idSede, @RequestBody SedeDTO sede) {
        SedeDTO aux = sedeService.updateSedeDTO(idSede, sede);
        return aux;
    }

    @DeleteMapping("/{idSede}")
    public SedeDTO deleteSedeDTO(@PathVariable int idSede) {
        SedeDTO aux = sedeService.deleteSedeDTO(idSede);
        return aux;
    }

    @GetMapping
    public List<SedeDTO> getAll() {
        return sedeService.getAll();
    }

    @GetMapping("/{idSede}")
    public SedeDTO getByidSede(@PathVariable int idSede) {
        return sedeService.getByidSede(idSede);
    }
}
