package cl.trabajo.Piso.service;

import java.util.List;

import cl.trabajo.Piso.dto.PisoDTO;

public interface IPisoService {
    
    PisoDTO insertPisoDTO(PisoDTO piso);

    PisoDTO updatePisoDTO(int idPiso, PisoDTO piso);

    PisoDTO deletePisoDTO(int idpiso);

    List<PisoDTO> getAll();

    PisoDTO getByidPiso(int idpiso);

}
