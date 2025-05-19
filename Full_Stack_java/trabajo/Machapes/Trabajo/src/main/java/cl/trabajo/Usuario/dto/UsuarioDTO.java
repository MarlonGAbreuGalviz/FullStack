package cl.trabajo.Usuario.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "usuario")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UsuarioDTO {
    @Id
    private int idUsuario;
    @Column(name = "idRol")
    private int idRol;
    @Column(name = "rol")
    private String rol;
    @Column(name = "email")
    private String email;
    @Column(name = "usuario")
    private String usuario;

    @Column(name = "contrasena")
    @JsonIgnore
    private String contrasena;

}
