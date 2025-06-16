package cl.trabajo.Multa.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.trabajo.Multa.dto.MultaDTO;
import cl.trabajo.Multa.repository.MultaRepository;
import cl.trabajo.Multa.service.IMultaService;
import cl.trabajo.exception.NotFoundException;

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
        if(!repo.existsById(idMulta)) {
            throw new NotFoundException("Multa con ID " + idMulta + " no encontrada");
        }

        multa.setIdMulta(idMulta);
        return repo.save(multa);
    }

    @Override
    public MultaDTO deleteMultaDTO(int idMulta) {
        if(!repo.existsById(idMulta)) {
            throw new NotFoundException("Multa con ID " + idMulta + " no encontrada");
        }
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
        return repo.findById(idMulta)
            .orElseThrow(() -> new NotFoundException("Multa con ID " + idMulta + " no encontrada"));
    }
}
