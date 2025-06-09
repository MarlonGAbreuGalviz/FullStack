package cl.trabajo.Multa.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import cl.trabajo.CopiaLibro.dto.CopiaLibroDTO;
import cl.trabajo.Usuario.dto.UsuarioDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;


@Entity // Se usa para definir la entidad
@Table(name = "multa")  // Se usa para definir la tabla
@Getter // Se usa para definir el getter
@Setter // Se usa para definir el setter
@AllArgsConstructor // Se usa para definir el constructor con todos los atributos
@NoArgsConstructor // Se usa para definir el constructor sin atributos
/**
 *  hecho por: Juan Valenzuela
 */
public class MultaDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "multa_seq")
    @SequenceGenerator(name = "multa_seq", sequenceName = "multa_seq", allocationSize = 1)
    private int idMulta;

    @NotBlank(message = "El tipo de multa no puede estar vacío")
    @Column(name = "tipoMulta")
    private String tipoMulta;

    @Positive(message = "El monto debe ser mayor a cero")
    @Column(name = "monto")
    private int monto;
    
    @NotNull(message = "Debe asignarse un usuario a la multa")
    @ManyToOne
    @JsonIgnoreProperties({"email", "usuario", "rol"})
    @JoinColumn(name = "idUsuario")
    private UsuarioDTO usuario;
    

    @ManyToOne
    @JoinColumn(name = "idCopiaLibro")
    @JsonIgnoreProperties({"estado", "numeroCopia", "libro"})
    private CopiaLibroDTO copiaLibro;
}
