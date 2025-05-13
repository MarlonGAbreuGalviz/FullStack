package cl.trabajo.Libro.service;

import java.util.List;

import cl.trabajo.Libro.dto.LibroDTO;

public interface ILibroService {
    LibroDTO insertLibroDTO(LibroDTO libro);

    LibroDTO updateLibroDTO(int idLibro, LibroDTO libro);

    LibroDTO deleteLibroDTO(int idLibro);

    List<LibroDTO> getAll();

    LibroDTO getByidLibro(int idLibro);
}
