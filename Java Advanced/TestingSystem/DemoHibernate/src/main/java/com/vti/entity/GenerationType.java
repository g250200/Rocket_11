package com.vti.entity;


public enum GenerationType {
	Random("Random"), Custom("Custom");
	
	private String value;

	private GenerationType(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
}
