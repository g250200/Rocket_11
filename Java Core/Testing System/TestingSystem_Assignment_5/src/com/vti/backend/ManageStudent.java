package com.vti.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.entity.Polymorphism.Q1.Student;

public class ManageStudent implements IStudent {
	private List<Student> students;

	public ManageStudent() {
		students = new ArrayList<Student>();
		Nhap();
	}

	public void Nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số student: ");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			Student student = new Student();
			student.Nhap();
			students.add(student);
		}
	}

	public void DiemDanh() {
		for (Student student : students) {
			student.DiemDanh();
		}
	}

	public void HocBai() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhập group để gọi đi học bài");
		int n = scanner.nextInt();
		for (Student student : students) {
			if (student.getGroup()==n) {
				student.HocBai();
			}
		}
	}

	public void DonVeSinh() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhập group để gọi đi don ve sinh");
		int n = scanner.nextInt();
		for (Student student : students) {
			if (student.getGroup()==n) {
				student.DonVeSinh();
			}
		}
	}

	public void Menu() {

		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Nhập lựa chọn");
			System.out.println("1: Điểm danh cả lớp");
			System.out.println("2: Gọi 1 group đi học bài");
			System.out.println("3: Gọi 1 group đi dọn vệ sinh");
			System.out.println("0: exit");
			int index = scanner.nextInt();
			switch (index) {
			case 1:
				DiemDanh();
				break;
			case 2:
				HocBai();
				break;
			case 3:
				DonVeSinh();
				break;
			case 0:
				return;
			default:
				System.out.println("Lựa chọn sai nhập lại!");
				break;
			}
		}
	}

}
