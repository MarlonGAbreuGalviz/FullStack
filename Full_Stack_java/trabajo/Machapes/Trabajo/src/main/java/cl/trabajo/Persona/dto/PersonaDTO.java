//Programado y manejado por Sebastian Gonzalez

package cl.trabajo.Persona.dto;

import java.sql.Date;

// Imports Jakarta para estructurar tabla
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Import Jakarta Validadores

import jakarta.validation.constraints.NotBlank; //Validar para que el Str no este vacio
import jakarta.validation.constraints.NotNull; //Validar valores para que no sean Nulos
import jakarta.validation.constraints.Digits; //Validar tamaño de Int
import jakarta.validation.constraints.Past; //Validar digito en pasado (para datos formato DATE)
import jakarta.validation.constraints.Positive; //Validar digito para que sea Positivo
import jakarta.validation.constraints.Size; //Validar tamaño de Str

//Import Lombok Constructores
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "Persona")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class PersonaDTO {
    @Id
    @NotNull(message = "Es requerido asignar una ID")
    @Digits(integer = 10, fraction = 0, message = "La ID debe tener hasta 10 dígitos y sin decimales") //Integer = 10 (max 10 digitos enteros), fraction = 0 (max 0 digitos decimales)
    private Integer rut;

    @NotBlank(message = "Se requiere el dígito verificador")
    @Size(max = 1, message = "El dígito verificador debe ser de 1 carácter")
    private String dv;

    @Size(max = 50, message = "El primer nombre puede tener hasta 50 caracteres")
    private String pNombre;

    @Size(max = 50, message = "El segundo nombre puede tener hasta 50 caracteres")
    private String sNombre;

    @Size(max = 50, message = "El apellido paterno puede tener hasta 50 caracteres")
    private String apPaterno;

    @Size(max = 50, message = "El apellido materno puede tener hasta 50 caracteres")
    private String apMaterno;

    @Past(message = "La fecha de nacimiento debe ser una fecha en el pasado")
    @NotNull(message = "La fecha de nacimiento es obligatoria")
    private Date fecNacimiento;

    @NotNull(message = "El ID de usuario es obligatorio")
    @Positive(message = "El ID de usuario debe ser un número positivo")
    private Integer idUsuario;
}
