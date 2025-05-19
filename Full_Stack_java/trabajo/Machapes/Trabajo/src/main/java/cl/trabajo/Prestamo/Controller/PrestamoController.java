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

@RequestMapping("/api/crud/prestamo") // Se usa para definir la ruta base de la API
@RestController // Se usa para definir que esta clase es un controlador REST
public class PrestamoController {

    @Autowired // Para usar las funciones del servicio IPrestamoService
    IPrestamoService prestamoService;

    @PostMapping // Se usa para insertar un nuevo prestamo
    public PrestamoDTO insertPrestamoDTO(@RequestBody PrestamoDTO prestamo) {

        PrestamoDTO aux = prestamoService.insertPrestamoDTO(prestamo);
        return aux;
    }

    @PutMapping("/{idPrestamo}") // Se usa para actualizar un prestamo
    public PrestamoDTO updatePrestamoDTO(@PathVariable int idPrestamo, @RequestBody PrestamoDTO prestamo) {
        PrestamoDTO aux = prestamoService.updatePrestamoDTO(idPrestamo, prestamo);
        return aux;
    }

    @DeleteMapping("/{idPrestamo}") // Se usa para eliminar un prestamo     
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
