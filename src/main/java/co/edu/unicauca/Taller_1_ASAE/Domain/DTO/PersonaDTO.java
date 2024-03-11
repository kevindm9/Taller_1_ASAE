package co.edu.unicauca.Taller_1_ASAE.Domain.DTO;
import co.edu.unicauca.Taller_1_ASAE.Domain.Models.EEstadoCivil;
import co.edu.unicauca.Taller_1_ASAE.Domain.Models.EGenero;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class PersonaDTO {

    private Integer id;
	private String nombre;
	private String apellido;
	private String email;
    private Boolean autorizo=true;
    private String ciudad;
    private EGenero genero;
    private EEstadoCivil estadoCivil;
    

    public PersonaDTO(){



    }

}
