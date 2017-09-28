package com.example.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.model.Person;

public class PersonRowMapper implements RowMapper<Person>{

	@Override
	public Person mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.setId(rs.getInt(1));
		p.setFirstName(rs.getString(2));
		p.setLastName(rs.getString(3));
		p.setMoney(rs.getDouble(4));
		return p;
	}

}
