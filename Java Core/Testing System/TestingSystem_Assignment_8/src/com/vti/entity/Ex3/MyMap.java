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
public class MyMap<K,V> {
	 private K key;
	 private V value;
	 
	public MyMap(K key, V value) {
		this.key = key;
		this.value = value;
	}

	
	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
	
		
}
