package co.edu.unicauca.Taller_1_ASAE.Domain.Service_Layer.DTO;

import java.util.ArrayList;


import co.edu.unicauca.Taller_1_ASAE.Domain.Acces_Layer.Models.Pregunta;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class FormularioDTO {

     private Integer id;
    private String tipo;
    private ArrayList<Pregunta> preguntas;
    private String formato;
}
