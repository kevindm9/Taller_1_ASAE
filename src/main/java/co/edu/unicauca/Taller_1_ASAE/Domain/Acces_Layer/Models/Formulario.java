package co.edu.unicauca.Taller_1_ASAE.Domain.Acces_Layer.Models;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Formulario {

    private Integer idFormulario;
    private String tipo;
    private ArrayList<Pregunta> preguntas;
    private String formato;
    
}
