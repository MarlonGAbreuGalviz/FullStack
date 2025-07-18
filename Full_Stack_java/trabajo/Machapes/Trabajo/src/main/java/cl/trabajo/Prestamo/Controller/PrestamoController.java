package cl.trabajo.Prestamo.Controller;

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

import cl.trabajo.Prestamo.dto.PrestamoDTO;
import cl.trabajo.Prestamo.service.IPrestamoService;
import jakarta.validation.Valid;

@RequestMapping("/api/crud/prestamo") 
@RestController 
public class PrestamoController {

    @Autowired 
    IPrestamoService prestamoService;

    @PostMapping 
    public PrestamoDTO insertPrestamoDTO(@Valid @RequestBody PrestamoDTO prestamo) {

        PrestamoDTO aux = prestamoService.insertPrestamoDTO(prestamo);
        return aux;
    }

    @PutMapping("/{idPrestamo}") 
    public PrestamoDTO updatePrestamoDTO(@PathVariable int idPrestamo,@Valid @RequestBody PrestamoDTO prestamo) {
        PrestamoDTO aux = prestamoService.updatePrestamoDTO(idPrestamo, prestamo);
        return aux;
    }

    @DeleteMapping("/{idPrestamo}")    
    public PrestamoDTO deletePrestamoDTO(@PathVariable int idPrestamo) {
        PrestamoDTO aux = prestamoService.deletePrestamoDTO(idPrestamo);
        return aux;
    }

    @GetMapping     
    public List<PrestamoDTO> getAll() {
        return prestamoService.getAll();
    }

    @GetMapping("/{idPrestamo}")
    public PrestamoDTO getByidDonacion(@PathVariable int idPrestamo) {
        return prestamoService.getByidPrestamo(idPrestamo);
    }

}
