package Multa;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;


import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import cl.trabajo.Multa.repository.MultaRepository;
import cl.trabajo.Multa.service.impl.MultaService;
import cl.trabajo.exception.NotFoundException;



public class MultaTest {
    
    @Mock
    private MultaRepository repo;

    @InjectMocks
    private MultaService multaService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getById_NoExisteID() {
        int idInexistente = 999;

        when(repo.findById(idInexistente)).thenReturn(Optional.empty());

        NotFoundException exception = assertThrows(NotFoundException.class, () -> {
            multaService.getByidMulta(idInexistente);
        });

        assertEquals("Multa con ID 999 no encontrada", exception.getMessage());
    }

    

   
}
