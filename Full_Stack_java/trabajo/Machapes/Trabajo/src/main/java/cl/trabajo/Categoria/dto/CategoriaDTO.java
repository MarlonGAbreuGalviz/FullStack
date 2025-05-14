package cl.trabajo.Categoria.dto;

import java.util.List;

import cl.trabajo.Libro.dto.LibroDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    private int idCategoria;
    @Column(name = "categoria")
    private String categoria;
    @Column(name = "idLibro")
    private int idLibro;
    @Column(name = "titulo")
    private String titulo;
    private List<LibroDTO> listadoLibro;
}
