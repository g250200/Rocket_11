package TestingSystem_Assignment_2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class System_Out_Printf {

	public static void main(String[] args) {
		// question 1
		int a = 5;
		System.out.printf("%d" ,a);
		System.out.println("");
		// question 2
		int b = 100000000;
		System.out.printf("%,d", b);
		System.out.println("");
		// question 3
		float c = 5.567098f;
		System.out.printf("%.4f" , c);
		System.out.println("");
		// question 4
		String name = "Nguyen Van A";
		System.out.println("Toi la " + name + " va toi dang doc than");
		// question 5
		String pattern = "dd/MM/yyyy HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		System.out.println(date);
		// question 6
		String email = "aaaaa@gmail.com";
		String full_NameString = "aaaaa";
		String department_Name = "Technician";
		System.out.println("Email \t \t Full Name \t Department");
		System.out.print(email + "\t \t" + full_NameString + "\t"+ department_Name);
	
	}

}
