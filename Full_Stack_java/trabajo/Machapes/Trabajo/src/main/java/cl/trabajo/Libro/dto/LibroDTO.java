package cl.trabajo.Libro.dto;

import cl.trabajo.Autor.dto.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    private int idLibro;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "isbn")
    private int isbn;
    @Column(name = "stock")
    private int stock;
    @Column(name = "idAutor")
    private int idAutor;
    private AutorDTO autor;
}
