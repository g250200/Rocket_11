package com.vti.frontend;

import com.vti.backend.QLCB;
import com.vti.backend.QLHS;
import com.vti.backend.QLTL;

public class Ex5 {

	public static void main(String[] args) {
		 //question 1,2;
		QLCB qlcb= new QLCB();
		qlcb.menu();
		 //question 3
		QLHS qlhs = new QLHS();
		qlhs.printhighSchoolStudent();
		// question 4
		QLTL qltl = new QLTL();
		qltl.menu();
	}

}
