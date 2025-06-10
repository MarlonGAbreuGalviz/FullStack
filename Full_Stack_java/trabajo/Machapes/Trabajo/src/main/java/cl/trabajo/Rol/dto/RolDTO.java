//Programado y manejado por Sebastian Gonzalez

package cl.trabajo.Rol.dto;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import cl.trabajo.Usuario.dto.UsuarioDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Table(name = "rol")
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties("usuarios")
public class RolDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rol_seq")
    @SequenceGenerator(name = "rol_seq", sequenceName = "rol_seq", allocationSize = 1)
    private int idRol;

    @NotBlank(message = "El nombre del rol no puede estar vacío")
    @Column(name = "rol", nullable = false, unique = true)
    private String rol;

    @OneToMany(mappedBy = "rol")
    private List<UsuarioDTO> usuarios;
}
