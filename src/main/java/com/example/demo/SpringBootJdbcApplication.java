package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;

@SpringBootApplication // = @Configuration + @EnableAutoConfiguration + @ComponentScan
public class SpringBootJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootJdbcApplication.class, args);
		PersonService ps = context.getBean(PersonService.class);
		
		Person p = ps.findByPersonId(1);
		System.out.println("Find Person By ID");
		System.out.println( p.getFirstName() + " " + p.getLastName());
		
		p = ps.updateByPersonId(1);
		System.out.println("Update Person By ID");
		System.out.println( p.getFirstName() + " " + p.getLastName());
		
		System.out.println("Delete Person By ID");
		ps.deleteByPersonId(1);
		
		p = ps.addByPersonId(1);
		System.out.println("Add Person By ID");
		System.out.println( p.getFirstName() + " " + p.getLastName());
		
		
	}
}
