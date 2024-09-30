package br.com.ana.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ana.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{}
