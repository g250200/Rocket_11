package com.vti.backend;

import java.util.Scanner;

import com.vti.entity.Polymorphism.Q3.HinhChuNhat;
import com.vti.entity.Polymorphism.Q3.HinhVuong;

public class Question3 {
	public void MenuHinhChuNhat() {
		Scanner scanner = new Scanner(System.in);
		HinhChuNhat hinhChuNhat = new HinhChuNhat();
		System.out.println("Nhập vào chiều dài");
		float cd = scanner.nextFloat();
		System.out.println("Nhập vào chiều rộng");
		float cr = scanner.nextFloat();
		System.out.println("Nhập lựa chọn của bạn");
		System.out.println("1: Tính chu vi");
		System.out.println("2: Tính diện tích");
		int index = scanner.nextInt();
			switch (index) {
			case 1:
				System.out.println("chu vi hcn: " + hinhChuNhat.TinhChuVi(cd, cr));
				break;
			case 2:
				System.out.println("diện tích hcn: " + hinhChuNhat.TinhDienTich(cd, cr));
				break;
		}
		
	}
	public void MenuHinhVuong() {
		Scanner scanner = new Scanner(System.in);
		HinhVuong hinhVuong = new HinhVuong();
		System.out.println("Nhập vào cạnh của hv");
		float a = scanner.nextFloat();
		System.out.println("Nhập lựa chọn của bạn");
		System.out.println("1: Tính chu vi");
		System.out.println("2: Tính diện tích");
		System.out.println("0: exit");
		int index = scanner.nextInt();
			switch (index) {
			case 1:
				System.out.println("chu vi hv: " + hinhVuong.TinhChuVi(a));
				break;
			case 2:
				System.out.println("diện tích hv: " + hinhVuong.TinhDienTich(a));
				break;
		}
		
	}
	
	public void Menu() {
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Nhập lựa chọn của bạn");
			System.out.println("1: Hình chữ nhật");
			System.out.println("2: Hình vuông");
			System.out.println("0: exit");
			int index = scanner.nextInt();
			switch (index) {
			case 1:
				MenuHinhChuNhat();
				break;
			case 2:
				MenuHinhVuong();
				break;
			case 0:
				return;
			default:
				System.out.println("Nhập sai mời nhập lại");
				break;
			}
		}
	}
}
