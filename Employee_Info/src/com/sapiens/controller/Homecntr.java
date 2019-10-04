package com.sapiens.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sapiens.model.Address;
import com.sapiens.model.Employee;
import com.sapiens.model.Project;
import com.sapiens.service.AddressService;
import com.sapiens.service.EmployeeService;
import com.sapiens.service.ProjectService;

@Transactional
@Controller
public class Homecntr {

	@Autowired
	private EmployeeService empp;

	@Autowired
	private AddressService addressService;

	@Autowired
	private ProjectService projectService;

	@RequestMapping(value = "/EmployeeRegistration")
	public String display() {
		System.out.println("In controller");
		Employee emp = new Employee();
		emp.setDept(2);
		emp.setFirstName("Basant");
		emp.setLastName("Deshwal");
		empp.addemployee(emp);
		return "index";

	}

	@RequestMapping(value = "/emp")
	public String display2(Model model) {
		model.addAttribute("employee", new Employee());
		return "Employee Registeration";
	}
		
		@RequestMapping(value = "/emp1")
		public String display3(Model model) {
			model.addAttribute("Address", new Address());
			return "Address";
			
		}
			@RequestMapping(value = "/emp2")
			public String display4(Model model) {
				model.addAttribute("Project", new Project());
				return "Project";
	}
}
