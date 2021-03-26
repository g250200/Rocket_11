package com.vti.entity.Abstraction.User;

public class Waiter extends User{
	public Waiter(String name2, double salary) {
		super(name2, salary);
	}

	@Override
	public double calculatePay() {
		return getSalaryRatio() * 220;
	}
}
