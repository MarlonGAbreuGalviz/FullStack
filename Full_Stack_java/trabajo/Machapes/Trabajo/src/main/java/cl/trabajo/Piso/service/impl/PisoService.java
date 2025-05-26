package cl.trabajo.Piso.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.trabajo.Piso.dto.PisoDTO;
import cl.trabajo.Piso.repository.PisoRepository;
import cl.trabajo.Piso.service.IPisoService;

@Service
public class PisoService implements IPisoService {
    @Autowired
    PisoRepository repo;

    @Override
    public PisoDTO insertPisoDTO(PisoDTO piso) {
        PisoDTO aux = repo.save(piso);
        return aux;
    }

    @Override
    public PisoDTO updatePisoDTO(int idPiso, PisoDTO piso) {
        piso.setIdPiso(idPiso);
        PisoDTO aux = repo.save(piso);
        return aux;
    }

    @Override
    public PisoDTO deletePisoDTO(int idPiso) {
        repo.deleteById(idPiso);
        return null;
    }

    @Override
    public List<PisoDTO> getAll() {
        List<PisoDTO> aux = new ArrayList<>();
        repo.findAll().forEach(aux::add);
        return aux;
    }

    @Override
    public PisoDTO getByidPiso(int idPiso) {
        return repo.findById(idPiso).get();
    }
}
