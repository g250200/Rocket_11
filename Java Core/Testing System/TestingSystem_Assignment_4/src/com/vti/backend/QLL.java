package com.vti.backend;
import com.vti.entity.Abstraction.User.Employee;
import com.vti.entity.Abstraction.User.Manager;
import com.vti.entity.Abstraction.User.Waiter;
public class QLL {
	Employee employee = new Employee("G", 1000);
	Manager manager = new Manager("A", 1200);
	Waiter waiter = new Waiter("B", 600);
	public void printInfor() {
		employee.displayInfor();
		manager.displayInfor();
		waiter.displayInfor();
	}
	public void quanLyLuong() {
		System.out.println("Lương của employee: " + employee.calculatePay());
		System.out.println("Lương của manager: " + manager.calculatePay());
		System.out.println("Lương của Waiter: "  + waiter.calculatePay());
	}
}
