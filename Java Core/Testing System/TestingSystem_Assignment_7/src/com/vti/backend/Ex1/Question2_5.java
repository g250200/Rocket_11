package com.vti.backend.Ex1;

import com.vti.entity.Static.Student;

public class Question2_5 {
	Student[] students;
	
	private void nopQuy(int q) {
		int money = students.length*q;
		int quyLop = Student.getMoneyGroup() + money;
		Student.setMoneyGroup(quyLop);
	}
	
	public void Q2() {
		students = new Student[3];
		students[0] = new Student(1, "AAA");
		students[1] = new Student(2, "BBB");
		students[2] = new Student(3, "CCC");
		nopQuy(100);
		System.out.println(Student.getMoneyGroup());
		students[0].spend(50);
		System.out.println(Student.getMoneyGroup());
		students[1].spend(20);
		System.out.println(Student.getMoneyGroup());
		students[2].spend(150);
		System.out.println(Student.getMoneyGroup());
		nopQuy(50);
		System.out.println(Student.getMoneyGroup());
	}
	public void Q5() {
		System.out.println("Số sinh viên được tạo: ");
		System.out.println(Student.counter);
	}

	
}
