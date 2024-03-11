package co.edu.unicauca.Taller_1_ASAE.Domain.Acces_Layer.Models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
public class Persona {

    private Integer id;
	private String nombre;
	private String apellido;
	private String email;
    private Boolean Autorizo;
    private String ciudad;
    private EGenero genero;
    private EEstadoCivil estadoCivil;
    

    public Persona(){}
    

}