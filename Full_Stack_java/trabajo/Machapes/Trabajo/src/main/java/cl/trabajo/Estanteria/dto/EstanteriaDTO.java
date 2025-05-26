package cl.trabajo.Estanteria.dto;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
    private int idEstanteria;
    @Column(name = "estanteria")
    private int estanteria;
}
