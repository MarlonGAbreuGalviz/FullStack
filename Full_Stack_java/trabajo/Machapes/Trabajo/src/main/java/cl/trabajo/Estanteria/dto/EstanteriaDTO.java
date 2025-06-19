package cl.trabajo.Estanteria.dto;


import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import cl.trabajo.CopiaLibro.dto.CopiaLibroDTO;
import cl.trabajo.Pasillo.dto.PasilloDTO;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "estanteria")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EstanteriaDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estanteria_seq")
    @SequenceGenerator(name = "estanteria_seq", sequenceName = "estanteria_seq", allocationSize = 1)
    private int idEstanteria;

    @Column(name = "codigo")
    private String codigo;  // Ej: "EST-001"

    @ManyToOne
    @JoinColumn(name = "idPasillo")
    @JsonBackReference("pasillo-estanteria")
    private PasilloDTO pasillo;

    @OneToMany(mappedBy = "estanteria", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference("estanteria-copias")
    private List<CopiaLibroDTO> copiasLibro = new ArrayList<>();
}
