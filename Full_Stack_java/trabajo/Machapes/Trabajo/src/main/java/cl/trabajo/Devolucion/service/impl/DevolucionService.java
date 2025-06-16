package cl.trabajo.Devolucion.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.trabajo.Devolucion.dto.DevolucionDTO;
import cl.trabajo.Devolucion.repository.DevolucionRepository;
import cl.trabajo.Devolucion.service.IDevolucionService;
import cl.trabajo.exception.NotFoundException;

@Service
public class DevolucionService implements IDevolucionService {
    @Autowired
    DevolucionRepository repo;

    @Override
    public DevolucionDTO insertDevolucionDTO(DevolucionDTO devolucion) {
        DevolucionDTO aux = repo.save(devolucion);
        return aux;
    }

    @Override
    public DevolucionDTO updateDevolucionDTO(int idDevolucion, DevolucionDTO devolucion) {
        if (!repo.existsById(idDevolucion)) {
            throw new NotFoundException("Devolución con ID " + idDevolucion + " no encontrada");
        }
        devolucion.setIdDevolucion(idDevolucion);
        return repo.save(devolucion);
    }

    @Override
    public DevolucionDTO deleteDevolucionDTO(int idDevolucion) {
        if (!repo.existsById(idDevolucion)) {
            throw new NotFoundException("Devolución con ID " + idDevolucion + " no encontrada");
        }
        repo.deleteById(idDevolucion);
        return null;
    }

    @Override
    public List<DevolucionDTO> getAll() {
        List<DevolucionDTO> aux = new ArrayList<>();
        repo.findAll().forEach(aux::add);
        return aux;
    }

    @Override
    public DevolucionDTO getByidDevolucion(int idDevolucion) {
        return repo.findById(idDevolucion)
                .orElseThrow(() -> new NotFoundException("Devolución con ID " + idDevolucion + " no encontrada"));
    }

}
