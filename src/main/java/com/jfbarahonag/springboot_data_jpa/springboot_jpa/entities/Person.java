package com.jfbarahonag.springboot_data_jpa.springboot_jpa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "persons")
public class Person {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) // auto incremental
  private Long id;
  
  private String firstname;
  
  private String lastname;

  @Column(name = "programming_language")
  private String programmingLanguage;

  public Person() {
  }

  public Person(String firstname, String lastname, String programmingLanguage) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.programmingLanguage = programmingLanguage;
  }

  public Person(Long id, String firstname, String lastname, String programmingLanguage) {
    this.id = id;
    this.firstname = firstname;
    this.lastname = lastname;
    this.programmingLanguage = programmingLanguage;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getProgrammingLanguage() {
    return programmingLanguage;
  }

  public void setProgrammingLanguage(String programmingLanguage) {
    this.programmingLanguage = programmingLanguage;
  }

}
