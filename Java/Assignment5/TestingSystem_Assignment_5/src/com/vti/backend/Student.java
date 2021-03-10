package com.vti.backend;

public class Student implements Istudy {
	private int id;
	private String name;
	private int group;
	public static int count=1;
	
	public Student() {

	}

	public Student( String name, int group) {
		super();
		this.id = count;
		this.name = name;
		this.group = group;
		count+=1;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getGroup() {
		return group;
	}

	@Override
	public void diemDanh() {
		System.out.println(name + " diem danh");
	}

	@Override
	public void hocbai() {
		System.out.println(name + " hoc bai");
		
	}

	@Override
	public void didonvesinh() {
		System.out.println(name + " di don ve sinh");
		
	}
	
		
}
