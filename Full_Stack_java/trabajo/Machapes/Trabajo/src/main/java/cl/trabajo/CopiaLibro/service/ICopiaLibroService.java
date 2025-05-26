package cl.trabajo.CopiaLibro.service;

import java.util.List;

import cl.trabajo.CopiaLibro.dto.CopiaLibroDTO;

public interface ICopiaLibroService {
    
    CopiaLibroDTO insertCopiaLibroDTO(CopiaLibroDTO copiaLibro);

    CopiaLibroDTO updateCopiaLibroDTO(int idCopiaLibro, CopiaLibroDTO copiaLibro);

    CopiaLibroDTO deleteCopiaLibroDTO(int idcopiaLibro);

    List<CopiaLibroDTO> getAll();

    CopiaLibroDTO getByidCopiaLibro(int idcopiaLibro);

}
