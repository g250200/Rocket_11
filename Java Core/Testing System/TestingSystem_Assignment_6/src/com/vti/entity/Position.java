package com.vti.entity;

import com.vti.utils.ScannerUtils;

public class Position {
	private int id;
	private String name;
	public Position() {
		Input();
	}
	private void Input() {
		System.out.println("Nhập vào id position");
		id = ScannerUtils.InputPositiveInt("Id phải là số nguyên dương");
		System.out.println("Nhập vào name position");
		name = ScannerUtils.InputString("Tên không được để là 1 khoảng trắng");
	}
	@Override
	public String toString() {
		return "Position [id=" + id + ", name=" + name + "]";
	}
}
