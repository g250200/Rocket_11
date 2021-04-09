package com.vti.entity.Ex1;

import org.w3c.dom.css.Counter;

import com.vti.util.ScannerUtils;

public class Student {
	private static int Counter = 0;
	
	private int id;
	private String name;
	
	public Student() {
		setId(++Counter);
		input();
	}
	
	public Student(String name) {
		setId(++Counter);
		this.name=name;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public void input() {
		System.out.println("Nhập tên student");
		name = ScannerUtils.inputString("Tên không được để trông hoặc là một khoảng trắng");
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

