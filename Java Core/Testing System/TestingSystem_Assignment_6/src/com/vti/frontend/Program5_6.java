package com.vti.frontend;

import java.util.Scanner;

public class Program5_6 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Mời nhập tuổi");
		int age = InputAge();
		System.out.println("Tuổi của bạn là: " + age);

	}
public static int InputAge() {
		
		while (true) {
			try {
				Scanner scanner = new Scanner(System.in);
				int age;
				System.out.println("Mời nhập tuổi");
				age = scanner.nextInt();
				if (age <= 0) {
					System.err.println("Tuổi phải lớn hơn 0. Mời nhập lại");
				}
				else {
					return age;
				}
			} catch (Exception e) {
				System.err.println("Tuổi phải là 1 số. Mời nhập lại");
			}

		}
	}
}
