package cl.trabajo.Autor.dto;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import cl.trabajo.Libro.dto.LibroDTO;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
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
    @NotNull(message = "idAutor is required")
    private int idAutor;

    @Column(name = "nombreAutor")
    @NotBlank(message = "nombreAutor is required")
    @Size(max = 30, message = "nombreAutor must be at most 100 characters")
    private String nombreAutor;

    @Column(name = "apellidoAutor")
    @NotBlank(message = "apellidoAutor is required")
    @Size(max = 100, message = "apellidoAutor must be at most 100 characters")
    private String apellidoAutor;
    
    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<LibroDTO> libros;

    /*@ManyToOne
    @JoinColumn(name = "idLibro")
    @JsonBackReference
    private LibroDTO libro;*/

}
