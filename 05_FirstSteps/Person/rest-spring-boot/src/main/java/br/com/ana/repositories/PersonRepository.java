package br.com.ana.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.ana.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{}
