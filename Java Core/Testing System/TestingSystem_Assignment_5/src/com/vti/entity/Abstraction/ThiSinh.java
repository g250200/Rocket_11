package com.vti.entity.Abstraction;

import java.util.Scanner;

public class ThiSinh {
	private int soBaoDanh;
	private String hoTen;
	private String diaChi;
	private int mucUuTien;
	protected String khoi;
	protected String[] monThi; 
	
	public int getSoBaoDanh() {
		return soBaoDanh;
	}

	public String getKhoi() {
		return khoi;
	}

	public void NhapThongTinThiSinh() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số báo danh");
		soBaoDanh = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Nhập họ tên ");
		hoTen = scanner.nextLine();
		System.out.println("Nhập địa chỉ");
		diaChi = scanner.nextLine();
		System.out.println("Nhập mức ưu tiên");
		mucUuTien = scanner.nextInt();
	}

	public void GetInfor() {
		System.out.println("Số báo danh: " + soBaoDanh);
		System.out.println("Họ tên: " + hoTen);
		System.out.println("Địa chỉ: " + diaChi);
		System.out.println("Mức ưu tiên: " + mucUuTien);
		System.out.println("Khối: " + khoi);
	}

}
