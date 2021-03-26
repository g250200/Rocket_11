package com.vti.entity.inheritance.QLCB;

import java.util.Scanner;

public class KySu extends CanBo {
	private String nganhDaoTao;

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}

	@Override
	public void input() {
		super.input();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập ngành đào tạo: ");
		nganhDaoTao = scanner.nextLine();
	}

	@Override
	public String toString() {

		return "Kỹ Sư: " + super.toString() + "Ngành: " + nganhDaoTao;
	}
}
