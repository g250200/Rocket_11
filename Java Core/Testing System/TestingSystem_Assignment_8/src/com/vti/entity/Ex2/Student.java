package com.vti.entity.Ex2;

import java.time.LocalDate;

public class Student implements Comparable<Student> {
	private static int counter = 0;
	private int id;
	private String name;
	private LocalDate birthDay;
	private int score;
	
	public Student(String name, LocalDate date, int score) {
		id = ++counter;
		this.name = name;
		birthDay = date;
		this.score = score;
	}

	@Override
	public int compareTo(Student o) {
		
		return this.name.compareToIgnoreCase(o.name);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", birthDay=" + birthDay + ", score=" + score + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
