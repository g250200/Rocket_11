package com.vti.backend.Ex5;

import java.util.ArrayList;
import java.util.List;

import com.vti.entity.File.Student;
import com.vti.utils.IOManager;
import com.vti.utils.ScannerUtils;

public class Question1 {
	private List<Student> students;
	private String path;
	private String nameFile;

	public Question1() {
		students = new ArrayList<>();
		path = "C:\\Users\\Admin\\Desktop";
		nameFile="InforStudent.ser";
	}

	public void inputStudents() {
		System.out.println("Nhập số student: ");
		int n = ScannerUtils.inputSoDuong("Số Student phải là số > 0");

		for (int i = 0; i < n; i++) {
			System.out.println("Student thứ" + (i+1));
			students.add(new Student());
		}
	}

	public void printStudents() {
		for (Student student : students) {
			System.out.println(student);
		}
	}

	public void writeStudents() throws Exception {
		System.out.println(students);
		IOManager.writeObject(path,nameFile,students);
	}

	public void readStudents() throws Exception {
		String pathFile = path +"\\"+nameFile;
		students = (List<Student>) IOManager.readObject(pathFile);
	}

	public void menu() throws Exception {
		while (true) {
			System.out.println("Nhập lựa chọn của bạn");
			System.out.println("1: add student");
			System.out.println("2: print Student");
			System.out.println("3: ghi student vào file");
			System.out.println("4: Đọc student từ file");
			System.out.println("0: exit");
			int chose = ScannerUtils.inputInt("Lựa chọn phải là 1 số");
			switch (chose) {
			case 1:
				inputStudents();
				break;
			case 2:
				printStudents();
				break;
			case 3:
				writeStudents();
				break;
			case 4:
				readStudents();
				break;
			case 0:
				return;

			default:
				System.out.println("Lựa chọn không có mời nhập lại");
				break;
			}
		}
	}
}
