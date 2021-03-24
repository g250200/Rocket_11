package TestingSystem_Assignment_3;

import com.sun.jdi.IntegerValue;

public class Boxing_And_Unboxing {

	public static void main(String[] args) {
		// question 1
		Integer sarary = 50000;
		float sararys =Float.valueOf(sarary);
		System.out.printf("%.2f %n",sararys);
		// question 2
		String a = "123456";
		int i = Integer.valueOf(a);
		System.out.println(i);
		// question 3
		Integer i2 = Integer.valueOf("123456");
		int i3 = i2.intValue();
		System.out.println(i3);

	}

}
