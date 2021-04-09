package com.vti.entity.Ex4;

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
public class Salary<N extends Number> {
	private N salary;
	
	public Salary(N salary) {
		this.salary = salary;
	}
	public N getSalary() {
		return salary;
	}
	/* 
	* @see java.lang.Object#toString()
	*/
	@Override
	public String toString() {
		return "Salary [salary=" + salary + "]";
	}
	
}
