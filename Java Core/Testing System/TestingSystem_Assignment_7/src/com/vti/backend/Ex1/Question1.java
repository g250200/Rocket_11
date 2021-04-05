package com.vti.backend.Ex1;

import com.vti.entity.Static.Student;

public class Question1 {
	Student[] students;
	
	public void Q1() {
		students = new Student[3];
		students[0] = new Student(1, "AAA");
		students[1] = new Student(2, "BBB");
		students[2] = new Student(3, "CCC");
		
		for (Student student : students) {
			System.out.println(student);
		}
		
		Student.setCollege("ĐH Công Nghệ");
		
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
}
