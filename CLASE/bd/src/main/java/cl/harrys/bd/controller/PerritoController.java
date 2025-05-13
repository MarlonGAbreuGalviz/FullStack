package cl.harrys.bd.controller;

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

import cl.harrys.bd.dto.PerritoDTO;
import cl.harrys.bd.service.IPerritoService;

@RestController
@RequestMapping("/api/crud/perrito")
public class PerritoController {
    @Autowired
    IPerritoService perritoService;

    @PostMapping
    public PerritoDTO insPerritoDTO(@RequestBody PerritoDTO perrito) {
        System.out.println("1111");
        PerritoDTO aux=perritoService.insPerritoDTO(perrito);
        return aux;
    }

    @PutMapping("/{codigo}")
    public PerritoDTO actPerritoDTO(@PathVariable String codigo, @RequestBody PerritoDTO perrito) {
        System.out.println("1111");
        PerritoDTO aux=perritoService.actPerritoDTO(codigo, perrito);
        return aux;

    }
    @DeleteMapping("/{codigo}")
    public PerritoDTO deletePerritoDTO(@PathVariable String codigo) {
        System.out.println("1111");
        PerritoDTO aux=perritoService.deletePerritoDTO(codigo);
        return aux;
    }

    @GetMapping 
    public List<PerritoDTO> getAllList(){
        return perritoService.getAllPerrito();
    }

    @GetMapping ("/{codigo}")
    public PerritoDTO getByCodigo(@PathVariable String codigo){
        return perritoService.getByCodigo(codigo);
    }
}
