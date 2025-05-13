package cl.trabajo.Prestamo.service;

import java.util.List;

import cl.trabajo.Prestamo.dto.PrestamoDTO;

public interface IPrestamoService {

    PrestamoDTO insertPrestamoDTO(PrestamoDTO prestamo);

    PrestamoDTO updatePrestamoDTO(int idPrestamo, PrestamoDTO prestamo);

    PrestamoDTO deletePrestamoDTO(int idPrestamo);

    List<PrestamoDTO> getAll();

    PrestamoDTO getByidPrestamo(int idPrestamo);
}
