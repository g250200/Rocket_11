package com.vti.entity.Polymorphism.Q2;

import java.util.Scanner;

public class SinhVien extends Person{
	private int maSinhVien;
	private double diemTB;
	private String email;
	public double getDiemTB() {
		return diemTB;
	}
	@Override
	public void InputInfor() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập mã sinh viên");
		maSinhVien = scanner.nextInt();
		scanner.nextLine();
		super.InputInfor();
		System.out.println("Nhập vào điểm trung bình");
		diemTB = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Nhập emai");
		email = scanner.nextLine();
	}
	@Override
	public void ShowInfor() {
		System.out.println("mã sinh viên: " + maSinhVien);
		super.ShowInfor();
		System.out.println("Điểm trung bình: " + diemTB);
		System.out.println("emai: " + email);
	}
	public boolean isXetHocBong() {
		return diemTB >=8;
	}
}
