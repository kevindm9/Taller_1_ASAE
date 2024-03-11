package co.edu.unicauca.Taller_1_ASAE.Domain.Service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unicauca.Taller_1_ASAE.Domain.DTO.PersonaDTO;
import co.edu.unicauca.Taller_1_ASAE.Domain.Models.Persona;
import co.edu.unicauca.Taller_1_ASAE.Domain.Repository.PersonaRepository;

@Service
public class PersonaService implements IPersonaService {

	@Autowired
	private PersonaRepository servicioAccesoBaseDatos;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<PersonaDTO> findAll() {

		List<Persona> Persona = this.servicioAccesoBaseDatos.findAll();
		List<PersonaDTO> PersonaDTO = this.modelMapper.map(Persona, new TypeToken<List<PersonaDTO>>() {
		}.getType());
		return PersonaDTO;
	}

	@Override
	public PersonaDTO findById(Integer id) {
		Persona objCLienteEntity = this.servicioAccesoBaseDatos.findById(id);
		PersonaDTO clienteDTO = this.modelMapper.map(objCLienteEntity, PersonaDTO.class);
		return clienteDTO;
	}

	@Override
	public PersonaDTO save(PersonaDTO cliente) {
		Persona persona = this.modelMapper.map(cliente, Persona.class);
		Persona objCLienteEntity = this.servicioAccesoBaseDatos.save(persona);
		PersonaDTO personaDTO = this.modelMapper.map(objCLienteEntity, PersonaDTO.class);
		return personaDTO;
	}

	@Override
	public PersonaDTO update(Integer id, PersonaDTO cliente) {
		Persona clienteEntity = this.modelMapper.map(cliente, Persona.class);
		Persona clienteEntityActualizado = this.servicioAccesoBaseDatos.update(id, clienteEntity);
		PersonaDTO clienteDTO = this.modelMapper.map(clienteEntityActualizado, PersonaDTO.class);
		return clienteDTO;
	}

	@Override
	public boolean delete(Integer id) {
		return this.servicioAccesoBaseDatos.delete(id);
	}


}
