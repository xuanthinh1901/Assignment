package com.vti.frontend;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.vti.backend.Student;

public class Program {
	public static void main(String[] args) {
//		q1();	
	}
	
	public static void q1() {
		List<Student> students = new ArrayList<>();
		students.add( new Student("Nguyễn Văn A",1) );
		students.add( new Student("Nguyễn Văn B",3) );
		students.add( new Student("Nguyễn Văn C",2) );
		
		for (Student student : students) {
			student.diemDanh();
		}
		for (Student student : students) {
			student.hocbai();
		}
		for (Student student : students) {
			student.didonvesinh();
		}
	}
	
	public static void q2() {
		List<Student> students = new ArrayList<>();
		students.add( new Student("Nguyễn Văn A",1) );
		students.add( new Student("Nguyễn Văn B",3) );
		students.add( new Student("Nguyễn Văn C",2) );
		
		for (Student student : students) {
			System.out.println(student);
		}
	}
}
