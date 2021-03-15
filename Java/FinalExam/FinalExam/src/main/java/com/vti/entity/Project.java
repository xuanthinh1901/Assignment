package com.vti.entity;

public class Project {
	private int projectId;
	private int teamSize;
	private int idManager;
	private Employee[] idEmployees;
	
	public Project(int projectId, int teamSize, int idManager, Employee[] idEmployees) {
		this.projectId = projectId;
		this.teamSize = teamSize;
		this.idManager = idManager;
		this.idEmployees = idEmployees;
				
	}
	public int getProjectId() {
		return projectId;
	}
	public int getTeamSize() {
		return teamSize;
	}
	public int getIdManager() {
		return idManager;
	}
	public Employee[] getIdEmployees() {
		return idEmployees;
	}
		
}
