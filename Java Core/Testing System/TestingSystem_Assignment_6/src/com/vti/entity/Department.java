package com.vti.entity;

import com.vti.utils.ScannerUtils;

public class Department {
	private int id;
	private String name;
	public Department(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public Department() {
		Input();
	}
	private void Input() {
		System.out.println("Nhập vào id department");
		id = ScannerUtils.InputPositiveInt("Id phải là số nguyên dương");
		System.out.println("Nhập vào name department");
		name = ScannerUtils.InputString("Tên không được để là 1 khoảng trắng");
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	
}
