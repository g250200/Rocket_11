package com.vti.entity.inheritance.QLCB;

import java.util.Scanner;

public class CanBo {
	private String hoTen;
	private byte tuoi;
	private Gender gioiTinh;
	private String diaChi;
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public byte getTuoi() {
		return tuoi;
	}
	public void setTuoi(byte tuoi) {
		this.tuoi = tuoi;
	}
	public Gender getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(int gioiTinh) {
		if (gioiTinh == 0) {
			this.gioiTinh = Gender.Nam;
		} else if (gioiTinh == 1) {
			this.gioiTinh = Gender.Nữ;
		} else {
			this.gioiTinh = Gender.Khác;
		}
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	@Override
	public String toString() {
		return "CanBo: hoTen = " + hoTen + ", tuoi = " + tuoi + ", gioiTinh = " + gioiTinh + ", diaChi = " + diaChi ;
	}
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập họ tên: ");
		hoTen = scanner.nextLine();
		System.out.println("Nhập tuổi");
		tuoi = scanner.nextByte();
		System.out.println("Nhập giới tính(0: Nam, 1: Nữ, Khác 0,1 : Khác)");
		int i = scanner.nextInt();
		setGioiTinh(i);
		scanner.nextLine();
		System.out.println("Nhập địa chỉ: ");
		diaChi = scanner.nextLine();
		
	}
	
}
