package cl.trabajo;

//setup
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

//Json Handler
import org.springframework.http.MediaType;
import com.fasterxml.jackson.databind.ObjectMapper;

//Cleaner
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

//Libreria de Test
import org.hamcrest.Matchers;

//Carpeta a Testear
import cl.trabajo.Autor.dto.AutorDTO;

@AutoConfigureMockMvc
@SpringBootTest
class TrabajoApplicationTests {

	@Autowired
    MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper; // Transformar Objetos a JSON

	@Test
    void testValidacionesGeneralAutor() throws Exception {
        AutorDTO Autor = new AutorDTO(); // Sin valores

        mockMvc.perform(post("/api/crud/autor")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(Autor)))
                .andExpect(status().isBadRequest()) // Esperamos un 400 debido a validaciones fallidas
                .andExpect(jsonPath("$").exists()); // Verifica que hay mensajes de error
    }

}
