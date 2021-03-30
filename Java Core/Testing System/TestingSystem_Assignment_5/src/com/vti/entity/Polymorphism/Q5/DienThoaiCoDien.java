package com.vti.entity.Polymorphism.Q5;

public class DienThoaiCoDien extends DienThoaiDiDong{
	public void Radio() {
		System.out.println("Nghe radio");
	}
	@Override
	public void TanCong() {
		System.out.println("Nem chó");
		
	}
}
