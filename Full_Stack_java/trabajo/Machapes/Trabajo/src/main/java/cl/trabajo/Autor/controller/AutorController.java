package cl.trabajo.Autor.controller;

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

import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import cl.trabajo.Autor.dto.AutorDTO;
import cl.trabajo.Autor.service.IAutorService;

@RequestMapping("/api/crud/autor")
@RestController
public class AutorController {
    @Autowired
    IAutorService autorService;

    /*@PostMapping
    public AutorDTO insertAutorDTO(@RequestBody AutorDTO autor) {

        AutorDTO aux = autorService.insertAutorDTO(autor);
        return aux;
    }*/

    @PostMapping
    public ResponseEntity<?> insertAutorDTO(@Valid @RequestBody AutorDTO autor, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResponseEntity.badRequest().body(bindingResult.getAllErrors());
        }
    
        AutorDTO aux = autorService.insertAutorDTO(autor);
        return ResponseEntity.ok(aux);
    }

    /*@PutMapping("/{idAutor}")
    public AutorDTO updateAutorDTO(@PathVariable int idAutor, @RequestBody AutorDTO autor) {
        AutorDTO aux = autorService.updateAutorDTO(idAutor, autor);
        return aux;
    }*/

    @PutMapping("/{idAutor}")
    public ResponseEntity<?> updateAutorDTO(@PathVariable int idAutor, @Valid @RequestBody AutorDTO autor, BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
        return ResponseEntity.badRequest().body(bindingResult.getAllErrors());
    }

    AutorDTO aux = autorService.updateAutorDTO(idAutor, autor);
    return ResponseEntity.ok(aux);
}

    @DeleteMapping("/{idAutor}")
    public AutorDTO deleteAutorDTO(@PathVariable int idAutor) {
        AutorDTO aux = autorService.deleteAutorDTO(idAutor);
        return aux;
    }

    @GetMapping
    public List<AutorDTO> getAll() {
        return autorService.getAll();
    }

    @GetMapping("/{idAutor}")
    public AutorDTO getByidAutor(@PathVariable int idAutor) {
        return autorService.getByidAutor(idAutor);
    }
}
