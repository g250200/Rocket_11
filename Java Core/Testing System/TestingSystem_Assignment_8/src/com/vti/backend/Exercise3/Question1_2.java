package com.vti.backend.Exercise3;

import com.vti.entity.Ex3.Student;

public class Question1_2 {
	
	public void print() {
		Student<Integer> student1 = new Student<Integer>(1, "AAA");
		print(student1);
		Student<Float> student2 = new Student<Float>(2.3f, "BBB");
		print(student2);
		Student<Double> student3 = new Student<Double>(3.5, "ccc");
		print(student3);
		print(4);
		print(4.0f);
		print("AAA");
	}
	
	private <T> void print(T a) {
		System.out.println(a);
	}
}
