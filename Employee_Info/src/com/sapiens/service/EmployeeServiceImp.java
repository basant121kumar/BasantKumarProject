package com.sapiens.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapiens.dao.EmployeeInterface;
import com.sapiens.model.Address;
import com.sapiens.model.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService{
	@Autowired
	EmployeeInterface employeeinterface;

	@Override
	public void addemployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeinterface.add(employee);
		
	}
}