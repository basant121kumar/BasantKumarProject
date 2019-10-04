package com.sapiens.model;


import javax.persistence.*;

@Entity
@Table(name="Address")
public class Address {
	//add the info you want to add tje employees table
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="empID")
	 private int eId;
	
	@Column(name="presentAdd")
	private String presentAdd;
	
	@Column(name="contactNo")
	private long contactNo;
	
	public Address() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int geteId() {
		return eId;
	}
	public void seteIp(int eId) {
		this.eId = eId;
	}
	public String getPresentAdd() {
		return presentAdd;
	}
	public void setPresentAdd(String presentAdd) {
		this.presentAdd = presentAdd;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public Address(int id, int eIp, String presentAdd, long contactNo) {
		super();
		this.id = id;
		this.eId= eIp;
		this.presentAdd = presentAdd;
		this.contactNo = contactNo;
	}
	
}