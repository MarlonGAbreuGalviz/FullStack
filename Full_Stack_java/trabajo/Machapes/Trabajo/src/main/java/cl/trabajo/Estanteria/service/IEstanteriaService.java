package cl.trabajo.Estanteria.service;

import java.util.List;

import cl.trabajo.Estanteria.dto.EstanteriaDTO;

public interface IEstanteriaService {
    
    EstanteriaDTO insertEstanteriaDTO(EstanteriaDTO estanteria);

    EstanteriaDTO updateEstanteriaDTO(int idEstanteria, EstanteriaDTO estanteria);

    EstanteriaDTO deleteEstanteriaDTO(int idestanteria);

    List<EstanteriaDTO> getAll();

    EstanteriaDTO getByidEstanteria(int idestanteria);

}
