package cl.trabajo.Pasillo.service;

import java.util.List;

import cl.trabajo.Pasillo.dto.PasilloDTO;

public interface IPasilloService {
    
    PasilloDTO insertPasilloDTO(PasilloDTO pasillo);

    PasilloDTO updatePasilloDTO(int idPasillo, PasilloDTO pasillo);

    PasilloDTO deletePasilloDTO(int idpasillo);

    List<PasilloDTO> getAll();

    PasilloDTO getByidPasillo(int idpasillo);

}

