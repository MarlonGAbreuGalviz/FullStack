package cl.trabajo.CopiaLibro.dto;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "copiaLibro")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CopiaLibroDTO {
    @Id
    private int idCopiaLibro;
    @Column(name = "nombre")
    private int nombre;
    @Column(name = "estado")
    private int estado;
    @Column(name = "numeroCopia")
    private int numeroCopia;
}
