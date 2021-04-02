package com.vti.utils;

import java.util.Scanner;

public class ScannerUtils {
	private static Scanner scanner = new Scanner(System.in);

	public static int InputInt(String errMessage){
		while (true) {
			try {
				return Integer.parseInt(scanner.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errMessage);
			}
		}
	}
	public static float InputFloat(String errMessage){
		while (true) {
			try {
				return Float.parseFloat(scanner.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errMessage);
			}
		}
	}
	public static double InputDouble(String errMessage){
		while (true) {
			try {
				return Double.parseDouble(scanner.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errMessage);
			}
		}
	}
	public static long InputLong(String errMessage){
		while (true) {
			try {
				return Long.parseLong(scanner.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errMessage);
			}
		}
	}
	public static String InputString(String errMessage){
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
	public static int InputAge(){
		while (true) {
			int age = InputInt("err!!! Tuổi phải là một số nguyên. Mời nhập lại");
			if (age<=0) {
				System.err.println("err!!! Tuổi không được là một số âm. Mời nhập lại");
			}
			else {
				return age;
			}
		}
	}
	public static int InputAgeThan18(){
		while (true) {
			int age = InputAge();
			if (age<=18) {
				System.err.println("err!!! Tuổi không được nhỏ hơn 18. Mời nhập lại");
			}
			else {
				return age;
			}
		}
	}
	public static int InputPositiveInt(String e){
		while (true) {
			int id = InputInt(e);
			if (id<=0) {
				System.err.println(e);
			} else {
				return id;
			}
		}
	}
	public static int InputNonNegativeInt() {
		while (true) {
			int i = InputInt("Nhập vào 1 số nguyên. Mời nhập lại");
			if (i<0) {
				System.err.println("Nhập vào số nhuyên không âm!!!. Mời nhập lại");
			} else {
				return i;
			}
		}
	}
}

