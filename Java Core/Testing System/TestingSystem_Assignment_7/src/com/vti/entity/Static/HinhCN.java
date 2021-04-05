package com.vti.entity.Static;

public class HinhCN extends HinhHoc{
	private int a;
	private int b;
	
	
	public HinhCN(int a , int b) {
		this.a = a;
		this.b = b;
	}


	
	@Override
	public double TinhCV() {
		
		return 2*(a+b);
	}


	
	@Override
	public double TinhDT() {
		
		return a*b;
	}
	
}
