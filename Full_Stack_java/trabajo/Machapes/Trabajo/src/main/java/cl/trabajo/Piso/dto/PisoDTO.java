package cl.trabajo.Piso.dto;


import com.fasterxml.jackson.annotation.JsonBackReference;

import cl.trabajo.Pasillo.dto.PasilloDTO;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "piso_seq")
    @SequenceGenerator(name = "piso_seq", sequenceName = "piso_seq", allocationSize = 1)
    private int idPiso;

    @NotBlank(message = "El nombre del piso no puede estar vacío")
    @Column(name = "piso", nullable = false, unique = true)
    private String piso;

    @OneToOne(mappedBy = "piso", cascade = CascadeType.ALL)
    @JsonBackReference
    private PasilloDTO pasillo;

}
