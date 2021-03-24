package TestingSystem_Assignment_3;

import java.util.Random;
import java.util.Scanner;

public class Datatype_Casting {

	public static void main(String[] args) {
		// question 1
		float sarary = 5240.5f;
		float sarary2 = 10970.055f;
		System.out.println((int)sarary);
		System.out.println((int)sarary2);
		
		// question 2
		Random random = new Random();
		int a = random.nextInt(99999);
		String format = String.format("%05d", a);
		System.out.println(format);
		// question 3
		String convert = String.valueOf(a);
		System.out.println("Hai số cuối: " + convert.substring(3));
		// question 4
		int b;
		int c;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("nhap b");
		      b = scanner.nextInt();
		      if (b == 0) {
					System.out.println("Vui lòng nhập lai b khác 0. ");}
		} while(b == 0);
		do {
			System.out.println("nhap c");
		      c = scanner.nextInt();
		      if (c == 0) {
					System.out.println("Vui lòng nhập lai c khác 0. ");}
		} while(c == 0);
		scanner.close();
		System.out.println("Thuong cua a va b " + (float)b / (float) c );
	}

}
