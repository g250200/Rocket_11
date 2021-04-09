package com.vti.entity.Ex3;

import java.util.Arrays;

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
public class Employee<N extends Number> {
	private int id;
	private String name;
	private N[] salaries;
	
	/**
	 * Constructor for class Employee.
	 * 
	 * @Description: .
	 * @author: TĐGiang
	 * @create_date: Apr 8, 2021
	 * @version: 1.0
	 * @modifer: TĐGiang
	 * @modifer_date: Apr 8, 2021
	 */
	public Employee(int id, String name , N[] salaries ) {
		this.id = id;
		this.name = name;
		this.salaries = salaries;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salaries=" + Arrays.toString(salaries) + "]";
	}
	
	public N FinalSalary() {
		return  salaries[salaries.length - 1];
	}
	
}
