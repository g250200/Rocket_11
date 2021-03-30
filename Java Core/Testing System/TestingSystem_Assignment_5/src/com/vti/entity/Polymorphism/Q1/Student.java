package com.vti.entity.Polymorphism.Q1;

import java.util.Scanner;

public class Student {
	private int id;
	private String name;
	private int group;

	public int getGroup() {
		return group;
	}

	public void DiemDanh() {
		System.out.println(name + " Điểm danh");

	}

	
	public void HocBai() {
		System.out.println(name + " Học bài");

	}


	public void DonVeSinh() {
		System.out.println(name + " Dọn vệ sinh");

	}

	public void Nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập id");
		id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Nhập tên");
		name = scanner.nextLine();
		System.out.println("Nhập group (1, 2, 3)");
		group = scanner.nextInt();
	}
}
