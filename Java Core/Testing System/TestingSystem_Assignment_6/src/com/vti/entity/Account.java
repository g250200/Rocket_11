package com.vti.entity;

import com.vti.utils.ScannerUtils;

public class Account {
	private int id;
	private String fullName;
	private int age;

	public Account() {
		Input();
	}

	public static int InputAge() throws InvalidAgeInputingException {
		while (true) {
			int age = ScannerUtils.InputInt("err!!! Tuổi phải là một số nguyên. Mời nhập lại");
			if (age <= 0) {
				throw new InvalidAgeInputingException("err!!! Tuổi không được là một số âm. Mời nhập lại");
			} else {
				return age;
			}
		}
	}

	public static int InputAccountAge() {
		while (true) {
			try {
				int age = InputAge();
				if (age < 18) {
					System.out.println("Tuổi của account phải từ 18 tuổi trở lên. Mời nhập lại.");
				} else {
					return age;
				}

			} catch (InvalidAgeInputingException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public void Input() {
		System.out.println("Nhập id của account");
		id = ScannerUtils.InputPositiveInt("Id phải là số nguyên dương");
		System.out.println("Nhập fullName của account");
		fullName = ScannerUtils.InputString("Tên không thể là 1 khoảng trắng hay để trống");
		System.out.println("Nhập tuổi");
		age = InputAccountAge();
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", fullName=" + fullName + ", age=" + age + "]";
	}

}
