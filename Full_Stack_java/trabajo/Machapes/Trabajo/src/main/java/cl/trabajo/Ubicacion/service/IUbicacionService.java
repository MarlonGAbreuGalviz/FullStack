package cl.trabajo.Ubicacion.service;

import java.util.List;

import cl.trabajo.Ubicacion.dto.UbicacionDTO;

public interface IUbicacionService {
    
    UbicacionDTO insertUbicacionDTO(UbicacionDTO ubicacion);

    UbicacionDTO updateUbicacionDTO(int idUbicacion, UbicacionDTO ubicacion);

    UbicacionDTO deleteUbicacionDTO(int idubicacion);

    List<UbicacionDTO> getAll();

    UbicacionDTO getByidUbicacion(int idubicacion);

}
