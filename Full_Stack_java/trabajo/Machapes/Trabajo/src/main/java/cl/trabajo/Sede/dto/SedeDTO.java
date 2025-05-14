package cl.trabajo.Sede.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "sede")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class SedeDTO {
    @Id
    private int idSede;
    @Column(name = "nombreSede")
    private String nombreSede;
    @Column(name = "comuna")
    private String comuna;
    @Column(name = "direccion")
    private String direccion;
}
