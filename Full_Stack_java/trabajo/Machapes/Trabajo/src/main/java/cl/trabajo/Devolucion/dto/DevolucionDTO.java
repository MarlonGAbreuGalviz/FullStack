package cl.trabajo.Devolucion.dto;

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
@Table(name = "devolucion")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DevolucionDTO {
    @Id
    private int idDevolucion;
    @Column(name = "devuelto")
    private boolean devuelto;
    @Column(name = "fecDevolucion")
    private LocalDate fecDevolucion;
    @Column(name = "idPrestamo")
    private int idPrestamo;
}
