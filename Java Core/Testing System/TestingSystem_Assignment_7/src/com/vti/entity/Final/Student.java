package com.vti.entity.Final;

public class Student {

	private final int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static final void Study() {
		System.out.println("Đang học bài…");
	}
}
