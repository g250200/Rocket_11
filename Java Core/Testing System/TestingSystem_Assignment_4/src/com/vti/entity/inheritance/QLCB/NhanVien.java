package com.vti.entity.inheritance.QLCB;

import java.util.Scanner;

public class NhanVien extends CanBo{
	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}

	private String congViec;
	@Override
	public void input() {
		super.input();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập công việc: ");
		congViec = scanner.nextLine();
	}
	
	@Override
	public String toString() {
		
		return "Nhân Viên: " + super.toString() + ", Công việc: " +congViec;
	}
}
