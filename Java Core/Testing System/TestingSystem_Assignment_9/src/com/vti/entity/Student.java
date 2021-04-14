package com.vti.entity;

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
public class Student {
	private int id;
	private String name;
	private static int count = 0;

	public Student(String name) {
		id = ++count;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	/**
	 * @deprecated replaced by {@link #getIdV2()}
	 */
	public int getId() {
		return id;
	}

	public String getIdV2() {
		return "MSV: " + id;
	}
}
