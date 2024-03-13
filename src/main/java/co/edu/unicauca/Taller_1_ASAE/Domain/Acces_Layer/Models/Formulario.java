package co.edu.unicauca.Taller_1_ASAE.Domain.Acces_Layer.Models;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Formulario {

    private Integer id;
    private String tipo;
    private ArrayList<Pregunta> preguntas;
    private String formato;
    private Integer idPersona;
}
