package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Person;

public interface PersonDAO {

	Person getPerson(Integer id);

	List<Person> getPersons();

	void addPerson(Person person);

	void updatePerson(Person person);

	void deletePerson(Person person);

}