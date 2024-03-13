package co.edu.unicauca.Taller_1_ASAE.Domain.Acces_Layer.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import co.edu.unicauca.Taller_1_ASAE.Domain.Acces_Layer.Models.EEstadoCivil;
import co.edu.unicauca.Taller_1_ASAE.Domain.Acces_Layer.Models.EGenero;
import co.edu.unicauca.Taller_1_ASAE.Domain.Acces_Layer.Models.Formulario;
import co.edu.unicauca.Taller_1_ASAE.Domain.Acces_Layer.Models.Persona;


@Repository
public class PersonaRepository {

	private ArrayList<Persona> listaDePErsonas;
	private FormularioRepository formularioRepository=new FormularioRepository();

	public PersonaRepository() {
		this.listaDePErsonas = new ArrayList<Persona>();
		cargarClientes();
		//this.formularioRepository.cargarFormatos();
	}

	public List<Persona> findAll() {
		System.out.println("Invocando a Lista de Personas");
		return this.listaDePErsonas;
	}

	public Persona findById(Integer id) {
		System.out.println("Invocando a consultar una Persona");
		Persona objCliente = null;

		for (Persona cliente : listaDePErsonas) {
			if (cliente.getId() == id) {
				objCliente = cliente;
				break;
			}
		}

		return objCliente;
	}

	public Persona save(Persona cliente) {
		System.out.println("Invocando a almacenar Persona");
		Persona objCliente = null;
		if (this.listaDePErsonas.add(cliente)) {
			objCliente = cliente;
		}

		return objCliente;
	}

	public Persona update(Integer id, Persona cliente) {
		System.out.println("Invocando a actualizar una Persona");
		Persona objCliente = null;

		for (int i = 0; i < this.listaDePErsonas.size(); i++) {
			if (this.listaDePErsonas.get(i).getId() == id) {
				this.listaDePErsonas.set(i, cliente);
				objCliente = cliente;
				break;
			}
		}

		return objCliente;
	}

	public boolean delete(Integer id) {
		System.out.println("Invocando a eliminar una Persona");
		boolean bandera = false;

		for (int i = 0; i < this.listaDePErsonas.size(); i++) {
			if (this.listaDePErsonas.get(i).getId() == id) {
				this.listaDePErsonas.remove(i);
				bandera = true;
				break;
			}
		}

		return bandera;
	}

	private void cargarClientes() {

		ArrayList<Formulario> F =new ArrayList<Formulario>();
		F=formularioRepository.findAll();
		Persona objCliente1 = new Persona(1, "Juan", "Perez", "juan@unicauca.edu.co", true,"Popayan",EGenero.Masculino,EEstadoCivil.Soltero,F);
		this.listaDePErsonas.add(objCliente1);
		Persona objCliente2 = new Persona(2, "Catalina", "Lopez", "catalina@unicauca.edu.co", true,"Popayan",EGenero.Femenino,EEstadoCivil.Casado,F);
		this.listaDePErsonas.add(objCliente2);
		Persona objCliente3 = new Persona(3, "Sandra", "Sanchez", "Sandra@unicauca.edu.co",  true,"Popayan",EGenero.Femenino,EEstadoCivil.Soltero,F);
		this.listaDePErsonas.add(objCliente3);
		Persona objCliente = new Persona(4, "Andres", "Perez", "andres@unicauca.edu.co",  true,"Popayan",EGenero.Masculino,EEstadoCivil.Divorciado,F);
		this.listaDePErsonas.add(objCliente);
	}

}