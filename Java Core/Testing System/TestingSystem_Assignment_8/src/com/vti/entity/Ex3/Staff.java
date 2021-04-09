package com.vti.entity.Ex3;

/**
 * This class is .
 * 
 * @Description: .
 * @author: TĐGiang
 * @create_date: Apr 8, 2021
 * @version: 1.0
 * @modifer: TĐGiang
 * @modifer_date: Apr 8, 2021
 */
public class Staff<N extends Number> extends MyMap<N, String> {

	public Staff(N id, String name) {
		super(id, name);
	}

	public N getID() {

		return super.getKey();
	}

	public String getName() {

		return super.getValue();
	}
}
