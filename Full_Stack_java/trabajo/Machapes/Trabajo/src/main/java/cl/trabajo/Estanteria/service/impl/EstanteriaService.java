package cl.trabajo.Estanteria.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.trabajo.Estanteria.dto.EstanteriaDTO;
import cl.trabajo.Estanteria.repository.EstanteriaRepository;
import cl.trabajo.Estanteria.service.IEstanteriaService;

@Service
public class EstanteriaService implements IEstanteriaService {
    @Autowired
    EstanteriaRepository repo;

    @Override
    public EstanteriaDTO insertEstanteriaDTO(EstanteriaDTO estanteria) {
        EstanteriaDTO aux = repo.save(estanteria);
        return aux;
    }

    @Override
    public EstanteriaDTO updateEstanteriaDTO(int idEstanteria, EstanteriaDTO estanteria) {
        estanteria.setIdEstanteria(idEstanteria);
        EstanteriaDTO aux = repo.save(estanteria);
        return aux;
    }

    @Override
    public EstanteriaDTO deleteEstanteriaDTO(int idEstanteria) {
        repo.deleteById(idEstanteria);
        return null;
    }

    @Override
    public List<EstanteriaDTO> getAll() {
        List<EstanteriaDTO> aux = new ArrayList<>();
        repo.findAll().forEach(aux::add);
        return aux;
    }

    @Override
    public EstanteriaDTO getByidEstanteria(int idEstanteria) {
        return repo.findById(idEstanteria).get();
    }
}