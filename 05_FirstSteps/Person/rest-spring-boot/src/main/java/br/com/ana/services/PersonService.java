package br.com.ana.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ana.exceptions.ResourceNotFoundException;
import br.com.ana.model.Person;
import br.com.ana.repositories.PersonRepository;

@Service
public class PersonService {
	
	private Logger logger = Logger.getLogger(PersonService.class.getName());
	
	@Autowired
	PersonRepository repository;

	public List<Person> findAll() {
		logger.info("Finding all people!");
		return repository.findAll();
	}

	public Person findById(Long id) {
		logger.info("Finding one person!");
		return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this id"));
	}
	
	public  Person create(Person person) {
		logger.info("Creating one person!");
		return repository.save(person);
	}
	
	public  Person update(Person person) {
		logger.info("Updating one person!");
		var entity = repository.findById(person.getId()).orElseThrow(() -> new ResourceNotFoundException("No records found for this id"));
		
		entity.setFirstName(person.getFirstName());
		entity.setLastName(person.getLastName());
		entity.setAddress(person.getAddress());
		entity.setGender(person.getGender());
		
		return repository.save(person);
	}
	
	public  void delete(Long id) {
		logger.info("Deleting one person!");
		var entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this id"));
		
		repository.delete(entity);
	}
}
