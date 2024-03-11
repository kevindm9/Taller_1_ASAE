package co.edu.unicauca.Taller_1_ASAE.Domain.Service;

import java.util.List;

import co.edu.unicauca.Taller_1_ASAE.Domain.DTO.PersonaDTO;

public interface IPersonaService {

	public List<PersonaDTO> findAll();

	public PersonaDTO findById(Integer id);

	public PersonaDTO save(PersonaDTO persona);

	public PersonaDTO update(Integer id, PersonaDTO persona);

	public boolean delete(Integer id);
}
