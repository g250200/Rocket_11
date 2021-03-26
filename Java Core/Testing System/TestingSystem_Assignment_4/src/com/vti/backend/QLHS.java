package com.vti.backend;

import com.vti.entity.inheritance.QLHS.HighSchoolStudent;

public class QLHS {
	HighSchoolStudent highSchoolStudent = new HighSchoolStudent(1, "Giang", "Chuyên tin", "ĐH KTQD");
	public void printhighSchoolStudent() {
		System.out.println("Id: " + highSchoolStudent.getId());
		System.out.println("name: " + highSchoolStudent.getName());
		System.out.println("clazz: " + highSchoolStudent.getClazz());
		System.out.println("Đại học muốn đỗ: " + highSchoolStudent.getDesiredUniversity());
	}
}
