//Clase hecha por: Marlon Abreu

package cl.trabajo.Autor.dto;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "autor")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AutorDTO {
    @Id
    private int idAutor;
    @Column(name = "nombreAutor")
    private String nombreAutor;
    @Column(name = "apellidoAutor")
    private String apellidoAutor;
    @Column(name = "idLibro")
    private int idLibro;
    
    // private List<LibroDTO> libros;
}
