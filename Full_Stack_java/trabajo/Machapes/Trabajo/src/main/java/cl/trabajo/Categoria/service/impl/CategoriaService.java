package cl.trabajo.Categoria.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.trabajo.Categoria.dto.CategoriaDTO;
import cl.trabajo.Categoria.repository.CategoriaRepository;
import cl.trabajo.Categoria.service.ICategoriaService;

@Service
public class CategoriaService implements ICategoriaService {

    @Autowired
    CategoriaRepository repo;

    @Override
    public CategoriaDTO insertCategoriaDTO(CategoriaDTO categoria) {
        CategoriaDTO aux = repo.save(categoria);
        return aux;
    }

    @Override
    public CategoriaDTO updateCategoriaDTO(int idCategoria, CategoriaDTO categoria) {
        categoria.setIdCategoria(idCategoria);
        CategoriaDTO aux = repo.save(categoria);
        return aux;
    }

    @Override
    public CategoriaDTO deleteCategoriaDTO(int idCategoria) {
        repo.deleteById(idCategoria);
        return null;
    }

    @Override
    public List<CategoriaDTO> getAll() {
        List<CategoriaDTO> aux = new ArrayList<>();
        repo.findAll().forEach(aux::add);
        return aux;
    }

    @Override
    public CategoriaDTO getByidCategoria(int idCategoria) {
        return repo.findById(idCategoria).get();
    }
}
