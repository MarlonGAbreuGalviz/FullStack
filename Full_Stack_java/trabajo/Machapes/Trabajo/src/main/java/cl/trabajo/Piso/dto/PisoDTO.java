package cl.trabajo.Piso.dto;


import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import cl.trabajo.Pasillo.dto.PasilloDTO;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "piso_seq")
    @SequenceGenerator(name = "piso_seq", sequenceName = "piso_seq", allocationSize = 1)
    private int idPiso;

    @Column(name = "nombre")
    private String nombre;  // Ej: "Planta Baja", "Primer Piso"

    @OneToMany(mappedBy = "piso", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference("piso-pasillo")
    private List<PasilloDTO> pasillos = new ArrayList<>();
}
