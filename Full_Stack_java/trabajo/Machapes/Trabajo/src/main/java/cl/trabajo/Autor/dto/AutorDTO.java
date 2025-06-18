//Programado y manejado por Sebastian Gonzalez
package cl.trabajo.Autor.dto;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import cl.trabajo.Libro.dto.LibroDTO;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Digits;
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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "autor_seq")
    @SequenceGenerator(name = "autor_seq", sequenceName = "autor_seq", allocationSize = 1)
    private int idAutor;

    @Column(name = "nombreAutor")
    @NotBlank(message = "El Nombre del Autor no puede estar en Blanco")
    @Size(max = 30, message = "El Nombre de Autor no puede tener mas de 30 Caracteres")
    private String nombreAutor;

    @Column(name = "apellidoAutor")
    @NotBlank(message = "El Apellido de Autor no puede estar en Blanco")
    @Size(max = 30, message = "El Apellido de Autor no puede tener mas de 30 Caracteres")
    private String apellidoAutor;
    
    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference ("autor-libro")
    private List<LibroDTO> libros;

    /*@ManyToOne
    @JoinColumn(name = "idLibro")
    @JsonBackReference
    private LibroDTO libro;*/

}
