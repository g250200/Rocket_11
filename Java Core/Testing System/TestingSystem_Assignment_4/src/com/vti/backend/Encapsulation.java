package com.vti.backend;

import com.vti.entity.encapsulation.Student;

public class Encapsulation {
	public void question1() {
		float score = 0;
		Student[] students = new Student[5];
		for(int i = 0; i < students.length; i++) {
			students[i] = new Student();
			students[i].setStudent_Id(i+1);
			students[i].setStudent_Name("Student"+(i+1));
			students[i].setHometown("hometown" + (i+1));
			students[i].setScore(score);
			score += 2;
		}
		for (Student student : students) {
			System.out.println(student);
		}
	}

}
