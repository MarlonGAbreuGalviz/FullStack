package cl.trabajo.Rol.dto;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "rol")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RolDTO {
    @Id
    private int idRol;
    @Column(name = "rol")
    private String rol;
}
