package com.vti.backend.Ex1;

import com.vti.entity.Static.PrimaryStudent;
import com.vti.entity.Static.SecondaryStudent;
import com.vti.entity.Static.Student;

public class Question6_7 {
	
	public void Q6() {
		Student[] students = new Student[6];
		students[0] = new Student(1, "AAA");
		students[1] = new Student(2, "BBB");
		students[2] = new Student(3, "CCC");
		students[3] = new Student(4, "DDD");
		students[4] = new Student(5, "EEE");
		students[5] = new Student(6, "FFF");
		
		System.out.println("Couter of Student: " + Student.counter);
		System.out.println("Couter of Primary Student: " + PrimaryStudent.counterPrimary);
		System.out.println("Couter of Secondary Student: " + SecondaryStudent.counterSecondary);

	}
	public void Q7() {
		Student[] students = new Student[Student.maxStudent];
		students[0] = new Student(1, "AAA");
		students[1] = new Student(2, "BBB");
		students[2] = new Student(3, "CCC");
		students[3] = new Student(4, "DDD");
		students[4] = new Student(5, "EEE");
		students[5] = new Student(6, "FFF");
		students[6] = new Student(7, "GGG");
		students[7] = new Student(8, "HHH");
		
	}
	
}
