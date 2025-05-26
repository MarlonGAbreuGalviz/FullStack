package cl.trabajo.Pasillo.dto;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
}
