package com.vti.frontend;

public class Program3 {

	public static void main(String[] args) {
		try {
			int[] number = {0,1,2,3};
			System.out.println(number[10]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.print(e);
		}
	}

}
