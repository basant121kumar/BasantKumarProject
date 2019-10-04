package com.sapiens.model;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="Employee")

public class Employee {
	
	
	
	
	//add the contents you wanna addd in employee table

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int empid;   
//employee id
@Column(name="empFirstName")
private String empfirstname; 
//employee first name 
@Column(name="empLastName")
private String emplastname;  
// employee last name
@Column(name="empDep")
private String empdept;    
// employee department

@Column(name="empAge")
private int empage;       
// employee age 






//getter and setter methods are started


public int getEmpid()                 //empid=employee Id
{
	return empid;
}

public void setEmpid(int empid)        
{
	this.empid = empid;
}

public String getEmpfirstname()       //Empfirstname=employee first name 
{
	return empfirstname;
}
public void setEmpfirstname(String empfirstname) {
	this.empfirstname = empfirstname;
}
public String getEmplastname() {
	return emplastname;
}
public void setEmplastname(String emplastname) {
	this.emplastname = emplastname;
}
public String getEmpdept() {
	return empdept;
}
public void setEmpdept(String empdept) {
	this.empdept = empdept;
}
public int getEmpage() {
	return empage;
}
public void setEmpage(int empage) {
	this.empage = empage;
}
public Employee(int empid, String empfirstname, String emplastname, String empdept, int empage) {
	super();
	this.empid = empid;
	this.empfirstname = empfirstname;
	this.emplastname = emplastname;
	this.empdept = empdept;
	this.empage = empage;
}
@Override
public String toString() {
	return "Employee [empid=" + empid + ", empfirstname=" + empfirstname + ", emplastname=" + emplastname + ", empdept="
			+ empdept + ", empage=" + empage + "]";
}
public Employee() {
	super();
}

public void setFirstName(String string) {
	// TODO Auto-generated method stub
	
}

public void setDept(int i) {
	// TODO Auto-generated method stub
	
}

public void setLastName(String string) {
	// TODO Auto-generated method stub
	
}





}
