package cl.trabajo.CopiaLibro.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.trabajo.CopiaLibro.dto.CopiaLibroDTO;
import cl.trabajo.CopiaLibro.repository.CopiaLibroRepository;
import cl.trabajo.CopiaLibro.service.ICopiaLibroService;

@Service
public class CopiaLibroService implements ICopiaLibroService {
    @Autowired
    CopiaLibroRepository repo;

    @Override
    public CopiaLibroDTO insertCopiaLibroDTO(CopiaLibroDTO copiaLibro) {
        CopiaLibroDTO aux = repo.save(copiaLibro);
        return aux;
    }

    @Override
    public CopiaLibroDTO updateCopiaLibroDTO(int idCopiaLibro, CopiaLibroDTO copiaLibro) {
        copiaLibro.setIdCopiaLibro(idCopiaLibro);
        CopiaLibroDTO aux = repo.save(copiaLibro);
        return aux;
    }

    @Override
    public CopiaLibroDTO deleteCopiaLibroDTO(int idCopiaLibro) {
        repo.deleteById(idCopiaLibro);
        return null;
    }

    @Override
    public List<CopiaLibroDTO> getAll() {
        List<CopiaLibroDTO> aux = new ArrayList<>();
        repo.findAll().forEach(aux::add);
        return aux;
    }

    @Override
    public CopiaLibroDTO getByidCopiaLibro(int idCopiaLibro) {
        return repo.findById(idCopiaLibro).get();
    }
}