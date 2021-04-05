package com.vti.entity.File;

import java.io.Serializable;

import com.vti.utils.ScannerUtils;

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static int counter = 0;

	private int id;
	private String name;

	public Student() {
		this.id = ++counter;
		input();
	}

	private void input() {
		System.out.println("Nhập tên: ");
		name = ScannerUtils.inputString("Tên không thể để trống hoặc là một khoảng trắng");
	}

	@Override
	public String toString() {
		return "Student{" + "id=" + id + ", name='" + name + '\'' + '}';
	}

}
