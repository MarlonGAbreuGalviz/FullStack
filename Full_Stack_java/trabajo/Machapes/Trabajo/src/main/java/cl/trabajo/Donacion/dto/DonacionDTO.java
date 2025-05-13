package cl.trabajo.Donacion.dto;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "donacion")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class DonacionDTO {
    @Id
    private int idDonacion;
    @Column(name = "fec_donacion")
    private LocalDate fecDonacion;
    @Column(name = "id_libro")
    private int idLibro;
    @Column(name = "id_usuario")
    private int idUsuario;

}
