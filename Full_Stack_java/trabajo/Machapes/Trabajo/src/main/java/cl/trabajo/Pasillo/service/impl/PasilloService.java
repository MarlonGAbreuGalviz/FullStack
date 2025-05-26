package cl.trabajo.Pasillo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.trabajo.Pasillo.dto.PasilloDTO;
import cl.trabajo.Pasillo.repository.PasilloRepository;
import cl.trabajo.Pasillo.service.IPasilloService;

@Service
public class PasilloService implements IPasilloService {
    @Autowired
    PasilloRepository repo;

    @Override
    public PasilloDTO insertPasilloDTO(PasilloDTO pasillo) {
        PasilloDTO aux = repo.save(pasillo);
        return aux;
    }

    @Override
    public PasilloDTO updatePasilloDTO(int idPasillo, PasilloDTO pasillo) {
        pasillo.setIdPasillo(idPasillo);
        PasilloDTO aux = repo.save(pasillo);
        return aux;
    }

    @Override
    public PasilloDTO deletePasilloDTO(int idPasillo) {
        repo.deleteById(idPasillo);
        return null;
    }

    @Override
    public List<PasilloDTO> getAll() {
        List<PasilloDTO> aux = new ArrayList<>();
        repo.findAll().forEach(aux::add);
        return aux;
    }

    @Override
    public PasilloDTO getByidPasillo(int idPasillo) {
        return repo.findById(idPasillo).get();
    }
}