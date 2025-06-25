//Programado y manejado por Sebastian Gonzalez

package cl.trabajo.Usuario.dto;


import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import cl.trabajo.Libro.dto.LibroDTO;
import cl.trabajo.Multa.dto.MultaDTO;
import cl.trabajo.Persona.dto.PersonaDTO;
import cl.trabajo.Rol.dto.RolDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Table(name = "usuario")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

/**
 * DTO (Data Transfer Object) para la entidad Usuario.
 */


public class UsuarioDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_seq")
    @SequenceGenerator(name = "usuario_seq", sequenceName = "usuario_seq", allocationSize = 1)
    private int idUsuario;
 
    @NotBlank(message = "El correo electrónico no puede estar vacío")
    @Email(message = "Debe ingresar un correo electrónico válido")
    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @NotBlank(message = "El nombre de usuario no puede estar vacío")
    @Column(name = "usuario", nullable = false, unique = true)
    private String usuario;

    @NotBlank(message = "La contraseña no puede estar vacía")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Column(name = "contrasena", nullable = false)
    private String contrasena;

    // Asociación con la entidad Rol
    @NotNull(message = "Debe asignarse un rol al usuario")
    @ManyToOne
    @JoinColumn(name = "idRol")
    //@JsonIgnoreProperties(value = {"rol"})
    private RolDTO rol;

    @OneToOne
    @JoinColumn(name = "rut", nullable = false)
    @JsonBackReference("persona-usuario")
    private PersonaDTO persona;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference ("usuario-multa")
    private List<MultaDTO> multas = new ArrayList<>();

    //@OneToOne
    //@JsonManagedReference("usuario-rol")
    //private RolDTO rol;
}
