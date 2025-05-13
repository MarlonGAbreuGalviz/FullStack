package cl.trabajo.Donacion.service;

import java.util.List;

import cl.trabajo.Donacion.dto.DonacionDTO;

public interface IDonacionService {
    DonacionDTO insertDonacionDTO(DonacionDTO donacion);

    DonacionDTO updateDonacionDTO(int idDonacion, DonacionDTO donacion);

    DonacionDTO deleteDonacionDTO(int idDonacion);

    List<DonacionDTO> getAll();

    DonacionDTO getByidDonacion(int idDonacion);
}
