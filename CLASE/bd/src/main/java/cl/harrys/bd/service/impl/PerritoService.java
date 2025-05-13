package cl.harrys.bd.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import cl.harrys.bd.dto.PerritoDTO;
import cl.harrys.bd.repository.PerritoRepository;
import cl.harrys.bd.service.IPerritoService;

@Service
public class PerritoService implements IPerritoService {
    @Autowired
    PerritoRepository repo;

    @Override
    public PerritoDTO insPerritoDTO(PerritoDTO perrito) {
        System.out.println("2222");
        PerritoDTO aux = repo.save(perrito);
        return aux;
    }

    @Override
    public PerritoDTO actPerritoDTO(String codigo, PerritoDTO perrito) {
        // TODO Auto-generated method stub
        perrito.setCodigo(codigo);
        PerritoDTO aux = repo.save(perrito);
        return aux;

        }

    @Override
    public PerritoDTO deletePerritoDTO(String codigo) {
        // TODO Auto-generated method stub
        repo.deleteById(codigo);
        return null;
    }

    @Override
    public List<PerritoDTO> getAllPerrito() {
        List<PerritoDTO> aux = new ArrayList<>();
        // TODO Auto-generated method stub
        repo.findAll().forEach(aux::add);
        return aux;
        }

    @Override
    public PerritoDTO getByCodigo(String codigo) {
        return repo.findById(codigo).get();
    }
    
        
    

}
