package cl.trabajo.Multa.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;

import cl.trabajo.Usuario.dto.UsuarioDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;


@Entity 
@Table(name = "multa")  
@Data
@AllArgsConstructor 
@NoArgsConstructor 

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
    @JsonBackReference
    @JoinColumn(name = "idUsuario")
    private UsuarioDTO usuario;
}
