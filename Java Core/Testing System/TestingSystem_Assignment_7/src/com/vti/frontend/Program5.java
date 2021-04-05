package com.vti.frontend;

import com.vti.backend.Ex5.Question1;

public class Program5 {

	public static void main(String[] args) {
		Question1 question1 = new Question1();
		try {
			question1.menu();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
