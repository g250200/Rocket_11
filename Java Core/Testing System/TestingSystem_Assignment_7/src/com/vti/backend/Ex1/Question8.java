package com.vti.backend.Ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.entity.Static.Configs;
import com.vti.entity.Static.HinhCN;
import com.vti.entity.Static.HinhHoc;
import com.vti.entity.Static.HinhTron;

public class Question8 {
	public void Q8() throws Exception {
		Scanner scanner = new Scanner(System.in);
		List<HinhHoc> hinhHocs = new ArrayList<HinhHoc>();
		System.out.println("Nhập vào số lượng hình học muốn tạo");
		int n = scanner.nextInt();
		if (n > Configs.SO_LUONG_HINH_TOI_DA) {
			throw new Exception("Số lượng hình học tối đa là: " + Configs.SO_LUONG_HINH_TOI_DA);
		}
		for (int i = 0; i < n; i++) {

			System.out.println("1: add Hình tròn");
			System.out.println("2: add Hình CN");

			int chose = scanner.nextInt();
			switch (chose) {
			case 1:
				System.out.println("Nhập bán kính");
				int r = scanner.nextInt();
				HinhHoc hinhHoc = new HinhTron(r);
				hinhHocs.add(hinhHoc);
				break;
			case 2:
				System.out.println("Nhập vào chiều rộng");
				int a = scanner.nextInt();
				System.out.println("Nhập vào chiều cao");
				int b = scanner.nextInt();
				HinhHoc hinhHoc2 = new HinhCN(a, b);
				hinhHocs.add(hinhHoc2);
				break;

			default:
				System.out.println("vui lòng nhập đúng");
				i--;
				break;
			}
		}
	}
}
