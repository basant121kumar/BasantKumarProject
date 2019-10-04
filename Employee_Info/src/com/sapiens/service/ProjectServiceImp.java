package com.sapiens.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.sapiens.dao.ProjectInterface;
import com.sapiens.model.Project;

@Service
public class ProjectServiceImp implements ProjectService{

	
	@Autowired
	ProjectInterface projectInterface;
	
	@Override
	public void addProject(Project project) {
		// TODO Auto-generated method stub
		
		projectInterface.add(project);
	}
	
	
	
	
	

}
