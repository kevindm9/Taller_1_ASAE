package co.edu.unicauca.Taller_1_ASAE.Domain.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import co.edu.unicauca.Taller_1_ASAE.Domain.Models.EEstadoCivil;
import co.edu.unicauca.Taller_1_ASAE.Domain.Models.EGenero;
import co.edu.unicauca.Taller_1_ASAE.Domain.Models.Persona;



@Repository
public class PersonaRepository {

	private ArrayList<Persona> listaDePErsonas;

	public PersonaRepository() {
		this.listaDePErsonas = new ArrayList<Persona>();
		cargarClientes();
	}

	public List<Persona> findAll() {
		System.out.println("Invocando a Lista de Personas");
		return this.listaDePErsonas;
	}

	public Persona findById(Integer id) {
		System.out.println("Invocando a consultar un cliente");
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
		System.out.println("Invocando a almacenar cliente");
		Persona objCliente = null;
		if (this.listaDePErsonas.add(cliente)) {
			objCliente = cliente;
		}

		return objCliente;
	}

	public Persona update(Integer id, Persona cliente) {
		System.out.println("Invocando a actualizar un cliente");
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
		System.out.println("Invocando a eliminar un cliente");
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
		Persona objCliente1 = new Persona(1001, "Juan", "Perez", "juan@unicauca.edu.co", true,"Popayan",EGenero.Masculino,EEstadoCivil.Soltero);
		this.listaDePErsonas.add(objCliente1);
		Persona objCliente2 = new Persona(2, "Catalina", "Lopez", "catalina@unicauca.edu.co", true,"Popayan",EGenero.Femenino,EEstadoCivil.Casado);
		this.listaDePErsonas.add(objCliente2);
		Persona objCliente3 = new Persona(3, "Sandra", "Sanchez", "Sandra@unicauca.edu.co",  true,"Popayan",EGenero.Femenino,EEstadoCivil.Soltero);
		this.listaDePErsonas.add(objCliente3);
		Persona objCliente = new Persona(4, "Andres", "Perez", "andres@unicauca.edu.co",  true,"Popayan",EGenero.Masculino,EEstadoCivil.Divorciado);
		this.listaDePErsonas.add(objCliente);
	}

}