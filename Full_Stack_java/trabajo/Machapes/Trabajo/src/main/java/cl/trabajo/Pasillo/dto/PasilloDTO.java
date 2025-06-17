package cl.trabajo.Pasillo.dto;


import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import cl.trabajo.Estanteria.dto.EstanteriaDTO;
import cl.trabajo.Piso.dto.PisoDTO;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPasillo;

    @Column(name = "nombre")
    private String nombre;  // Ej: "Pasillo A", "Pasillo B"

    @ManyToOne
    @JoinColumn(name = "idPiso")
    @JsonBackReference
    private PisoDTO piso;

    @OneToMany(mappedBy = "pasillo", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<EstanteriaDTO> estanterias = new ArrayList<>();
}
