package com.vti.entity.Static;

/**
 * This class is . 
 * 
 * @Description: .
 * @author: TĐGiang
 * @create_date: Apr 5, 2021
 * @version: 1.0
 * @modifer: TĐGiang
 * @modifer_date: Apr 5, 2021
 */
public class PrimaryStudent extends Student{
	public static int counterPrimary = 0;
	
	public PrimaryStudent(int id, String name) {
		super(id, name);
		counterPrimary++;
	}

}
