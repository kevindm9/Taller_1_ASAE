package co.edu.unicauca.Taller_1_ASAE.Domain.Acces_Layer.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
public class Pregunta {

 private String descripcion;   
 private ERespuesta respuesta;
 Pregunta(){


 }
}
