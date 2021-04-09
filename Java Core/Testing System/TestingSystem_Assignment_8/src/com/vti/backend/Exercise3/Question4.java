package com.vti.backend.Exercise3;

public class Question4 {
	Integer[] i = {1,2,3,4,5};
	Float[] f = {1.2f,2.5f,5.0f,7f};
	Double[] d = {1.3,5.0, 6.3,2.2};
	
	private <E>void printArr(E[] e) {
		for (int i = 0; i < e.length; i++) {
			System.out.print(e[i] + " ");
		}
	}
	public void print() {
		printArr(i);
		printArr(f);
		printArr(d);
	}
}
