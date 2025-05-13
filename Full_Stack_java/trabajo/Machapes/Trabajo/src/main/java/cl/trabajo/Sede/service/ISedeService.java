package cl.trabajo.Sede.service;

import java.util.List;

import cl.trabajo.Sede.dto.SedeDTO;

public interface ISedeService {
    SedeDTO insertSedeDTO(SedeDTO sede);

    SedeDTO updateSedeDTO(int idSede, SedeDTO sede);

    SedeDTO deleteSedeDTO(int idSede);

    List<SedeDTO> getAll();

    SedeDTO getByidSede(int idSede);
}
