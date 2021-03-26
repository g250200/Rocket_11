package com.vti.entity.inheritance.QLTL;

import java.util.Scanner;

public class Bao extends TaiLieu{
	private int ngayPhatHanh;

	public int getNgayPhatHanh() {
		return ngayPhatHanh;
	}

	public void setNgayPhatHanh(int ngayPhatHanh) {
		this.ngayPhatHanh = ngayPhatHanh;
	}
	@Override
	public void input() {
		super.input();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập ngày phát hành: " );
		ngayPhatHanh= scanner.nextInt();
	}
	@Override
	public void getInfor() {
		super.getInfor();
		System.out.println("Ngày phát hành: " + ngayPhatHanh);
	} 
}
