package com.vti.entity.Polymorphism.Q2;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;

public abstract class Person {
	private String name;
	private Gender gender;
	private String diaChi;
	private LocalDate birthday;

	public String getName() {
		return name;
	}
	public void InputInfor() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào tên");
		name = scanner.nextLine();
		System.out.println("Nhập giới tính (0:Nam,1:Nữ, Khác: Unknown)");
		int n = scanner.nextInt();
		if (n == 0) {
			gender = Gender.Nam;
		} else if (n == 1) {
			gender = Gender.Nữ;
		} else {
			gender = Gender.Unknown;
		}
		scanner.nextLine();
		System.out.println("Nhập ngày sinh(yyyy-mm-dd)");
		birthday = LocalDate.parse(scanner.nextLine());
	}

	public void ShowInfor() {
		System.out.println("Tên: " + name);
		System.out.println("Giới tính: " + gender);
		System.out.println("Địa chỉ: " + diaChi);
		System.out.println("Ngày sinh: " + birthday);
	}
}
