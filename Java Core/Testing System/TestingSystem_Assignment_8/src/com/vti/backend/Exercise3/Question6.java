package com.vti.backend.Exercise3;

import com.vti.entity.Ex3.MyMap;

/**
 * This class is . 
 * 
 * @Description: .
 * @author: TĐGiang
 * @create_date: Apr 8, 2021
 * @version: 1.0
 * @modifer: TĐGiang
 * @modifer_date: Apr 8, 2021
 */
public class Question6 {
	public void Q6() {
		MyMap<Integer, String> student = new MyMap<Integer, String>(1, "AAA");
		System.out.println("MSV: " + student.getKey());
		System.out.println("Name: " + student.getValue());
	}
}
