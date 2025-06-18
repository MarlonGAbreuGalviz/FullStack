package cl.trabajo.Autor.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.trabajo.Autor.dto.AutorDTO;
import cl.trabajo.Autor.repository.AutorRepository;
import cl.trabajo.Autor.service.IAutorService;

@Service
public class AutorService implements IAutorService {
    @Autowired
    AutorRepository repo;

    @Override
    public AutorDTO insertAutorDTO(AutorDTO autor) {
    if (autor.getLibros() != null) {
        autor.getLibros().forEach(libro -> libro.setAutor(autor));
    }
    return repo.save(autor);
}

    @Override
    public AutorDTO updateAutorDTO(int idAutor, AutorDTO autor) {
        autor.setIdAutor(idAutor);
        AutorDTO aux = repo.save(autor);
        return aux;
    }

    @Override
    public AutorDTO deleteAutorDTO(int idAutor) {
        repo.deleteById(idAutor);
        return null;
    }

    @Override
    public List<AutorDTO> getAll() {
        List<AutorDTO> aux = new ArrayList<>();
        repo.findAll().forEach(aux::add);
        return aux;
    }

    @Override
    public AutorDTO getByidAutor(int idAutor) {
        return repo.findById(idAutor).get();
    }
}
