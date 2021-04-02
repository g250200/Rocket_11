package com.vti.frontend;

public class Program2 {

	public static void main(String[] args) {
		try {
			float result = Devide(5, 0);
			System.out.println(result);
		} catch (Exception e) {
			System.err.println("cannot devide 0");
		}
		finally {
			System.out.println("divide completed!");
		}
	}
	public static float Devide(int a, int b) {
		return a / b;
	}

}
