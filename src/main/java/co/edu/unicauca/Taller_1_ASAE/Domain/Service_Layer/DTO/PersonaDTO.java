package co.edu.unicauca.Taller_1_ASAE.Domain.Service_Layer.DTO;
import java.util.ArrayList;

import co.edu.unicauca.Taller_1_ASAE.Domain.Acces_Layer.Models.EEstadoCivil;
import co.edu.unicauca.Taller_1_ASAE.Domain.Acces_Layer.Models.EGenero;
import co.edu.unicauca.Taller_1_ASAE.Domain.Acces_Layer.Models.Formulario;
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
    private Boolean Autorizo;
    private String ciudad;
    private EGenero genero;
    private EEstadoCivil estadoCivil;
    private ArrayList<Formulario> formularios;
    

    public PersonaDTO(){



    }

}
