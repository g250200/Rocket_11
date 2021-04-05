package com.vti.utils;

import java.util.Scanner;

public class ScannerUtils {
	private static Scanner scanner = new Scanner(System.in);

	public static int inputInt(String errMessage){
		while (true) {
			try {
				return Integer.parseInt(scanner.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errMessage);
			}
		}
	}
	public static float inputFloat(String errMessage){
		while (true) {
			try {
				return Float.parseFloat(scanner.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errMessage);
			}
		}
	}
	public static double inputDouble(String errMessage){
		while (true) {
			try {
				return Double.parseDouble(scanner.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errMessage);
			}
		}
	}
	public static long inputLong(String errMessage){
		while (true) {
			try {
				return Long.parseLong(scanner.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errMessage);
			}
		}
	}
	public static String inputString(String errMessage){
		while (true) {
			String input = scanner.nextLine().trim();
			if (!input.isEmpty()) {
				return input;
			}
			else {
				System.err.println(errMessage);
			}
		}
	}
	public static int inputAge(){
		while (true) {
			int age = inputInt("err!!! Tuổi phải là một số nguyên. Mời nhập lại");
			if (age<=0) {
				System.err.println("err!!! Tuổi không được là một số âm. Mời nhập lại");
			}
			else {
				return age;
			}
		}
	}
	public static int inputAgeThan18(){
		while (true) {
			int age = inputAge();
			if (age<=18) {
				System.err.println("err!!! Tuổi không được nhỏ hơn 18. Mời nhập lại");
			}
			else {
				return age;
			}
		}
	}
	public static int inputID(){
		while (true) {
			int id = inputInt("ID phải là một số nguyên dương. Mời nhập lại");
			if (id<=0) {
				System.err.println("ID không được là số âm!!!. Mời nhập lại");
			} else {
				return id;
			}
		}
	}
	public static int inputSoDuong(String message){
		while (true) {
			int id = inputInt(message);
			if (id<=0) {
				System.err.println(message);
			} else {
				return id;
			}
		}
	}
}

