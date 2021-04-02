package com.vti.frontend;

import com.vti.entity.Department;

public class Program4 {
	private static Department[] departments = new Department[3];

	public static void main(String[] args) {
		Department department1 = new Department(1, "A");
		Department department2 = new Department(2, "B");
		Department department3 = new Department(3, "C");
		
		departments[0] = department1;
		departments[1] = department2;
		departments[2] = department3;
		
		GetIndex(10);
	}
	private static void GetIndex(int index) {
		try {
			System.out.println(departments[index]);

		} catch (Exception e) {
			System.err.println("Cannot find department!");
		}

	}

}
