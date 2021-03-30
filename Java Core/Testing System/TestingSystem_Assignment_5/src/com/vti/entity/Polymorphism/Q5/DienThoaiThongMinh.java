package com.vti.entity.Polymorphism.Q5;

public class DienThoaiThongMinh extends DienThoaiDiDong {
	public void SuDung3G() {
		System.out.println("Sử dụng 3G");
	}
	public void ChupHinh() {
		System.out.println("Chụp hình");
		
	}
	@Override
	public void TanCong() {
		System.out.println("ném người");
		
	}
}
