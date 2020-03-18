package com.saron.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.saron.demo.entities.Project;

//a mechanism to access data from the database

public interface ProjectRepo extends CrudRepository<Project, Long>{
	
//long is the unique identifier we mention in project.java class
	
	@Override
	public List<Project> findAll();
		
	
	

}
