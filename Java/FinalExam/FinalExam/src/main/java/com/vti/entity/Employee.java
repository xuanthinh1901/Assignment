package com.vti.entity;

public class Employee extends User {

	private int projectId;
	private String proSkill;

	public Employee(int id, String fullName, String email, String password, int projectId, String proSkill) {
		super(id, fullName, email, password, Role.Employee);
		this.projectId = projectId;
		this.proSkill = proSkill;
	}

	public int getProjectId() {
		return projectId;
	}

	@Override
	public String toString() {
		return "Employee [ProSkill=" + proSkill + "projectId" + projectId + "getId()=" + getId() + ", getFullName()=" + getFullName()
				+ ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword() + ", getRole()=" + getRole()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
		
		
	}

}
