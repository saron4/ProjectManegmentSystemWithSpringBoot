package com.saron.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.saron.demo.entities.Employee;

public interface EmployeeRepo  extends CrudRepository<Employee,Long>{
	
	@Override
	List<Employee> findAll();
		
	

}
