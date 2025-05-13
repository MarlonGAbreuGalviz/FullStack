package cl.trabajo.Libro.controller;

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

import cl.trabajo.Libro.dto.LibroDTO;
import cl.trabajo.Libro.service.ILibroService;

@RequestMapping("/api/crud/libro")
@RestController
public class LibroController {
    @Autowired
    ILibroService libroService;

    @PostMapping
    public LibroDTO insertLibroDTO(@RequestBody LibroDTO libro) {

        LibroDTO aux = libroService.insertLibroDTO(libro);
        return aux;
    }

    @PutMapping("/{idLibro}")
    public LibroDTO updateLibroDTO(@PathVariable int idLibro, @RequestBody LibroDTO libro) {
        LibroDTO aux = libroService.updateLibroDTO(idLibro, libro);
        return aux;
    }

    @DeleteMapping("/{idLibro}")
    public LibroDTO deleteLibroDTO(@PathVariable int idLibro) {
        LibroDTO aux = libroService.deleteLibroDTO(idLibro);
        return aux;
    }

    @GetMapping
    public List<LibroDTO> getAll() {
        return libroService.getAll();
    }

    @GetMapping("/{idLibro}")
    public LibroDTO getByidLibro(@PathVariable int idLibro) {
        return libroService.getByidLibro(idLibro);
    }
}
