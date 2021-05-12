package com.vti.entity;

public enum Type {
	MultipleChoice("Multiple-Choice"), Essay("Essay");
	
	private String value;
	
	private Type(String value) {
		this.value = value;
	}
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
}
