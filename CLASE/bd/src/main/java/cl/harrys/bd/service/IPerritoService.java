package cl.harrys.bd.service;

import java.util.List;

import cl.harrys.bd.dto.PerritoDTO;

public interface IPerritoService {
    PerritoDTO insPerritoDTO(PerritoDTO perrito);

    PerritoDTO actPerritoDTO(String codigo, PerritoDTO perrito);

    PerritoDTO deletePerritoDTO(String codigo);

    List<PerritoDTO> getAllPerrito();

    PerritoDTO getByCodigo(String codigo);
}
