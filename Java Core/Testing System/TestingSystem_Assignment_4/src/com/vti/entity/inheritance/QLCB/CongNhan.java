package com.vti.entity.inheritance.QLCB;

import java.util.Scanner;

public class CongNhan extends CanBo{
	private int bac;

	public int getBac() {
		return bac;
	}

	public void setBac(int bac) {
		this.bac = bac;
	}
	@Override
	public void input() {
		super.input();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap bậc: ");
		bac = scanner.nextInt();
	}
	@Override
	public void getInfor() {
		super.getInfor();
		System.out.println("Bậc: " + bac);
	}
}
