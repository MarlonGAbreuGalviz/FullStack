package cl.trabajo.Categoria.controller;

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

import cl.trabajo.Categoria.dto.CategoriaDTO;
import cl.trabajo.Categoria.service.ICategoriaService;

@RequestMapping("/api/crud/categoria")
@RestController
public class CategoriaController {
    @Autowired
    ICategoriaService categoriaService;

    @PostMapping
    public CategoriaDTO insertCategoriaDTO(@RequestBody CategoriaDTO categoria) {

        CategoriaDTO aux = categoriaService.insertCategoriaDTO(categoria);
        return aux;
    }

    @PutMapping("/{idCategoria}")
    public CategoriaDTO updateCategoriaDTO(@PathVariable int idCategoria, @RequestBody CategoriaDTO categoria) {
        CategoriaDTO aux = categoriaService.updateCategoriaDTO(idCategoria, categoria);
        return aux;
    }

    @DeleteMapping("/{idCategoria}")
    public CategoriaDTO deleteCategoriaDTO(@PathVariable int idCategoria) {
        CategoriaDTO aux = categoriaService.deleteCategoriaDTO(idCategoria);
        return aux;
    }

    @GetMapping
    public List<CategoriaDTO> getAll() {
        return categoriaService.getAll();
    }

    @GetMapping("/{idCategoria}")
    public CategoriaDTO getByidCategoria(@PathVariable int idCategoria) {
        return categoriaService.getByidCategoria(idCategoria);
    }

}
