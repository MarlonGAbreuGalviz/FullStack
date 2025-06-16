package cl.trabajo.Devolucion.controller;

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

import cl.trabajo.Devolucion.dto.DevolucionDTO;
import cl.trabajo.Devolucion.service.IDevolucionService;
import jakarta.validation.Valid;

@RequestMapping("/api/crud/devolucion")
@RestController
public class DevolucionController {
    @Autowired
    IDevolucionService devolucionService;

    @PostMapping
    public DevolucionDTO insertDevolucionDTO(@Valid @RequestBody DevolucionDTO devolucion) {

        DevolucionDTO aux = devolucionService.insertDevolucionDTO(devolucion);
        return aux;
    }

    @PutMapping("/{idDevolucion}")
    public DevolucionDTO updateDevolucionDTO(@PathVariable int idDevolucion,@Valid @RequestBody DevolucionDTO devolucion) {
        DevolucionDTO aux = devolucionService.updateDevolucionDTO(idDevolucion, devolucion);
        return aux;
    }

    @DeleteMapping("/{idDevolucion}")
    public DevolucionDTO deleteDevolucionDTO(@PathVariable int idDevolucion) {
        DevolucionDTO aux = devolucionService.deleteDevolucionDTO(idDevolucion);
        return aux;
    }

    @GetMapping
    public List<DevolucionDTO> getAll() {
        return devolucionService.getAll();
    }

    @GetMapping("/{idDevolucion}")
    public DevolucionDTO getByidDevolucion(@PathVariable int idDevolucion) {
        return devolucionService.getByidDevolucion(idDevolucion);
    }
}
