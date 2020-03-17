package com.saron.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.saron.demo.dao.ProjectRepo;
import com.saron.demo.entities.Project;

@Controller
@RequestMapping("/projects")
public class ProjectController {
	
	@Autowired //gives the responsibility for spring container to inject an instance 
	//since there is no class for projectRepo , it is just an interface, it will create an anonymous class
	
	ProjectRepo proRepo;
	
	@GetMapping("/new")
	public String displayProjectForm(Model model) {
		
		Project aProject = new Project();
		
		model.addAttribute("project", aProject);
		
		return "new-project";
		
	}
	
	@PostMapping("/save" )
	public String createProject(Project project , Model model) {
		//handles saving to the database...
		
		proRepo.save(project);
		
		return "redirect./new";//we use redirect to prevent duplicate submissions
	
	}

}
