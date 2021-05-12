package com.vti.frontend;

import java.util.List;
import java.util.Scanner;

import com.vti.entity.TestingCategory;
import com.vti.repository.TestingCategoryRepository;

/**
 * This class is .
 * 
 * @Description: .
 * @author: TĐGiang
 * @create_date: May 11, 2021
 * @version: 1.0
 * @modifer: TĐGiang
 * @modifer_date: May 11, 2021
 */
public class ProgramTestingCategory {
	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		TestingCategoryRepository repository = new TestingCategoryRepository();
		while (true) {
			System.out.println("Nhập vào lựa chọn của bạn");
			System.out.println("1: Get All TestingCategory");
			System.out.println("2: Get TestingCategory By ID");
			System.out.println("3: Get TestingCategory By Name");
			System.out.println("4: Create TestingCategory");
			System.out.println("5: Update TestingCategory ");
			System.out.println("6: Delete TestingCategory");
			System.out.println("7: Check TestingCategory By ID");
			System.out.println("8: Check TestingCategory By Name");
			System.out.println("0: Exit");
			Scanner scanner = new Scanner(System.in);
			int chose = scanner.nextInt();
			switch (chose) {
			case 0:

				return;
			case 1:
				List<TestingCategory> testingCategories = repository.getAllTestingcategory();

				for (TestingCategory testingCategory : testingCategories) {
					System.out.println(testingCategory);
				}
				break;
			case 2:
				System.out.println("Nhập ID TestingCategory");
				short id = scanner.nextShort();
				TestingCategory testingCategoryByID = repository.getTestingCategoryByID(id);
				System.out.println(testingCategoryByID);
				break;
			case 3:
				System.out.println("Nhập name TestingCategory");
				scanner.nextLine();
				String name = scanner.nextLine();
				TestingCategory testingCategoryByName = repository.getTestingCategoryByName(name);
				System.out.println(testingCategoryByName);
				break;
			case 4:
				System.out.println("Nhập name TestingCategory cần tạo");
				scanner.nextLine();
				String name1 = scanner.nextLine();
				TestingCategory testingCategory = new TestingCategory();
				testingCategory.setName(name1);
				repository.createTestingCategory(testingCategory);
				System.out.println("Successful");
				break;
			case 5:
				System.out.println("Nhập ID TestingCategory cần update");
				short id2 = scanner.nextShort();
				System.out.println("Nhập name TestingCategory mới");
				scanner.nextLine();
				String name2 = scanner.nextLine();
				repository.updateTestingCategory(id2, name2);
				System.out.println("Successful");
				break;
			case 6:
				System.out.println("Nhập ID TestingCategory cần delete");
				short id3 = scanner.nextShort();
				repository.deleteTestingCategory(id3);
				System.out.println("Successful");
				break;
			case 7:
				System.out.println("Nhập ID TestingCategory cần check");
				short id4 = scanner.nextShort();
				boolean check = repository.isTestingCategoryExistsByID(id4);
				if (check) {
					System.out.println("TestingCategory is exist");
				}else {
					System.out.println("TestingCategory is not exist");
				}
				break;
			case 8:
				System.out.println("Nhập name TestingCategory cần check");
				scanner.nextLine();
				String name3 = scanner.nextLine();
				
				boolean check1 = repository.isTestingCategoryExistsByName(name3);
				if (check1) {
					System.out.println("TestingCategory is exist");
				}else {
					System.out.println("TestingCategory is not exist");
				}
				break;
		

			default:
				System.out.println("Lựa chọn không đúng mời nhập lại");
				break;
			}
		}
	}
}
