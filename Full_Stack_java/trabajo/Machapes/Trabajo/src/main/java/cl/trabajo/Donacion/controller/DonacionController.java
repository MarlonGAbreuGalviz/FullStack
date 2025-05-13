package cl.trabajo.Donacion.controller;

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

import cl.trabajo.Donacion.dto.DonacionDTO;
import cl.trabajo.Donacion.service.IDonacionService;

@RequestMapping("/api/crud/donacion")
@RestController
public class DonacionController {
    @Autowired
    IDonacionService donacionService;

    @PostMapping
    public DonacionDTO insertDonacionDTO(@RequestBody DonacionDTO donacion) {

        DonacionDTO aux = donacionService.insertDonacionDTO(donacion);
        return aux;
    }

    @PutMapping("/{idDonacion}")
    public DonacionDTO updateDonacionDTO(@PathVariable int idDonacion, @RequestBody DonacionDTO donacion) {
        DonacionDTO aux = donacionService.updateDonacionDTO(idDonacion, donacion);
        return aux;
    }

    @DeleteMapping("/{idDonacion}")
    public DonacionDTO deleteDonacionDTO(@PathVariable int idDonacion) {
        DonacionDTO aux = donacionService.deleteDonacionDTO(idDonacion);
        return aux;
    }

    @GetMapping
    public List<DonacionDTO> getAll() {
        return donacionService.getAll();
    }

    @GetMapping("/{idDonacion}")
    public DonacionDTO getByidDonacion(@PathVariable int idDonacion) {
        return donacionService.getByidDonacion(idDonacion);
    }

}
