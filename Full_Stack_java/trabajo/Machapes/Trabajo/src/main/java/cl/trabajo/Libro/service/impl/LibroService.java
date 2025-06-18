package cl.trabajo.Libro.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.trabajo.Libro.dto.LibroDTO;
import cl.trabajo.Libro.repository.LibroRepository;
import cl.trabajo.Libro.service.ILibroService;

@Service
public class LibroService implements ILibroService {
    @Autowired
    LibroRepository repo;

    @Override
    public LibroDTO insertLibroDTO(LibroDTO libro) {
        LibroDTO aux = repo.save(libro);
        return aux;
    }

    @Override
    public LibroDTO updateLibroDTO(int idLibro, LibroDTO libro) {
    LibroDTO libroExistente = repo.findById(idLibro)
        .orElseThrow(() -> new RuntimeException("Libro no encontrado"));
        libroExistente.setTitulo(libro.getTitulo());
        libroExistente.setIsbn(libro.getIsbn());
        libroExistente.setAutor(libro.getAutor());

        return repo.save(libroExistente);
    }

    @Override
    public LibroDTO deleteLibroDTO(int idLibro) {
        repo.deleteById(idLibro);
        return null;
    }

    @Override
    public List<LibroDTO> getAll() {
        List<LibroDTO> aux = new ArrayList<>();
        repo.findAll().forEach(aux::add);
        return aux;
    }

    @Override
    public LibroDTO getByidLibro(int idLibro) {
        return repo.findById(idLibro)
        .orElseThrow(() -> new RuntimeException("Libro no encontrado con ID " + idLibro));
    }
}
