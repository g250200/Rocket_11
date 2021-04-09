package com.vti.backend.Exercise1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import com.vti.entity.Ex1.Student;

public class Question2 {
	Stack<Student> students = new Stack<Student>();
	Queue<Student> students2 = new LinkedList<Student>();
	public void addStudentStack() {
		Student student1 = new Student("AAA");
		Student student2 = new Student("BBB");
		Student student3 = new Student("CCC");
		Student student4 = new Student("DDD");
		Student student5 = new Student("EEE");
		students.push(student1);
		students.push(student2);
		students.push(student3);
		students.push(student4);
		students.push(student5);
	}
	
	public void addStudentQueue() {
		Student student1 = new Student("AAA");
		Student student2 = new Student("BBB");
		Student student3 = new Student("CCC");
		Student student4 = new Student("DDD");
		Student student5 = new Student("EEE");
		students2.add(student1);
		students2.add(student2);
		students2.add(student3);
		students2.add(student4);
		students2.add(student5);
	}
	
	public void printStudentStack() {
		System.out.println(students.pop());
		System.out.println(students.pop());
		System.out.println(students.pop());
		System.out.println(students.pop());
		System.out.println(students.pop());
	}
	public void printStudentQueue() {
		System.out.println(students2.poll());
		System.out.println(students2.poll());
		System.out.println(students2.poll());
		System.out.println(students2.poll());
		System.out.println(students2.poll());
	}
}
