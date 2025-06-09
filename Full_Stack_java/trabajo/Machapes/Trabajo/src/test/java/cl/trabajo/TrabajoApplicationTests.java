package cl.trabajo;

//setup
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;


//Json Handler
import com.fasterxml.jackson.databind.ObjectMapper;

//Cleaner
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;


//Libreria de Test

//Carpeta a Testear

@AutoConfigureMockMvc
@SpringBootTest
class TrabajoApplicationTests {

	@Autowired
    MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper; // Transformar Objetos a JSON

	@Test
    public void whenGetByIdMulta_NotFound_thenReturns404() throws Exception {
        int idNoExistente = 999;

        mockMvc.perform(get("/api/crud/multa" + idNoExistente))  // Cambia "/ruta-multa/" por tu endpoint real
            .andExpect(status().isNotFound())
            .andExpect(content().string("Multa con ID " + idNoExistente + " no encontrada"));
    }

}
