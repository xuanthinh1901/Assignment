package com.vti.entity;

public class User {

	private int id;
	private String FullName;
	private String Email;
	private String Password;
	private Role role;

	public User(int id, String fullName, String email, String password, Role role) {
		this.id = id;
		this.FullName = fullName;
		this.Email = email;
		this.Password = password;
		this.role = role;
	}
	

	public User(int id, String fullName) {
		super();
		this.id = id;
		FullName = fullName;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return FullName;
	}

	public String getEmail() {
		return Email;
	}

	public String getPassword() {
		return Password;
	}

	public Role getRole() {
		return role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", FullName=" + FullName + ", Email=" + Email + ", role=" + role + "]";
	}

}
