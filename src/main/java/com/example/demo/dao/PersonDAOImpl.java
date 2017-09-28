package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Person;
@Repository
public class PersonDAOImpl implements PersonDAO {

	@Autowired
	private JdbcTemplate template;

	@Override
	public Person getPerson(Integer id) {
		String query = "select * from person where id=?";
		Person person = template.queryForObject(query, new Object[] { id }, new PersonRowMapper());
		return person;
	}

	@Override
	public List<Person> getPersons() {
		String query = "select * from person";
		List<Person> person = template.query(query, new PersonRowMapper());
		return person;

	}

	@Override
	public void addPerson(Person person) {
		String query = "insert into person values(?, ?, ?, ?)";
		template.update(query, new Object[] {person.getId(),person.getFirstName(),person.getLastName(),person.getMoney()});
		
	}

	@Override
	public void updatePerson(Person person) {
		String query = "UPDATE person SET firstname = ?, lastname = ? WHERE id = ?;";
		template.update(query, new Object[] {"Barry","McCockiner",person.getId()});
	}

	@Override
	public void deletePerson(Person person) {
		String query = "DELETE FROM person WHERE id = ?;";
		template.update(query, new Object[] {person.getId()});

	}
}
