package cl.trabajo.Rol.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.trabajo.Rol.dto.RolDTO;
import cl.trabajo.Rol.repository.RolRepository;
import cl.trabajo.Rol.service.IRolService;

@Service
public class RolService implements IRolService {
    @Autowired
    RolRepository repo;

    @Override
    public RolDTO insertRolDTO(RolDTO Rol) {
        RolDTO aux = repo.save(Rol);
        return aux;
    }

    @Override
    public RolDTO updateRolDTO(int idRol, RolDTO Rol) {
        Rol.setIdRol(idRol);
        RolDTO aux = repo.save(Rol);
        return aux;
    }

    @Override
    public RolDTO deleteRolDTO(int idRol) {
        repo.deleteById(idRol);
        return null;
    }

    @Override
    public List<RolDTO> getAll() {
        List<RolDTO> aux = new ArrayList<>();
        repo.findAll().forEach(aux::add);
        return aux;
    }

    @Override
    public RolDTO getByidRol(int idRol) {
        return repo.findById(idRol).get();
    }
}
