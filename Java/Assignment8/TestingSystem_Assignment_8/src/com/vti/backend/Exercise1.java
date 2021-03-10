package com.vti.backend;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import com.vti.entity.Student;

public class Exercise1 {
	public static void q1() {
		List<Student> students = new ArrayList<>();
		List<Student> student2 = new ArrayList<>();
		students.add(new Student("StudentA"));
		students.add(new Student("StudentA"));
		students.add(new Student("StudentC"));
		students.add(new Student("StudentD"));
		
////a	
		
////b 	
		System.out.println(students.size());	
////c		
		System.out.println(students.get(3));
////d		
		System.out.println(students.get(0));
////e		
//		System.out.println(students.get(3));
//		students.add(new Student("StudentA"));	
//		students.add(new Student("StudentA"));
//		students.add(new Student("StudentA"));
//		students.add(2,new Student("StudentA"));
//g
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		for (Student student : students) {
			if ( id == student.getId() ) {
				System.out.println(student.getName());
			}
		}
		sc.close();
		students.size();
//i
		for ( int i=0; i < students.size(); i++) {
			System.out.println(students.get(i));
			for ( int j=0; j < students.size(); j++) {
			if ( students.get(i).getId() == students.get(j).getId() )  
				continue;
			if ( students.get(i).getName().equals( students.get(j).getName() ) ) {
				student2.add(students.get(i));
				break;
				}
			}
		}
		System.out.println(student2);
		System.out.println("\n");
	}
	public static void q2() {
//a
	Stack<Student> students = new Stack<>();

	students.push(new Student("StudentA"));
	students.push(new Student("StudentA"));
	students.push(new Student("StudentC"));
	students.push(new Student("StudentD"));
	System.out.println(students.pop());
	System.out.println(students.pop());
	System.out.println(students.pop());
	System.out.println(students.pop());
//b
	Queue<Student> student1 = new LinkedList<>();

	student1.add(new Student("StudentA"));
	student1.add(new Student("StudentA"));
	student1.add(new Student("StudentC"));
	student1.add(new Student("StudentD"));
	System.out.println(student1.poll());
	System.out.println(student1.poll());
	System.out.println(student1.poll());
	System.out.println(student1.poll());
	}
}
