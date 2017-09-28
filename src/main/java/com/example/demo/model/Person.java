package com.example.demo.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {

	public Person() {
		super();
	}

	private Integer id;
	private String firstName;
	private String lastName;
	private double Money;

	public Person(Integer id, String firstName, String lastName, double money) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		Money = money;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getMoney() {
		return Money;
	}

	public void setMoney(double money) {
		Money = money;
	}

}
