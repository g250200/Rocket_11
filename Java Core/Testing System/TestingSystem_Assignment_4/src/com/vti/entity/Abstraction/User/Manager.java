package com.vti.entity.Abstraction.User;

public class Manager extends User{
	public Manager(String name, double salary) {
		super(name, salary);
	}

	@Override
	public double calculatePay() {
		
		return getSalaryRatio() * 520;
	}
}
