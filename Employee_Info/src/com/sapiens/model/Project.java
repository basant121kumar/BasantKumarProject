package com.sapiens.model;

import javax.persistence.*;

@Entity
@Table(name = "Project")
public class Project {
	@Id
	private int id;
	@Column(name = "empid")
	private int eId;
	// @Column(name)
	private int pDuration;
	private String pStatus;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public int getpDuration() {
		return pDuration;
	}

	public void setpDuration(int pDuration) {
		this.pDuration = pDuration;
	}

	public String getpStatus() {
		return pStatus;
	}

	public void setpStatus(String pStatus) {
		this.pStatus = pStatus;
	}

	public Project(int id, int eId, int pDuration, String pStatus) {
		super();
		this.id = id;
		this.eId = eId;
		this.pDuration = pDuration;
		this.pStatus = pStatus;
	}

	public Project() {
		super();
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", eId=" + eId + ", pDuration=" + pDuration + ", pStatus=" + pStatus + "]";
	}

}
