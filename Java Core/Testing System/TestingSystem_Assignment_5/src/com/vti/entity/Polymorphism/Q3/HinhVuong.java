package com.vti.entity.Polymorphism.Q3;

public class HinhVuong extends HinhChuNhat{
	public float TinhChuVi(float a) {
		return super.TinhChuVi(a, a);
	}
	public float TinhDienTich(float a) {
		return super.TinhDienTich(a, a);
	}
}
