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
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;

@RequestMapping("/api/crud/multa") // Se usa para definir la ruta base de la API
@RestController // Se usa para definir que esta clase es un controlador REST
public class MultaController {
    @Autowired // Para usar las funciones del servicio IPrestamoService / hace una inyección
    IMultaService multaService; 

    @PostMapping // Se usa para insertar una nueva multa
    public MultaDTO insertMultaDTO(@Valid @RequestBody MultaDTO multa) {

        MultaDTO aux = multaService.insertMultaDTO(multa);
        return aux;
    }

    @PutMapping("/{idMulta}") // Se usa para actualizar un prestamo
    public MultaDTO updateMultaDTO(@PathVariable int idMulta,@Valid @RequestBody MultaDTO multa) {
        MultaDTO aux = multaService.updateMultaDTO(idMulta, multa);
        return aux;
    }

    @DeleteMapping("/{idMulta}") // Se usa para eliminar un prestamo  
    public MultaDTO deleteMultaDTO(@PathVariable int idMulta) {
        MultaDTO aux = multaService.deleteMultaDTO(idMulta);
        return aux;
    }

    @GetMapping
    public List<MultaDTO> getAll() {
        return multaService.getAll();
    }



    @GetMapping("/{idMulta}")
    @Operation(summary = "Obtener multa por ID")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Multa encontrada"),
        @ApiResponse(responseCode = "404", description = "Multa no encontrada")
    })
    public MultaDTO getByidMulta(@PathVariable int idMulta) {
        return multaService.getByidMulta(idMulta);
    }
}
