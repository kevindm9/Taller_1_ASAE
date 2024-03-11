package co.edu.unicauca.Taller_1_ASAE.Domain.Service_Layer.DTO;

import co.edu.unicauca.Taller_1_ASAE.Domain.Acces_Layer.Models.ERespuesta;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class FormularioDTO {

    private Integer id;
    private String descripcion;
    private String formato;
    private ERespuesta respuesta;

}
