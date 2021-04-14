package com.vti.frontend;

import java.util.Date;

import com.vti.entity.Student;

/**
 * This class is . 
 * 
 * @Description: .
 * @author: TĐGiang
 * @create_date: Apr 9, 2021
 * @version: 1.0
 * @modifer: TĐGiang
 * @modifer_date: Apr 9, 2021
 */
public class Program2 {

	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) {
		Date date = new Date("2020-01-01");
		
		Student student = new Student("Nguyen văn A");
		System.out.println(student.getId());
		System.out.println(student.getIdV2());
	}

}
