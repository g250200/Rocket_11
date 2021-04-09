package com.vti.entity.Ex3;

public class Student<T> {
	private T id;
	private String name;
	
	public Student(T id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}
