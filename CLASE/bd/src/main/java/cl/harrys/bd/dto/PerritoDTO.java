package cl.harrys.bd.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity   

@Table(name="perritos_Marlon")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PerritoDTO {
    @Id
    private String codigo;
    @Column(name="nombre")
    private String nombrePerrito;
    private int edad;
}
