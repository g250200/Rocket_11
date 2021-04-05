package com.vti.entity.Static;


public class HinhTron extends HinhHoc{
	private int banKinh;
	
	public HinhTron(int b) {
		banKinh = b;
	}
	
	@Override
	public double TinhCV() {
		
		return 2*banKinh*Math.PI;
	}

	
	@Override
	public double TinhDT() {
		
		return banKinh*banKinh*Math.PI;
	}

}
