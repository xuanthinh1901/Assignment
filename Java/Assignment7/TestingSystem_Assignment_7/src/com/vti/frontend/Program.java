package com.vti.frontend;

import com.vti.backend.Student;

public class Program {
	public static void main(String[] args) {
//		q1();
//		q2();
	}
	
	public static void q1() {
		Student[] students = new Student[3];
		students[0] = new Student("Nguyễn Văn A");
		students[1] = new Student("Nguyễn Văn B");
		students[2] = new Student("Nguyễn Văn C");
		
		Student.college="DH Bach Khoa";
		for (Student student:students) {
			System.out.println(student);
		}
		
		Student.college="Dh Cong nghe";
		
		for (Student student:students) {
			System.out.println(student);
		}
	}
	public static void q2() {
		Student[] students = new Student[3];
		students[0] = new Student("Nguyễn Văn A");
		students[1] = new Student("Nguyễn Văn B");
		students[2] = new Student("Nguyễn Văn C");
		
		Student.moneyGroup=3*100;
		System.out.println("Student thứ 1 lấy 50k đi mua bim bim, kẹo về liên hoan");
		Student.moneyGroup=Student.moneyGroup-50;
		System.out.println("so tien con lai la:"+Student.moneyGroup);
		System.out.println("Student thứ 2 lấy 20k đi mua bánh mì");
		Student.moneyGroup=Student.moneyGroup-50;
		System.out.println("so tien con lai la:"+Student.moneyGroup);
		System.out.println("Student.moneyGroup=Student.moneyGroup");
		Student.moneyGroup=Student.moneyGroup-150;
		System.out.println("so tien con lai la:"+Student.moneyGroup);
		System.out.println("cả nhóm mỗi người lại đóng quỹ mỗi người 50k");
		Student.moneyGroup=Student.moneyGroup+50*3;
		System.out.println("so tien con lai la:"+Student.moneyGroup);
		

	}
	
}
