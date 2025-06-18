package cl.trabajo.CopiaLibro.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;

import cl.trabajo.Libro.dto.LibroDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "copia_libro_seq")
    @SequenceGenerator(name = "copia_libro_seq", sequenceName = "copia_libro_seq", allocationSize = 1)
    private Integer idCopiaLibro;

    @NotNull(message = "El estado de la copia es obligatorio")
    @Column(name = "estado", nullable = false)
    private Boolean estado; // true = activa, false = inactiva

    @NotNull(message = "Debe estar asociada a un libro")
    @ManyToOne
    @JoinColumn(name = "idLibro", nullable = false)
    @JsonBackReference
    private LibroDTO libro;

    


}
