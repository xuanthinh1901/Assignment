package com.vti.backend;

import java.util.ArrayList;
import java.util.List;

import com.vti.entity.Student;

public class Exercise2 {
	public static void q1() {
		List<Student> students = new ArrayList<>();

		students.add(new Student("StudentA"));
		students.add(new Student("StudentB"));
		students.add(new Student("StudentC"));
		students.add(new Student("StudentD"));
	}
}
