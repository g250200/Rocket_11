package com.vti.entity.Abstraction.User;

public class Employee extends User {
	
	
	
	public Employee(String name, double salary) {
		super(name, salary);
	}

	@Override
	public double calculatePay() {
		return getSalaryRatio() * 420;
	}
}
