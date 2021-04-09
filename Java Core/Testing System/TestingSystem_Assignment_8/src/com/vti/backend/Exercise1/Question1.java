package com.vti.backend.Exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.vti.entity.Ex1.Student;
import com.vti.util.ScannerUtils;

public class Question1 {
	private List<Student> students;
	
	public Question1() {
		students = new ArrayList<Student>();
	}
	
	private void inputStudent() {
		System.out.println("Nhập vào số Student bạn muốn thêm");
		int n = ScannerUtils.inputSoDuong("Số student phải là 1 số dương");
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập student thứ: " + (i+1));
			students.add(new Student());
		}
	}
	
	private void printSudent() {
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
	public void inRaTongSoPhanTu(){
		System.out.println("Tổng số phần tử của students là: " + students.size() );
	}
	public void getIndex4ofStudent() {
		System.out.println("Phần tử thứ 4");
		System.out.println(students.get(4));
	}
	public void firstAdd() {
		students.add(0, new Student());
	}
	public void lastAdd() {
		students.add(new Student());
	}
	public void printFirstAndLast() {
		System.out.println("First Student" + students.get(0));
		System.out.println("Last Student" + students.get(students.size()-1));
	}
	public void reverseStudents() {
		Collections.reverse(students);
		System.out.println("Student sau khi đảo ngược vị trí");
		printSudent();
	}
	
	public void findStudentID() {
		System.out.println("Nhập id student bạn muốn tìm kiếm");
		int n = ScannerUtils.inputID();
		for (Student student : students) {
			if (student.getId()==n) {
				System.out.println("Student bạn cần tìm là: " + student);
			}
		}
	}
	public void findStudentName() {
		System.out.println("Nhập tên Student bạn muốn tìm kiếm");
		String name = ScannerUtils.inputString("Bạn phải nhập tên để tìm kiếm không được để trống");
		for (Student student : students) {
			if (student.getName().equals(name)) {
				System.out.println("Student bạn cần tìm là: " + student);
			}
		}
	}
	public void inRaStudentTrungTen() {
		for (int i = 0; i < students.size()-1; i++) {
			for (int j = 0; j < students.size(); j++) {
				if (students.get(i).getName().equals(students.get(j).getName())) {
					System.out.println(students.get(i));
					System.out.println(students.get(j));
				}
			}
		}
	}
	public void DeleteNameStudentID() {
		System.out.println("Nhập id student bạn muốn xóa tên");
		int n = ScannerUtils.inputID();
		for (Student student : students) {
			if (student.getId()==n) {
				student.setName(null);
			}
		}
		
	}
	public void deleteStudentID() {
		System.out.println("Nhập id student bạn muốn xóa");
		int n = ScannerUtils.inputID();
		for (Student student : students) {
			if (student.getId()==n) {
				students.remove(student);
			}
		}
	}
	public void addAllStudentsToStudentCopies() {
		ArrayList<Student> studentCopies = new ArrayList<>();
		studentCopies.addAll(students);
	}
	public void menu() {
		while (true) {
			System.out.println("Nhập lựa chọn của bạn");
			System.out.println("1: thêm Sudent");
			System.out.println("2: in ra các student");
			System.out.println("3: In ra tổng số phần tử của students");
			System.out.println("4: Lấy phần tử thứ 4 của students");
			System.out.println("5: In ra phần tử đầu và phần tử cuối của students");
			System.out.println("6: Thêm 1 phần tử vào vị trí đầu của students");
			System.out.println("7: Thêm 1 phần tử vào vị trí cuối của students");
			System.out.println("8: Đảo ngược vị trí của students");
			System.out.println("9: tìm kiếm student theo id");
			System.out.println("10: tìm kiếm student theo name");
			System.out.println("11: in ra các student có trùng tên");
			System.out.println("12: Xóa name của student theo id");
			System.out.println("13: Delete student theo id");
			System.out.println("14: Tạo 1 ArrayList tên là studentCopies và add tất cả students vào studentCopies");
			System.out.println("0: Exit");
			Scanner scanner = new Scanner(System.in);
			int chose = scanner.nextInt();
			switch (chose) {
			case 1:
				inputStudent();
				break;
			case 2:
				printSudent();
				break;
			case 3:
				inRaTongSoPhanTu();
				break;
			case 4:
				getIndex4ofStudent();
				break;
			case 5:
				printFirstAndLast();
				break;
			case 6:
				firstAdd();
				break;
			case 7:
				lastAdd();
				break;
			case 8:
				reverseStudents();
				break;
			case 9:
				findStudentID();
				break;
			case 10:
				findStudentName();
				break;
			case 11:
				inRaStudentTrungTen();
				break;
			case 12:
				DeleteNameStudentID();
				break;
			case 13:
				deleteStudentID();
				break;
			case 14:
				addAllStudentsToStudentCopies();
				break;
			case 0:
				return;
			default:
				System.out.println("lựa chọn không đúng mời nhập lại");
				break;
			}
		}
	}

}