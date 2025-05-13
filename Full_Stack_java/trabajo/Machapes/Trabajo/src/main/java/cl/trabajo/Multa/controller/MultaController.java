package cl.trabajo.Multa.controller;

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

import cl.trabajo.Multa.dto.MultaDTO;
import cl.trabajo.Multa.service.IMultaService;

@RequestMapping("/api/crud/multa")
@RestController
public class MultaController {
    @Autowired
    IMultaService multaService;

    @PostMapping
    public MultaDTO insertMultaDTO(@RequestBody MultaDTO multa) {

        MultaDTO aux = multaService.insertMultaDTO(multa);
        return aux;
    }

    @PutMapping("/{idMulta}")
    public MultaDTO updateMultaDTO(@PathVariable int idMulta, @RequestBody MultaDTO multa) {
        MultaDTO aux = multaService.updateMultaDTO(idMulta, multa);
        return aux;
    }

    @DeleteMapping("/{idMulta}")
    public MultaDTO deleteMultaDTO(@PathVariable int idMulta) {
        MultaDTO aux = multaService.deleteMultaDTO(idMulta);
        return aux;
    }

    @GetMapping
    public List<MultaDTO> getAll() {
        return multaService.getAll();
    }

    @GetMapping("/{idMulta}")
    public MultaDTO getByidMulta(@PathVariable int idMulta) {
        return multaService.getByidMulta(idMulta);
    }
}
