package com.vti.backend.Exercise1;

import java.util.HashSet;
import java.util.Set;
import com.vti.entity.Ex1.Student;
import com.vti.util.ScannerUtils;

public class Question4 {
	Set<Student> students = new HashSet<Student>();
	
	public void inputStudent() {
		System.out.println("Nhập vào số Student bạn muốn thêm");
		int n = ScannerUtils.inputSoDuong("Số student phải là 1 số dương");
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập student thứ: " + (i+1));
			students.add(new Student());
		}
	}
	public void printSet() {
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
}
