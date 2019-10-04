package com.sapiens.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sapiens.model.Project;

@Repository
@Transactional
public class ProjectinterfaceImp implements ProjectInterface{

	@Autowired
	SessionFactory sessionfactory;
	@Override
	public void add(Project project) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().save(project);
		
	}

}
