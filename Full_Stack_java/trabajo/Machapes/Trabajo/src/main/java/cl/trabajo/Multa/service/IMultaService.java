package cl.trabajo.Multa.service;

import java.util.List;

import cl.trabajo.Multa.dto.MultaDTO;

public interface IMultaService {
    MultaDTO insertMultaDTO(MultaDTO multa);

    MultaDTO updateMultaDTO(int idMulta, MultaDTO multa);

    MultaDTO deleteMultaDTO(int idMulta);

    List<MultaDTO> getAll();

    MultaDTO getByidMulta(int idMulta);

}
