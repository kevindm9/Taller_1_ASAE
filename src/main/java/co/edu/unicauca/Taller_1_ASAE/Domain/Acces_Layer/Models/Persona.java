package co.edu.unicauca.Taller_1_ASAE.Domain.Acces_Layer.Models;


import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Persona {

    private Integer id;
	private String nombre;
	private String apellido;
	private String email;
    private Boolean Autorizo;
    private String ciudad;
    private EGenero genero;
    private EEstadoCivil estadoCivil;
    private ArrayList<Formulario> formularios;
}