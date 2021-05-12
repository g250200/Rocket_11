package com.vti.entity;

/**
 * This class is . 
 * 
 * @Description: .
 * @author: TĐGiang
 * @create_date: May 12, 2021
 * @version: 1.0
 * @modifer: TĐGiang
 * @modifer_date: May 12, 2021
 */
public enum Gender {
	MALE("M"), FEMALE("F"), UNKNOWN("U");
	
	private String value;
	private Gender(String value) {
		this.value = value; 
	}
	
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
}
