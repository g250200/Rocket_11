package com.vti.backend.Exercise3;

import com.vti.entity.Ex3.Staff;

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
public class Question8 {
	public void Q8() {
		Staff<Integer> staff = new Staff<Integer>(1, "AAA");
		System.out.println("Staff { Id: " + staff.getID() + ", Name: " + staff.getName() + " }");
		Staff<Long> staff2 = new Staff<Long>((long)2, "BBB");
		System.out.println("Staff { Id: " + staff2.getID() + ", Name: " + staff2.getName() + " }");
	}
}
