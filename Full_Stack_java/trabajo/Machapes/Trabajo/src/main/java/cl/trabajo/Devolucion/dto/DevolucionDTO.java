package cl.trabajo.Devolucion.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

import cl.trabajo.Prestamo.dto.PrestamoDTO;
import cl.trabajo.Usuario.dto.UsuarioDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;



@Entity
@Table(name = "devolucion")
@AllArgsConstructor
@NoArgsConstructor
@Data
/**
 * Hecho por: Juan Valenzuela
 */
public class DevolucionDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "devolucion_seq")
    @SequenceGenerator(name = "devolucion_seq", sequenceName = "devolucion_seq", allocationSize = 1)
    private int idDevolucion;


    
    private boolean devuelto;

    @NotNull(message = "La fecha de devolución es obligatoria")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate fecDevolucion;

    
    @NotNull(message = "El préstamo asociado es obligatorio")
    @OneToOne
    @JsonBackReference
    @JoinColumn(name = "idPrestamo")
    private PrestamoDTO prestamo;

    
    @NotNull(message = "El usuario asociado es obligatorio")
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private UsuarioDTO usuario;

}
