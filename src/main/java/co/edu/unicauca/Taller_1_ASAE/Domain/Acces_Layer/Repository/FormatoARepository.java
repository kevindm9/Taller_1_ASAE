package co.edu.unicauca.Taller_1_ASAE.Domain.Acces_Layer.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import co.edu.unicauca.Taller_1_ASAE.Domain.Acces_Layer.Models.Formulario;

@Repository
public class FormatoARepository {

    private ArrayList<Formulario> listaFormatoA;

    public FormatoARepository() {
        this.listaFormatoA = new ArrayList<Formulario>();
        this.cargarFormatos();
    }

    public List<Formulario> findAll() {
        System.out.println("Invocando a Lista de Personas");
        return this.listaFormatoA;
    }

    public Formulario findById(Integer id) {
        System.out.println("Invocando a consultar un cliente");
        Formulario objFormatoA = null;

        for (Formulario formatoA : listaFormatoA) {
            if (formatoA.getId() == id) {
                objFormatoA = formatoA;
                break;
            }
        }

        return objFormatoA;
    }

    public Formulario save(Formulario formatoA) {
        System.out.println("Invocando a almacenar cliente");
        Formulario objFormatoA = null;
        if (this.listaFormatoA.add(formatoA)) {
            objFormatoA = formatoA;
        }

        return objFormatoA;
    }

    public Formulario update(Integer id, Formulario formatoA) {
        System.out.println("Invocando a actualizar un cliente");
        Formulario objFormatoA = null;

        for (int i = 0; i < this.listaFormatoA.size(); i++) {
            if (this.listaFormatoA.get(i).getId() == id) {
                this.listaFormatoA.set(i, formatoA);
                objFormatoA = formatoA;
                break;
            }
        }

        return objFormatoA;
    }

    public boolean delete(Integer id) {
        System.out.println("Invocando a eliminar un cliente");
        boolean bandera = false;

        for (int i = 0; i < this.listaFormatoA.size(); i++) {
            if (this.listaFormatoA.get(i).getId() == id) {
                this.listaFormatoA.remove(i);
                bandera = true;
                break;
            }
        }

        return bandera;
    }

    private void cargarFormatos() {

    }
}
