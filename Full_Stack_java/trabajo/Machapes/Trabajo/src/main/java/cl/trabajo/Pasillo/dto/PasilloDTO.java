package cl.trabajo.Pasillo.dto;


import cl.trabajo.Piso.dto.PisoDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "pasillo")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PasilloDTO {
    @Id
    private int idPasillo;
    @Column(name = "pasillo")
    private int pasillo;
    @OneToOne
    @JoinColumn(name = "idPiso")
    private PisoDTO piso;

}
