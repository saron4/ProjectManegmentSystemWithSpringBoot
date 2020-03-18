package com.saron.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.saron.demo.dao.EmployeeRepo;
import com.saron.demo.dao.ProjectRepo;
import com.saron.demo.entities.Employee;
import com.saron.demo.entities.Project;

@Controller

public class HomeController {
	
	@Autowired
	ProjectRepo proRepo;
	
	@Autowired
	EmployeeRepo empRepo;
	
	@GetMapping("/")
	public String displayHome(Model model) {
		
		//Querying data from database for project
		List<Project> projects = proRepo.findAll();
		model.addAttribute("projectList", projects);
		
		//Querying data from database for employees
		List<Employee> employees = empRepo.findAll();
		model.addAttribute("employeeList", employees);
		
		return "main/home";
		
	}

}
