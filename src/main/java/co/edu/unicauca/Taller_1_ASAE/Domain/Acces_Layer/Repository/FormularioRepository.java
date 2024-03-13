package co.edu.unicauca.Taller_1_ASAE.Domain.Acces_Layer.Repository;

import java.util.ArrayList;


import org.springframework.stereotype.Repository;

import co.edu.unicauca.Taller_1_ASAE.Domain.Acces_Layer.Models.ERespuesta;
import co.edu.unicauca.Taller_1_ASAE.Domain.Acces_Layer.Models.Formulario;
import co.edu.unicauca.Taller_1_ASAE.Domain.Acces_Layer.Models.Pregunta;

@Repository
public class FormularioRepository {

    private ArrayList<Formulario> listaFormatoA;

    public FormularioRepository() {
        this.listaFormatoA = new ArrayList<Formulario>();
        this.cargarFormatos();
    }

    public ArrayList<Formulario> findAll() {
        System.out.println("Invocando a Listar Formulario");
        return this.listaFormatoA;
    }

    public Formulario findById(Integer id) {
        System.out.println("Invocando a consultar un Formulario");
        Formulario objFormatoA = null;

        for (Formulario formatoA : listaFormatoA) {
            if (formatoA.getIdFormulario() == id) {
                objFormatoA = formatoA;
                break;
            }
        }

        return objFormatoA;
    }

    public Formulario save(Formulario formatoA) {
        System.out.println("Invocando a almacenar un Formulario");
        Formulario objFormatoA = null;
        if (this.listaFormatoA.add(formatoA)) {
            objFormatoA = formatoA;
        }

        return objFormatoA;
    }

    public Formulario update(Integer id, Formulario formatoA) {
        System.out.println("Invocando a actualizar un Formulario");
        Formulario objFormatoA = null;

        for (int i = 0; i < this.listaFormatoA.size(); i++) {
            if (this.listaFormatoA.get(i).getIdFormulario() == id) {
                this.listaFormatoA.set(i, formatoA);
                objFormatoA = formatoA;
                break;
            }
        }

        return objFormatoA;
    }

    public boolean delete(Integer id) {
        System.out.println("Invocando a eliminar un Formulario");
        boolean bandera = false;

        for (int i = 0; i < this.listaFormatoA.size(); i++) {
            if (this.listaFormatoA.get(i).getIdFormulario() == id) {
                this.listaFormatoA.remove(i);
                bandera = true;
                break;
            }
        }

        return bandera;
    }

    public void cargarFormatos() {
        ArrayList<Pregunta> preguntasL=new ArrayList<Pregunta>();
        Pregunta p =new Pregunta("El ruido en el lugar donde trabaja es Molesto", ERespuesta.Algunas_Veces);
        preguntasL.add(p);
        Pregunta p1 =new Pregunta("En el lugar donde trabaja hace mucho frio", ERespuesta.Casi_Siempre);
        preguntasL.add(p1);
        Pregunta p2 =new Pregunta("En el lugar donde trabaja hace mucho calor", ERespuesta.Casi_Nunca);
        preguntasL.add(p2);
        Pregunta p3 =new Pregunta("El aire en el lugar de trabajo es fresco", ERespuesta.Casi_Siempre);
        preguntasL.add(p3);
        Pregunta p4 =new Pregunta("La luz en el lugar de trabajo es agradable", ERespuesta.Siempre);
        preguntasL.add(p4);
        Formulario F1= new Formulario(1, "Factores de psicosocial intro",preguntasL , "Formato A");
        listaFormatoA.add(F1);
        Formulario F2= new Formulario(1, "Factores de psicosocial intro",preguntasL , "Formato B");
        listaFormatoA.add(F2);
    }
}
