package TestingSystem_Assignment_3;

import java.util.Scanner;

public class Strings {

	public static void main(java.lang.String[] args) {
		Question10();

	}
	// question 1
	public static void Question() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi nhap chuoi");
		String s = scanner.nextLine();
		String[] s3 = s.split("\\s+");
		String s2 = s.replaceAll("\\s", " ");
		System.out.println(s3.length);
		System.out.println(s2.length());
		scanner.close();
	}
	// question2
	public static void Question2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi nhap chuoi 1");
		String ss = scanner.nextLine();
		System.out.println("Moi nhap chuoi 2");
		String ss2 = scanner.nextLine();
		String ss3 = ss + ss2;
		String ss4 = ss.concat(ss2);
		System.out.println("chuoi khi noi:" + ss3);
		System.out.println("chuoi khi noi:" + ss4);
		scanner.close();
	}
	// question 3
	public static void Question3() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi nhap Ten");
		String name = scanner.nextLine();
		String first_character_of_name = name.substring(0, 1).toUpperCase();
		String left_character_of_name = name.substring(1);
		System.out.println("Ten da qua xu ly : " + (first_character_of_name+left_character_of_name));
		scanner.close();
	}
	// question 4
	public static void Question4() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi nhap Ten");
		String name = scanner.nextLine();
		name = name.toUpperCase();
		for(int i = 0 ; i<name.length(); i++) {
			System.out.println("Ky tu thu: " + (i+1) + " trong ten la: " + name.charAt(i));
		}
		scanner.close();
	}
	// question 5
	public static void Question5() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi nhap Ten");
		String name = scanner.nextLine();
		System.out.println("Moi nhap ho");
		String surname = scanner.nextLine();
		System.out.println("Ho va ten: " + surname + " " + name);
		scanner.close();
	}
	// question 6
	public static void Question6() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi nhap Họ và tên");
		String fullname = scanner.nextLine();
		fullname = fullname.trim();
		String[] words = fullname.split("\\s");
		String ho = words[0];
		String ten = words[words.length-1];
		String ten_Dem = fullname.substring(ho.length(),(fullname.length()-ten.length()));
		ten_Dem = ten_Dem.trim();
		System.out.println("Tên: " + ten);
		System.out.println("Tên đệm: " + ten_Dem);
		System.out.println("Họ: " + ho);
		scanner.close();
	}
	//question 7 
	public static void Question7() {
		Scanner scanner = new Scanner(System.in);
		String fullName;

		System.out.println("Nhập họ tên đầy đủ");
		fullName = scanner.nextLine();

		scanner.close();

		// remove space characters
		fullName = fullName.trim();
		fullName = fullName.replaceAll("\\s+", " ");

		String[] words = fullName.split(" ");
		fullName = "";

		for (String word : words) {
			String firstCharacter = word.substring(0, 1).toUpperCase();
			String leftCharacter = word.substring(1).toLowerCase();
			word = firstCharacter + leftCharacter;

			fullName += word + " ";
		}

		System.out.println("Họ tên sau khi chuẩn hóa: " + fullName);
	}
	//question 8
	public static void Question8() {
		String[] group_Name = {"aaJava", "bJavab","ccccc"};
		for (String string : group_Name) {
			if (string.contains("Java")) {
				System.out.println(string);
			}
		}
	}
	// question 9
	public static void Question9() {
		String[] group_Name = {"aaJava", "Java","ccccc"};
		for (String string : group_Name) {
			if (string.equals("Java")) {
				System.out.println(string);
			}
		}
	}
	// question 10
	public static void Question10() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi nhap chuỗi thứ 1");
		String s1 = scanner.nextLine();
		System.out.println("Moi nhap chuỗi thứ 2");
		String s2 = scanner.nextLine();
		String s3 = "";
		String s4 = "";
		for(int i = s1.length()-1; i>=0;i--)
		{
			s3 += s1.substring(i, i+1);
			s4 += s1.charAt(i);
		}
		if(s2.equals(s3)) {
			System.out.println("ok");
		}
		else {
			System.out.println("ko");
		}
	}
	// question 11
	public static void Question11() {
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi nhap chuỗi");
		String s1 = scanner.nextLine();
		for(int i=0;i<s1.length();i++) {
			if (s1.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println("số lần xuất hiện ký tự 'a': " + count);
	}
	// question 12
	public static void Question12() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi nhap chuỗi");
		String s1 = scanner.nextLine();
		String s3 = "";
		for(int i = s1.length()-1;i>=0;i--) {
			s3 +=s1.charAt(i); 
		}
		System.out.println(s3);
	}
	//question 13
	public static void Question13() {
		Scanner scanner = new Scanner(System.in);
		String str;

		System.out.println("Nhập chuỗi: ");
		str = scanner.nextLine();

		scanner.close();

		for (int i = 0; i < str.length(); i++) {
			if (Check_Number(str.charAt(i))) {
				System.out.println("False");
				return;
			}

		}

		System.out.println("True");
	}

	public static boolean Check_Number(char ch) {
		if (ch >= '0' && ch <= '9') {
			return true;
		}
		return false;
	}
	// question 14
	public static void Question14() {
		Scanner scanner = new Scanner(System.in);
		String str;
		char ch1, ch2;

		System.out.println("Nhập chuỗi: ");
		str = scanner.nextLine();

		System.out.println("Nhập kí tự muốn chuyển: ");
		ch1 = scanner.nextLine().toCharArray()[0];

		System.out.println("Nhập kí tự sẽ chuyển: ");
		ch2 = scanner.nextLine().toCharArray()[0];

		scanner.close();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch1) {
				str = str.replace(ch1, ch2);
			}
		}

		System.out.println("Chuoi sau khi chuyen: " + str);
	}
	// question 15
	public static void Question15() {
		Scanner scanner = new Scanner(System.in);
		String str;

		System.out.println("Chuỗi: ");
		str = scanner.nextLine();

		scanner.close();

		str = str.trim();

		String[] words = str.split("\\s");

		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " ");
		}
	}
	// question 16
	public static void Question16() {
		Scanner scanner = new Scanner(System.in);
		String str;
		int n;

		System.out.println("Chuỗi: ");
		str = scanner.nextLine();

		System.out.println("Nhập n: ");
		n = scanner.nextInt();

		scanner.close();

		if (str == null || str.isEmpty() || str.length() % n != 0) {
			System.out.println("No");
			return;
		}

		for (int i = 0; i < str.length(); i += n) {
			System.out.println(str.substring(i, i + n));
		}

	}
}
