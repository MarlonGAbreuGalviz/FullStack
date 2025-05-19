package cl.trabajo.Prestamo.dto;

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
@Table(name = "prestamo")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
/**
 *  hecho por: Juan Valenzuela
 */
public class PrestamoDTO {
    @Id
    private int idPrestamo;
    @Column(name = "idLibro")
    private int idLibro;
    @Column(name = "idUsuario")
    private int idUsuario;
    @Column(name = "fecPrestamo")
    private LocalDate fecPrestamo;
    @Column(name = "fecDevolucion")
    private LocalDate fecDevolucion;
}
