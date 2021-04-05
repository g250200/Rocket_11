package com.vti.entity.Static;

public class Student {
	public static int counter = 0;

	private static String college = "ĐH Bách Khoa";
	private int id;
	private String name;
	private static int moneyGroup = 0;
	public static int maxStudent = 7;

	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
		counter++;
	}
	
	public static String getCollege() {
		return college;
	}
	
	public static void setCollege(String college) {
		Student.college = college;
	}

	@Override
	public String toString() {
		return "Student [id = " + id + ", name = " + name +"college = "+ college + "]";
	}

	public static int getMoneyGroup() {
		return moneyGroup;
	}
	
	public void spend(int i) {
		moneyGroup = moneyGroup - i;
	}

	public static void setMoneyGroup(int moneyGroup) {
		Student.moneyGroup = moneyGroup;
	}
}
