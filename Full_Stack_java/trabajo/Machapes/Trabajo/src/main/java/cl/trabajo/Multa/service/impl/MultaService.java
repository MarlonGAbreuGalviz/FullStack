package cl.trabajo.Multa.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.trabajo.Multa.dto.MultaDTO;
import cl.trabajo.Multa.repository.MultaRepository;
import cl.trabajo.Multa.service.IMultaService;

@Service
public class MultaService implements IMultaService {
    @Autowired
    MultaRepository repo;

    @Override
    public MultaDTO insertMultaDTO(MultaDTO multa) {
        MultaDTO aux = repo.save(multa);
        return aux;
    }

    @Override
    public MultaDTO updateMultaDTO(int idMulta, MultaDTO multa) {
        multa.setIdMulta(idMulta);
        MultaDTO aux = repo.save(multa);
        return aux;
    }

    @Override
    public MultaDTO deleteMultaDTO(int idMulta) {
        repo.deleteById(idMulta);
        return null;
    }

    @Override
    public List<MultaDTO> getAll() {
        List<MultaDTO> aux = new ArrayList<>();
        repo.findAll().forEach(aux::add);
        return aux;
    }

    @Override
    public MultaDTO getByidMulta(int idMulta) {
        return repo.findById(idMulta).get();
    }
}
