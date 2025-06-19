package cl.trabajo.Libro.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import cl.trabajo.Autor.dto.AutorDTO;
import cl.trabajo.Categoria.dto.CategoriaDTO;
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
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "libro_seq")
    @SequenceGenerator(name = "libro_seq", sequenceName = "libro_seq", allocationSize = 1)
    private Integer idLibro;

    @NotBlank(message = "El título no puede estar vacío")
    @Size(max = 100, message = "El título no puede tener más de 100 caracteres")
    @Column(name = "titulo")
    private String titulo;

    @NotNull(message = "El ISBN es obligatorio")
    @Min(value = 1, message = "El ISBN debe ser un número positivo")
    @Column(name = "isbn")
    private String isbn;

    @ManyToOne
    @JoinColumn(name = "categoria",nullable = false)
    @JsonBackReference ("categoria-libro") 
    private CategoriaDTO categoria;
    
    @ManyToOne
    @JoinColumn(name = "idAutor",nullable = false)
    @JsonBackReference ("autor-libro") 
    private AutorDTO autor;

    @OneToMany(mappedBy = "libro", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference("libro-copias")
    private List<CopiaLibroDTO> copias = new ArrayList<>();
}
