package co.edu.unicauca.Taller_1_ASAE.Domain.Acces_Layer.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Formulario {

    private Integer id;
    private String tipo;
    private String descripcion;
    private String formato;
    private ERespuesta respuesta;

}
