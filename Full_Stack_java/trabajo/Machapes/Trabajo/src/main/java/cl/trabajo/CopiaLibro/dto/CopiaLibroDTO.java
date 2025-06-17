package cl.trabajo.CopiaLibro.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;

import cl.trabajo.Estanteria.dto.EstanteriaDTO;
import cl.trabajo.Libro.dto.LibroDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "copiaLibro")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CopiaLibroDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCopiaLibro;
    
    @Column(name = "copiaActiva")
    @NotNull(message = "titulo is required")
    private boolean copiaActiva;

    @ManyToOne
    @JoinColumn(name = "idEstanteria")
    @JsonBackReference
    private EstanteriaDTO estanteria;

    @ManyToOne
    @JoinColumn(name = "idLibro")
    @JsonBackReference
    private LibroDTO libro;
}
