package co.edu.unicauca.Taller_1_ASAE.Domain.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unicauca.Taller_1_ASAE.Domain.DTO.PersonaDTO;
import co.edu.unicauca.Taller_1_ASAE.Domain.Service.IPersonaService;

@RestController
@RequestMapping("/api")
public class PersonaController {
@Autowired
	private IPersonaService clienteService;

	@GetMapping("/Persona")
	public List<PersonaDTO> index() {
		return clienteService.findAll();
	}

	@GetMapping("/Persona/{id}")
	public PersonaDTO show(@PathVariable Integer id) {
		PersonaDTO objCliente = null;
		objCliente = clienteService.findById(id);
		return objCliente;
	}

	@GetMapping("clientes2/{name}/{age}")
	public String getMessage(@PathVariable String name,
			@PathVariable("age") String edad) {
		String msg = String.format("%s es %s años viejo", name, edad);
		System.out.println(msg);
		return msg;
	}

	@GetMapping("consultarClientes")
	public String getMessageParametros(@RequestParam String nombres,
			@RequestParam String apellidos) {
		String msg = String.format("buscando un cliente por nombre: %s, apellidos: %s", nombres, apellidos);
		System.out.println(msg);
		return msg;
	}

	@PostMapping("/Persona")
	public PersonaDTO create(@RequestBody PersonaDTO cliente) {
		PersonaDTO objCliente = null;
		objCliente = clienteService.save(cliente);
		return objCliente;
	}

	@PutMapping("/clientes/{id}")
	public PersonaDTO update(@RequestBody PersonaDTO cliente, @PathVariable Integer id) {
		PersonaDTO objCliente = null;
		PersonaDTO clienteActual = clienteService.findById(id);
		if (clienteActual != null) {
			objCliente = clienteService.update(id, cliente);
		}
		return objCliente;
	}

	@DeleteMapping("/clientes/{id}")
	public Boolean delete(@PathVariable Integer id) {
		Boolean bandera = false;
		PersonaDTO clienteActual = clienteService.findById(id);
		if (clienteActual != null) {
			bandera = clienteService.delete(id);
		}
		return bandera;
	}
}
