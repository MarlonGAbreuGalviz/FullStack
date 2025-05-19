package cl.trabajo.Rol.service;

import java.util.List;

import cl.trabajo.Rol.dto.RolDTO;

public interface IRolService {
    
    RolDTO insertRolDTO(RolDTO Rol);

    RolDTO updateRolDTO(int idRol, RolDTO Rol);

    RolDTO deleteRolDTO(int idRol);

    List<RolDTO> getAll();

    RolDTO getByidRol(int idRol);

}
