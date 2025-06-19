//Programado y manejado por Sebastian Gonzalez

package cl.trabajo.Categoria.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import cl.trabajo.Libro.dto.LibroDTO;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "categoria")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CategoriaDTO {
    @Id
    @NotNull(message = "Id de Categoria Necesario")
    private int idCategoria;

    
    @Column(name = "categoria")
    @NotBlank(message = "Nombre de Categoria Necesaria")
    @Size(max = 30, message = "La Categoria solo peude ser de 30 Caracteres")
    private String categoria;
    
    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference ("categoria-libro")
    private List<LibroDTO> libros = new ArrayList<>();
}
