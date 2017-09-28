package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PersonDAO;
import com.example.demo.model.Person;

@Service
public class PersonService {
	
	@Autowired
	private PersonDAO personDao;

	public Person findByPersonId(Integer id) {
		if(id <= 0)
		{
			System.err.println("id cannot be zero");
			return null;
		}
		else
		{
			Person obj = personDao.getPerson(id); 
			return obj;
		}
		
	}
	
	public Person updateByPersonId(Integer id) {
		if(id == 0)
		{
			System.err.println("id cannot be zero");
			return null;
		}
		else
		{
			Person person = personDao.getPerson(id);
			//System.err.println(person.getFirstName() + " " + person.getLastName());
			personDao.updatePerson(person);
			person = personDao.getPerson(id); 
			return person;
		}
		
	}
	
	public void deleteByPersonId(Integer id) {
		if(id == 0)
		{
			System.err.println("id cannot be zero");
			
		}
		else
		{
			Person person = personDao.getPerson(id);
			//System.err.println(person.getFirstName() + " " + person.getLastName());
			personDao.deletePerson(person);
			//person = findByPersonId(id);
			
		}
	}
	
	public Person addByPersonId(Integer id) {
		if(id == 0)
		{
			System.err.println("id cannot be zero");
			return null;
			
		}
		else
		{
			Person person = new Person();
			person.setId(id);
			person.setFirstName("John");
			person.setLastName("Morty");
			person.setMoney(0);
			//System.err.println(person.getFirstName() + " " + person.getLastName());
			personDao.addPerson(person);
			person = findByPersonId(id);
			return person;
		}
	}
}
