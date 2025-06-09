package cl.trabajo.Piso.dto;


import cl.trabajo.Pasillo.dto.PasilloDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "piso")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PisoDTO {
    @Id
    private int idPiso;
    @Column(name = "piso")
    private String piso;
    @OneToOne(mappedBy="piso")
    private PasilloDTO pasillo;
}
