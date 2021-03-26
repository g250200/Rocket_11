package com.vti.entity.inheritance.QLTL;

import java.util.Scanner;

public class TaiLieu {
	private int maTaiLieu;
	private String tenNhaXuatban;
	private int soBanPhatHanh;
	public int getMaTaiLieu() {
		return maTaiLieu;
	}
	public void setMaTaiLieu(int maTaiLieu) {
		this.maTaiLieu = maTaiLieu;
	}
	public String getTenNhaXuatban() {
		return tenNhaXuatban;
	}
	public void setTenNhaXuatban(String tenNhaXuatban) {
		this.tenNhaXuatban = tenNhaXuatban;
	}
	public int getSoBanPhatHanh() {
		return soBanPhatHanh;
	}
	public void setSoBanPhatHanh(int soBanPhatHanh) {
		this.soBanPhatHanh = soBanPhatHanh;
	}
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập mã tài liệu: ");
		maTaiLieu = scanner.nextInt();
		System.out.println("Nhập tên nhà xuất bản: ");
		tenNhaXuatban = scanner.nextLine();
		System.out.println("Nhập số bản phát hành: ");
		soBanPhatHanh = scanner.nextInt();
	}

	@Override
	public String toString() {
		return "TaiLieu:  maTaiLieu = " + maTaiLieu + ", Tên Nhà Xuấtt bản:  " + tenNhaXuatban + ", Số bản phát hành: "
				+ soBanPhatHanh ;
	}
	
}
