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
public class Phone<K,V> extends MyMap<K, V> {
	
	/**
	 * Constructor for class Phone.
	 * 
	 * @Description: .
	 * @author: TĐGiang
	 * @create_date: Apr 8, 2021
	 * @version: 1.0
	 * @modifer: TĐGiang
	 * @modifer_date: Apr 8, 2021
	 */
	public Phone(K key, V value) {
		super(key, value);
	}
	/* 
	* @see com.vti.entity.Ex3.MyMap#getKey()
	*/
	@Override
	public K getKey() {
		
		return super.getKey();
	}
	
	public V getPhoneNumber() {
		
		return super.getValue();
	}
}
