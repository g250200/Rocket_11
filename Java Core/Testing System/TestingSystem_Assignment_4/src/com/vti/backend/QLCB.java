package com.vti.backend;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.entity.inheritance.QLCB.CanBo;
import com.vti.entity.inheritance.QLCB.CongNhan;
import com.vti.entity.inheritance.QLCB.KySu;
import com.vti.entity.inheritance.QLCB.NhanVien;

public class QLCB {
	private List<CanBo> canBos;
	public QLCB() {
		canBos = new ArrayList<CanBo>();
	}
	// them can bo
	public void themCanBo() {
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.println("Nhập số cán bộ cần thêm: ");
		n = scanner.nextInt();
		for(int i=0; i<n; i++) {
			int index;
			System.out.println("Cán bộ bạn muốn nhập");
			System.out.println("1: Công nhân");
			System.out.println("2: Kỹ sư");
			System.out.println("3: Công nhân");
			index = scanner.nextInt();
			switch (index) {
			case 1:
				CongNhan congNhan = new CongNhan();
				congNhan.input();
				canBos.add(congNhan);
				break;
			case 2:
				KySu kySu = new KySu();
				kySu.input();
				canBos.add(kySu);
				break;
			case 3:
				NhanVien nhanVien = new NhanVien();
				nhanVien.input();
				canBos.add(nhanVien);
				break;

			default:
				System.out.println("Vui lòng nhập lại theo gợi ý!");
				i--;
				break;
			}
		}
	}
	// in ra can bo
	public void printInforCanBo() {
		for (CanBo canBo : canBos) {
			System.out.println(canBo);
			System.out.println("");
		}
	}
	// tìm cán bộ theo tên
	public void findCanBo() {
		Scanner scanner = new Scanner(System.in);
		String hoten = scanner.nextLine();
		for (CanBo canBo : canBos) {
			if (canBo.getHoTen().equals(hoten)) {
				System.out.println(canBo);
			}
		}
		scanner.close();
	}
	// delete can bo theo ten
	public void deleteCanBo() {
		Scanner scanner = new Scanner(System.in);
		String hoten = scanner.nextLine();
		//canBos.removeIf(canBo->canBo.getHoTen().equals(hoten));
		for (CanBo canBo : canBos) {
			if (canBo.getHoTen().equals(hoten)) {
				canBos.remove(canBo);
			}
		}
		scanner.close();
	}
	
	// menu
	public void menu() {
		boolean isexit = true;
		while (isexit) {
			int n;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Moi bạn nhập lựa chọn");
			System.out.println("1: thêm cán bộ");
			System.out.println("2: in ra danh sách cán bộ");
			System.out.println("3: tìm kiếm cán bộ theo tên");
			System.out.println("4: xóa cán bộ theo tên");
			System.out.println("0: exit menu");
			n = scanner.nextInt();
			switch (n) {
			case 1:
				themCanBo();
				break;
			case 2:
				printInforCanBo();
				break;
			case 3:
				findCanBo();
				break;
			case 4:
				deleteCanBo();
				break;
			case 0:
				isexit = false;
				break;
			default:
				System.out.println("Nhập chức năng sai mời nhạp lại");
				break;
			}
		}
	}
}