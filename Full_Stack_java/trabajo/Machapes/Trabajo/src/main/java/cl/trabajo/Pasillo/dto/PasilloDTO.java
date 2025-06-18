package cl.trabajo.Pasillo.dto;


import cl.trabajo.Piso.dto.PisoDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pasillo_seq")
    @SequenceGenerator(name = "pasillo_seq", sequenceName = "pasillo_seq", allocationSize = 1)
    private int idPasillo;

    @NotBlank(message = "El nombre del pasillo no puede estar vacío")
    @Column(name = "pasillo", nullable = false, unique = true)
    private String pasillo;

    @NotNull(message = "Debe asignarse un piso al pasillo")
    @OneToOne
    @JoinColumn(name = "idPiso", nullable = false)
    private PisoDTO piso;

}
