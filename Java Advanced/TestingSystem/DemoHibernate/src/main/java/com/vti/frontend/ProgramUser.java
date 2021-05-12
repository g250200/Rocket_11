package com.vti.frontend;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.vti.entity.Gender;

import com.vti.entity.User;
import com.vti.repository.UserRepository;

/**
 * This class is . 
 * 
 * @Description: .
 * @author: TĐGiang
 * @create_date: May 12, 2021
 * @version: 1.0
 * @modifer: TĐGiang
 * @modifer_date: May 12, 2021
 */
public class ProgramUser {
	public static void main(String[] args) {
		menu();
	}
	
	public static void menu() {
		UserRepository repository = new UserRepository();
		while (true) {
			System.out.println("Nhập vào lựa chọn của bạn");
			System.out.println("1: Get All User");
			System.out.println("2: Get User By ID");
			System.out.println("3: Get User By UserName");
			System.out.println("4: Create User");
			System.out.println("5: Update User ");
			System.out.println("6: Delete User");
			System.out.println("7: Check User By ID");
			System.out.println("8: Check User By UserName");
			System.out.println("0: Exit");
			Scanner scanner = new Scanner(System.in);
			int chose = scanner.nextInt();
			switch (chose) {
			case 0:

				return;
			case 1:
				List<User> users = repository.getAllUser();

				for (User user : users) {
					System.out.println(user);
				}
				break;
			case 2:
				System.out.println("Nhập ID User cần tìm");
				short id = scanner.nextShort();
				User user = repository.getUserByID(id);
				System.out.println(user);
				break;
			case 3:
				System.out.println("Nhập  UserName của  User");
				scanner.nextLine();
				String name = scanner.nextLine();
				User user2 = repository.getUserByUserName(name);
				System.out.println(user2);
				break;
			case 4:
				System.out.println("Nhập Username User cần tạo");
				scanner.nextLine();
				String userName = scanner.nextLine();
				System.out.println("Nhập Email");
				String email = scanner.nextLine();
				System.out.println("Nhập Password");
				String password = scanner.nextLine();
				System.out.println("Nhập firstName");
				String firstName = scanner.nextLine();
				System.out.println("Nhập lastName");
				String lastName = scanner.nextLine();
				System.out.println("Nhập address");
				String address = scanner.nextLine();
				System.out.println("Nhập phone");
				String phone = scanner.nextLine();
				User user3 = new User();
				user3.setUserName(userName);
				user3.setEmail(email);
				user3.setPassword(password);
				user3.setFirstName(firstName);
				user3.setLastName(lastName);
				user3.setCreateDate(new Date("25/02/2000"));
				user3.setGender(Gender.UNKNOWN);
				user3.setAddress(address);
				user3.setPhone(phone);
				repository.createUser(user3);
				System.out.println("Successful");
				break;
			case 5:
				System.out.println("Nhập ID User cần update");
				short id2 = scanner.nextShort();
				System.out.println("Nhập FirstName User mới");
				scanner.nextLine();
				String firstName2 = scanner.nextLine();
				System.out.println("Nhập LastName User mới");
				String lastName2 = scanner.nextLine();
				repository.updateUser(id2, firstName2, lastName2);
				System.out.println("Successful");
				break;
			case 6:
				System.out.println("Nhập ID User cần delete");
				short id3 = scanner.nextShort();
				repository.deleteUser(id3);
				System.out.println("Successful");
				break;
			case 7:
				System.out.println("Nhập ID User cần check");
				short id4 = scanner.nextShort();
				boolean check = repository.isUserExistsByID(id4);
				if (check) {
					System.out.println("User is exist");
				}else {
					System.out.println("User is not exist");
				}
				break;
			case 8:
				System.out.println("Nhập UserName của User cần check");
				scanner.nextLine();
				String name3 = scanner.nextLine();
				
				boolean check1 = repository.isUserExistsByName(name3);
				if (check1) {
					System.out.println("User is exist");
				}else {
					System.out.println("User is not exist");
				}
				break;
		

			default:
				System.out.println("Lựa chọn không đúng mời nhập lại");
				break;
			}
		}
	}
}
