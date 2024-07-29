package com.jfbarahonag.springboot_data_jpa.springboot_jpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jfbarahonag.springboot_data_jpa.springboot_jpa.entities.Person;

public interface PersonRepository extends CrudRepository<Person /* Entity */, Long/* Id data type */> {
  
  @Query("select p from Person p where p.programmingLanguage = ?1")
  List<Person> findByProgrammingLanguage(String programmingLanguage);
  
  List<Person> findByProgrammingLanguageStartingWith(String pattern);

  @Query("select p.firstname, p.programmingLanguage from Person p")
  List<Object[]> getPersonsData();
  
  @Query("select p.firstname, p.programmingLanguage from Person p where p.firstname = ?1")
  List<Object[]> getPersonsData(String firstname);
}
