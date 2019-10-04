package com.sapiens.dao;


import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sapiens.model.Employee;
@Repository
@org.springframework.transaction.annotation.Transactional
public class EmployeeInterfaceImp implements EmployeeInterface{

	
	@Autowired
	SessionFactory sessionfactory;
	@Override
	public void add(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("i m here");
		Session s=sessionfactory.getSessionFactory().openSession();
		System.out.println(employee);
		s.save(employee);
		
		
	}

}
