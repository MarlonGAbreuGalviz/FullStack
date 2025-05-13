package cl.trabajo.Multa.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "multa")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MultaDTO {
    @Id
    private int idMulta;
    @Column(name = "tipoMulta")
    private String tipoMulta;
    @Column(name = "monto")
    private int monto;
    @Column(name = "rut")
    private int rut;
}
