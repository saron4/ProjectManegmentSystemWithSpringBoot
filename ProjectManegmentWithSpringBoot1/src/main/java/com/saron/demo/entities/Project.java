package com.saron.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Project {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private long projectId;
	private String name;
	
	private String stage;//Non started , Completed, In progress
	
	private String discription;
	
	
	public Project() {
		
	}
	
	
	public Project(String name, String stage, String discription) {
		super();
		this.name = name;
		this.stage = stage;
		this.discription = discription;
	}

	public long getProjectId() {
		return projectId;
	}

	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}
	
	

}
