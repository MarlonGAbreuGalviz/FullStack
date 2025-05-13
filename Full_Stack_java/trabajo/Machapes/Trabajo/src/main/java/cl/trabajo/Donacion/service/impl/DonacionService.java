package cl.trabajo.Donacion.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.trabajo.Donacion.dto.DonacionDTO;
import cl.trabajo.Donacion.repository.DonacionRepository;
import cl.trabajo.Donacion.service.IDonacionService;

@Service
public class DonacionService implements IDonacionService {
    @Autowired
    DonacionRepository repo;

    @Override
    public DonacionDTO insertDonacionDTO(DonacionDTO donacion) {
        DonacionDTO aux = repo.save(donacion);
        return aux;
    }

    @Override
    public DonacionDTO updateDonacionDTO(int idDonacion, DonacionDTO donacion) {
        donacion.setIdDonacion(idDonacion);
        DonacionDTO aux = repo.save(donacion);
        return aux;
    }

    @Override
    public DonacionDTO deleteDonacionDTO(int idDonacion) {
        repo.deleteById(idDonacion);
        return null;
    }

    @Override
    public List<DonacionDTO> getAll() {
        List<DonacionDTO> aux = new ArrayList<>();
        repo.findAll().forEach(aux::add);
        return aux;
    }

    @Override
    public DonacionDTO getByidDonacion(int idDonacion) {
        return repo.findById(idDonacion).get();
    }

}
