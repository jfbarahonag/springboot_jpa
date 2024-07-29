package com.jfbarahonag.springboot_data_jpa.springboot_jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jfbarahonag.springboot_data_jpa.springboot_jpa.entities.Person;
import com.jfbarahonag.springboot_data_jpa.springboot_jpa.repositories.PersonRepository;

@SpringBootApplication
public class SpringbootJpaApplication implements CommandLineRunner {

	@Autowired
	private PersonRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// List<Person> persons = (List<Person>) repository.findAll();
		// List<Person> persons = (List<Person>) repository.findByProgrammingLanguage("Java");
		List<Person> persons = (List<Person>) repository.findByProgrammingLanguageStartingWith("Java");

		persons.stream().forEach(p -> System.out.println(p.toString()));
		
		List<Object[]> personsData = (List<Object[]>) repository.getPersonsData("Luis");
		personsData.stream().forEach(p -> System.out.println(p[0] + " es experto en: " + p[1]));
	}

}
