package com.vti.backend.Exercise3;

import java.util.Iterator;

import com.vti.entity.Ex3.Employee;

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
public class Question5 {
	
	public void Q5() {
		Integer[] salaries1 = { 1000, 1200, 1250 };
		Float[] salaries2 = { 1000.5f, 1200.33f, 1250.2f };
		Double[] salaries3 = { 1000.55, 1200.234, 1250.567 };
		Employee<Integer> employee1 = new Employee<Integer>(1, "AAA", salaries1);
		Employee<Float> employee2 = new Employee<Float>(2, "BBB", salaries2);
		Employee<Double> employee3 = new Employee<Double>(3, "CCC", salaries3);
		System.out.println("Thông tin nhân viên: " + employee1);
		System.out.println("Tháng lương cuối cùng: " + employee1.FinalSalary());
		System.out.println("Thông tin nhân viên: " + employee2);
		System.out.println("Tháng lương cuối cùng: " + employee2.FinalSalary());
		System.out.println("Thông tin nhân viên: " + employee3);
		System.out.println("Tháng lương cuối cùng: " + employee3.FinalSalary());
	}
}
