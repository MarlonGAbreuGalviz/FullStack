package cl.trabajo.Ubicacion.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.trabajo.Ubicacion.dto.UbicacionDTO;
import cl.trabajo.Ubicacion.repository.UbicacionRepository;
import cl.trabajo.Ubicacion.service.IUbicacionService;

@Service
public class UbicacionService implements IUbicacionService {
    @Autowired
    UbicacionRepository repo;

    @Override
    public UbicacionDTO insertUbicacionDTO(UbicacionDTO ubicacion) {
        UbicacionDTO aux = repo.save(ubicacion);
        return aux;
    }

    @Override
    public UbicacionDTO updateUbicacionDTO(int idUbicacion, UbicacionDTO ubicacion) {
        ubicacion.setIdUbicacion(idUbicacion);
        UbicacionDTO aux = repo.save(ubicacion);
        return aux;
    }

    @Override
    public UbicacionDTO deleteUbicacionDTO(int idUbicacion) {
        repo.deleteById(idUbicacion);
        return null;
    }

    @Override
    public List<UbicacionDTO> getAll() {
        List<UbicacionDTO> aux = new ArrayList<>();
        repo.findAll().forEach(aux::add);
        return aux;
    }

    @Override
    public UbicacionDTO getByidUbicacion(int idUbicacion) {
        return repo.findById(idUbicacion).get();
    }
}
