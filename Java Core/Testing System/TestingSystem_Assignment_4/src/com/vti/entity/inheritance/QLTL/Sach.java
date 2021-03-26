package com.vti.entity.inheritance.QLTL;

import java.util.Scanner;

public class Sach extends TaiLieu{
	private String tenTacGia;
	private int soTrang;
	public String getTenTacGia() {
		return tenTacGia;
	}
	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}
	public int getSoTrang() {
		return soTrang;
	}
	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}
	@Override
	public void input() {
		super.input();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tên tác giả: " );
		tenTacGia = scanner.nextLine();
		System.out.println("Nhập số trang: ");
		soTrang = scanner.nextInt();
	}
	@Override
	public void getInfor() {
		super.getInfor();
		System.out.println("Tên tác giả: " + tenTacGia);
		System.out.println("Số trang: " + soTrang);
	}
}
