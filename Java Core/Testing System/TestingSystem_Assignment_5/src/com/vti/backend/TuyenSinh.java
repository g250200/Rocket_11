package com.vti.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.entity.Abstraction.ThiSinh;
import com.vti.entity.Abstraction.ThiSinhKhoiA;
import com.vti.entity.Abstraction.ThiSinhKhoiB;
import com.vti.entity.Abstraction.ThiSinhKhoiC;


public class TuyenSinh implements ITuyenSinh {
	private List<ThiSinh> thiSinhs;

	public TuyenSinh() {
		thiSinhs = new ArrayList<ThiSinh>();
	}

	@Override
	public void AddThiSinh() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số thí sinh cần thêm");
		int n = scanner.nextInt();
		while (thiSinhs.size()< n) {
			System.out.println("Thí Sinh bạn muốn nhập thi khối nào: (A/B/C)");
			System.out.println("1: A");
			System.out.println("2: B");
			System.out.println("3: C");
			int chose = scanner.nextInt();
			switch (chose) {
			case 1:
				ThiSinhKhoiA thiSinhKhoiA = new ThiSinhKhoiA();
				thiSinhKhoiA.NhapThongTinThiSinh();
				thiSinhs.add(thiSinhKhoiA);
				break;
			case 2:
				ThiSinhKhoiB thiSinhKhoiB = new ThiSinhKhoiB();
				thiSinhKhoiB.NhapThongTinThiSinh();
				thiSinhs.add(thiSinhKhoiB);
				break;
			case 3:
				ThiSinhKhoiC thiSinhKhoiC = new ThiSinhKhoiC();
				thiSinhKhoiC.NhapThongTinThiSinh();
				thiSinhs.add(thiSinhKhoiC);
				break;

			default:
				System.out.println("Nhập lại");
				break;

			}
		}
	}

	@Override
	public void PrintThiSinh() {
		for (ThiSinh thiSinh : thiSinhs) {
			thiSinh.GetInfor();
			System.out.println("");
		}

	}

	@Override
	public void FindThiSinh() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số báo danh");
		int sbd = scanner.nextInt();
		for (ThiSinh thiSinh : thiSinhs) {

			if (thiSinh.getSoBaoDanh() == sbd) {
				thiSinh.GetInfor();
			}
		}
	}

	public void Menu() {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Nhập lựa chọn");
			System.out.println("1: Add thí sinh");
			System.out.println("2: hiển thị thông tin thí sinh");
			System.out.println("3: tìm thí sinh theo Số báo danh");
			System.out.println("0: exit");
			int index = scanner.nextInt();
			switch (index) {
			case 1:
				AddThiSinh();
				break;
			case 2:
				PrintThiSinh();
				break;
			case 3:
				FindThiSinh();
				break;
			case 0:
				return;
			default:
				System.out.println("Lựa chọn sai nhập lại!");
				break;
			}
		}
	}

}
