package cl.trabajo.Donacion.dto;

import java.time.LocalDate;

import cl.trabajo.Libro.dto.LibroDTO;
import cl.trabajo.Usuario.dto.UsuarioDTO;
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
    @Column(name = "fecDonacion")
    private LocalDate fecDonacion;
    @Column(name = "idLibro")
    private int idLibro;
    @Column(name = "idUsuario")
    private int idUsuario;
    //private LibroDTO libroClase;
    //private UsuarioDTO usuarioClase;
}
