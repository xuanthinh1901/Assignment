package com.vti.entity;

public class Student {
	private int id;
	private String name;
	public static int count=1;
	
	public Student() {
		
	}
	public Student(String name) {
		this.id=count++;
		this.name = name;

	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Student.count = count;
	}

		
	
	
}
