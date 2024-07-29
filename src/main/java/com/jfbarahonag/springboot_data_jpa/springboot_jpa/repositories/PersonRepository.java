package com.jfbarahonag.springboot_data_jpa.springboot_jpa.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jfbarahonag.springboot_data_jpa.springboot_jpa.entities.Person;

public interface PersonRepository extends CrudRepository<Person /* Entity */, Long/* Id data type */> {
  List<Person> findByProgrammingLanguage(String programmingLanguage);
}
