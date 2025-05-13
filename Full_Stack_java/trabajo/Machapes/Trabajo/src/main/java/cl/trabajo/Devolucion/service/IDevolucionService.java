package cl.trabajo.Devolucion.service;

import java.util.List;

import cl.trabajo.Devolucion.dto.DevolucionDTO;

public interface IDevolucionService {

    DevolucionDTO insertDevolucionDTO(DevolucionDTO devolucion);

    DevolucionDTO updateDevolucionDTO(int idDevolucion, DevolucionDTO devolucion);

    DevolucionDTO deleteDevolucionDTO(int idDevolucion);

    List<DevolucionDTO> getAll();

    DevolucionDTO getByidDevolucion(int idDevolucion);
}
