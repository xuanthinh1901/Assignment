package com.vti.backend;

public class Student {
	public static int count=1;
	private int id;
	private String name;
	public static String college;
	public static int moneyGroup;
	
	public Student() {
		super();
	}
	
	public Student( String name ) {
		super();
		this.id = count;
		this.name = name;
		count+=1;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student id=" + id 
				+ ", name=" + name 
				+ ",college= "+ college
				+ ",moneyGroup= "+ moneyGroup;
				
	}
	
}
