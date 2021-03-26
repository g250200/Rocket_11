package com.vti.entity.inheritance.QLTL;

import java.util.Scanner;

public class TapChi extends TaiLieu{
	private int soPhatHanh;
	private int thangPhatHanh;
	public int getSoPhatHanh() {
		return soPhatHanh;
	}
	public void setSoPhatHanh(int soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}
	public int getThangPhatHanh() {
		return thangPhatHanh;
	}
	public void setThangPhatHanh(int thangPhatHanh) {
		this.thangPhatHanh = thangPhatHanh;
	}
	@Override
	public void input() {
		super.input();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số phát hành: ");
		soPhatHanh = scanner.nextInt();
		System.out.println("Nhập tháng phát hành: ");
		thangPhatHanh = scanner.nextInt();
	}
	@Override
	public void getInfor() {
		super.getInfor();
		System.out.println("Số phát hành: " + soPhatHanh);
		System.out.println("Tháng phát hành: " + thangPhatHanh);
	}
}