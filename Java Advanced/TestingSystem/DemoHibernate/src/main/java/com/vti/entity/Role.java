package com.vti.entity;


public enum Role {
	Admin("Admin"), Employee("Employee"), Manager("Manager");
	
	private String code;
	
	
	private Role(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}
}
