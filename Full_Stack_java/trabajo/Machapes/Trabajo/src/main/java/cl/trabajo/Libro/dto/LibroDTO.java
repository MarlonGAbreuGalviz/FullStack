package cl.trabajo.Libro.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import cl.trabajo.Autor.dto.AutorDTO;
import cl.trabajo.CopiaLibro.dto.CopiaLibroDTO;
import jakarta.persistence.CascadeType;

// import cl.trabajo.Autor.dto.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "libro")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class LibroDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLibro;

    @Column(name = "titulo")
    @NotNull(message = "titulo is required")
    private String titulo;

    @Column(name = "isbn")
    @NotNull(message = "isbn is required")
    private String isbn;

    @ManyToOne
    @JoinColumn(name = "idAutor")
    @JsonBackReference
    private AutorDTO autor;

    @OneToMany(mappedBy = "libro", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<CopiaLibroDTO> CopiaLibro;

    
}
