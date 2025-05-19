//Clase hecha x sebastian gonzalez

package cl.trabajo.Ubicacion.dto;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ubicacion")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UbicacionDTO {
    @Id
    private int idUbicacion;
    @Column(name = "piso")
    private int piso;
    @Column(name = "estanteria")
    private String estanteria;

}
