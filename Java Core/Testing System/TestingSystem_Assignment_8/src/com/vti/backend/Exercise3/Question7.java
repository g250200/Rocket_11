package com.vti.backend.Exercise3;

import com.vti.entity.Ex3.Phone;

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
public class Question7 {
	public void Q7() {
		Phone<String, String> phone = new Phone<String, String>("tdg@gmail.com", "0988888888");
		System.out.println("Email: " + phone.getKey()+", SDT: " + phone.getPhoneNumber());
		Phone<Integer, String> phone2 = new Phone<Integer, String>(1, "0988888888");
		System.out.println("STT: " + phone2.getKey()+", SDT: " + phone2.getPhoneNumber());
		Phone<String, String> phone3 = new Phone<String, String>("TĐG", "0988888888");
		System.out.println("Name: " + phone3.getKey()+", SDT: " + phone3.getPhoneNumber());
	}
}
