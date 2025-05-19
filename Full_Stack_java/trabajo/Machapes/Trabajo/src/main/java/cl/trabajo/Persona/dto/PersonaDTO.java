package cl.trabajo.Persona.dto;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
/**
 *  hecho por: Juan Valenzuela
 */
public class PersonaDTO {
    @Id
    private int rut;
    @Column(name = "dv")
    private String dv;
    @Column(name = "pNombre")
    private String pNombre;
    @Column(name = "sNombre")
    private String sNombre;
    @Column(name = "apPaterno")
    private String apPaterno;
    @Column(name = "apMaterno")
    private String apMaterno;
    @Column(name = "fecNacimiento")
    private Date fecNacimiento;
    @Column(name = "idUsuario")
    private int idUsuario;
    
  
}
