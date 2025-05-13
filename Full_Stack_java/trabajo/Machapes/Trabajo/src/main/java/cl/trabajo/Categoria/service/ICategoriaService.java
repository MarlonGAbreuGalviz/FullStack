package cl.trabajo.Categoria.service;

import java.util.List;

import cl.trabajo.Categoria.dto.CategoriaDTO;

public interface ICategoriaService {

    CategoriaDTO insertCategoriaDTO(CategoriaDTO categoria);

    CategoriaDTO updateCategoriaDTO(int idCategoria, CategoriaDTO categoria);

    CategoriaDTO deleteCategoriaDTO(int idCategoria);

    List<CategoriaDTO> getAll();

    CategoriaDTO getByidCategoria(int idCategoria);
}
