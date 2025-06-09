package cl.trabajo.trabajo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.hamcrest.Matchers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import cl.trabajo.Libro.dto.LibroDTO;

@AutoConfigureMockMvc
@SpringBootTest
class TrabajoApplicationTests {

	@Autowired
	MockMvc mockMvc;

	@Autowired
    private ObjectMapper objectMapper; // Para convertir objetos a JSON

    @Test
    void testValidacionesGeneral() throws Exception {
       LibroDTO libro = new LibroDTO(); 

        mockMvc.perform(post("/api/crud/libro")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(libro)))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.errors").exists()); 
    }

	@Test
    void testNoEncontrado() throws Exception {
    mockMvc.perform(MockMvcRequestBuilders.get("/api/crud/libro/800")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isNotFound())
            .andExpect(jsonPath("$.message").value("No se encontró el ID: 800"));
    }

	
	@Test
    void testNoEncontradoActualizacion() throws Exception {
    mockMvc.perform(MockMvcRequestBuilders.get("/api/crud/proveedor/800")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isNotFound())
			.andExpect(jsonPath("$.message").value("No se encontró el ID: 800"));
    }
	
	@Test
	void contextLoads() {
	}

}

