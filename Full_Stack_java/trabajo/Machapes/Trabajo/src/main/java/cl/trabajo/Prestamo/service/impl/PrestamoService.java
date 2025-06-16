package cl.trabajo.Prestamo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.trabajo.Prestamo.dto.PrestamoDTO;
import cl.trabajo.Prestamo.repository.PrestamoRepository;
import cl.trabajo.Prestamo.service.IPrestamoService;
import cl.trabajo.exception.NotFoundException;

@Service
public class PrestamoService implements IPrestamoService {
    @Autowired
    PrestamoRepository repo;

    @Override
    public PrestamoDTO insertPrestamoDTO(PrestamoDTO prestamo) {
        PrestamoDTO aux = repo.save(prestamo);
        return aux;
    }

    @Override
    public PrestamoDTO updatePrestamoDTO(int idPrestamo, PrestamoDTO prestamo) {
        if (!repo.existsById(idPrestamo)) {
            throw new NotFoundException("Préstamo con ID " + idPrestamo + " no encontrado");
        }
        prestamo.setIdPrestamo(idPrestamo);
        return repo.save(prestamo);
    }

    @Override
    public PrestamoDTO deletePrestamoDTO(int idPrestamo) {
        if (!repo.existsById(idPrestamo)) {
            throw new NotFoundException("Préstamo con ID " + idPrestamo + " no encontrado");
        }
        repo.deleteById(idPrestamo);
        return null;
    }

    @Override
    public List<PrestamoDTO> getAll() {
        List<PrestamoDTO> aux = new ArrayList<>();
        repo.findAll().forEach(aux::add);
        return aux;
    }

    @Override
    public PrestamoDTO getByidPrestamo(int idPrestamo) {
        return repo.findById(idPrestamo)
                .orElseThrow(() -> new NotFoundException("Préstamo con ID " + idPrestamo + " no encontrado"));
    }

}
