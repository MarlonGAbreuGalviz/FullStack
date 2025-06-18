package cl.trabajo.Donacion.dto;

import java.time.LocalDate;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

import cl.trabajo.Libro.dto.LibroDTO;
import cl.trabajo.Usuario.dto.UsuarioDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "donacion")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class DonacionDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "donacion_seq")
    @SequenceGenerator(name = "donacion_seq", sequenceName = "donacion_seq", allocationSize = 1)
    private int idDonacion;


    @NotNull(message = "La fecha de donación es obligatoria")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate fecDonacion;


    @NotNull(message = "El libro asociado es obligatorio")
    @ManyToOne
    @JoinColumn(name = "idLibro")
    @JsonIgnoreProperties({"titulo", "isbn", "stock", "numeroCopia", "copias"})
    private LibroDTO libro;


    @NotNull(message = "El usuario donante es obligatorio")
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    @JsonIgnoreProperties({"email", "usuario", "rol"}) 
    private UsuarioDTO usuario;

}
