package cl.trabajo.Prestamo.dto;

import cl.trabajo.CopiaLibro.dto.CopiaLibroDTO;
import cl.trabajo.Devolucion.dto.DevolucionDTO;
import cl.trabajo.Usuario.dto.UsuarioDTO;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name = "prestamo")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
/**
 *  hecho por: Juan Valenzuela
 */
public class PrestamoDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prestamo_seq")
    @SequenceGenerator(name = "prestamo_seq", sequenceName = "prestamo_seq", allocationSize = 1)
    private int idPrestamo;

    @NotNull(message = "La fecha de préstamo es obligatoria")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Column(name = "fecPrestamo")
    private LocalDate fecPrestamo;

    // Conexiones con otras tablas
    @NotNull(message = "Debe especificar la copia del libro")
    @ManyToOne
    @JoinColumn(name = "idCopiaLibro")
    private CopiaLibroDTO copiaLibroDTO;

    @NotNull(message = "Debe asignarse un usuario al préstamo")
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    @JsonIgnoreProperties({"email", "usuario", "rol"})
    private UsuarioDTO usuario;


    @OneToOne(mappedBy = "prestamo", cascade = CascadeType.ALL)
    @JsonManagedReference
    private DevolucionDTO devolucion;
}
