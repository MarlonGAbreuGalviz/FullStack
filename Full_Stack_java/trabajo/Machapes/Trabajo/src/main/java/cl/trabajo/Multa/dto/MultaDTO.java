package cl.trabajo.Multa.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity; 
import jakarta.persistence.Id; 
import jakarta.persistence.Table; 
import lombok.AllArgsConstructor; 
import lombok.Getter; 
import lombok.NoArgsConstructor; 
import lombok.Setter;

@Entity // Se usa para definir la entidad
@Table(name = "multa")  // Se usa para definir la tabla
@Getter // Se usa para definir el getter
@Setter // Se usa para definir el setter
@AllArgsConstructor // Se usa para definir el constructor con todos los atributos
@NoArgsConstructor // Se usa para definir el constructor sin atributos
/**
 *  hecho por: Juan Valenzuela
 */
public class MultaDTO {
    @Id
    private int idMulta;
    @Column(name = "tipoMulta")
    private String tipoMulta;
    @Column(name = "monto")
    private int monto;
    @Column(name = "rut")
    private int rut;
}
