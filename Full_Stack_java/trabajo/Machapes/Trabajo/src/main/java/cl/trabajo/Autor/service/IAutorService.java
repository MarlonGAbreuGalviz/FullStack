package cl.trabajo.Autor.service;

import java.util.List;

import cl.trabajo.Autor.dto.AutorDTO;

public interface IAutorService {
    
    AutorDTO insertAutorDTO(AutorDTO autor);

    AutorDTO updateAutorDTO(int idAutor, AutorDTO autor);

    AutorDTO deleteAutorDTO(int idAutor);

    List<AutorDTO> getAll();

    AutorDTO getByidAutor(int idAutor);

}
