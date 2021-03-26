package com.vti.entity.Abstraction.User;

import java.util.Scanner;

public abstract class User {
	private String name;
	private double salaryRatio;
	public User(String name2, double salary) {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalaryRatio() {
		return salaryRatio;
	}
	public void setSalaryRatio(double salaryRatio) {
		this.salaryRatio = salaryRatio;
	}
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào tên: " );
		name = scanner.nextLine();
		System.out.println("Nhập vào lương: ");
		salaryRatio = scanner.nextDouble();
	}
	public abstract double calculatePay();
	public void displayInfor() {
		System.out.println("Name: " + name);
		System.out.println("salary ratio: " + salaryRatio);
	}
}
