package com.vti.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.entity.inheritance.QLTL.Bao;
import com.vti.entity.inheritance.QLTL.Sach;
import com.vti.entity.inheritance.QLTL.TaiLieu;
import com.vti.entity.inheritance.QLTL.TapChi;

public class QLTL {
	List<TaiLieu> taiLieus;
	public QLTL() {
		taiLieus = new ArrayList<TaiLieu>();
	}
	// add tài liệu
	public void themTaiLieu() {
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.println("Nhập số tài liệu cần thêm: ");
		n = scanner.nextInt();
		for(int i = 0; i<n ; i++) {
			int index;
			System.out.println("Tài liệu bạn muốn nhập ");
			System.out.println("1: Sách");
			System.out.println("2: Tạp chí");
			System.out.println("3: Báo");
			index = scanner.nextInt();
			switch (index) {
			case 1:
				Sach sach = new Sach();
				sach.input();
				taiLieus.add(sach);
				break;
			case 2:
				TapChi tapChi = new TapChi();
				tapChi.input();
				taiLieus.add(tapChi);
				break;
			case 3:
				Bao bao = new Bao();
				bao.input();
				taiLieus.add(bao);
				break;

			default:
				System.out.println("Vui lòng nhập lại theo gợi ý!");
				i--;
				break;
			}
		}
	}
	// delete tài liệu theo mã tài liệu
	public void deleteTaiLieu() {
		int ma;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập mã tài liệu bạn muốn xóa: ");
		ma = scanner.nextInt();
		//taiLieus.removeIf(taiLieu->taiLieu.getMaTaiLieu()==ma);
		for (TaiLieu taiLieu : taiLieus) {
			if (taiLieu.getMaTaiLieu() == ma) {
				taiLieus.remove(taiLieu);
			}
		}
		System.out.println("Xóa thành công");
	}
	//  hiển thị thông tin tài liệu;
	public void printTaiLieu() {
		for (TaiLieu taiLieu : taiLieus) {
			taiLieu.getInfor();
		}
	}
	// tìm kiếm tài liệu theo các loại;
	public void findtaiLieu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tài liệu bạn muốn tìm kiếm");
		System.out.println("1: Sách");
		System.out.println("2: Tạp chí");
		System.out.println("3: Báo");
		int index = scanner.nextInt();
		for (TaiLieu taiLieu : taiLieus) {
			switch (index) {
			case 1:
				if (taiLieu instanceof Sach) {
					taiLieu = (Sach) taiLieu;
					taiLieu.getInfor();
				}
				break;
			case 2:
				if (taiLieu instanceof TapChi) {
					taiLieu = (TapChi) taiLieu;
					taiLieu.getInfor();
				}
				break;
			case 3:
				if (taiLieu instanceof Bao) {
					taiLieu = (Bao) taiLieu;
					taiLieu.getInfor();
				}
				break;

			default:
				System.out.println("Không có tài liệu mà bạn muốn tìm kiếm");
				break;
			}
		}
	}
	public void menu() {
		boolean isexit = true;
		while (isexit) {
			int n;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Moi bạn nhập lựa chọn");
			System.out.println("1: tài liệu");
			System.out.println("2: in ra danh sách tài liệu");
			System.out.println("3: xóa tài liệu theo mã");
			System.out.println("4: tìm kiếm tài liệu theo loại");
			System.out.println("0: exit menu");
			n = scanner.nextInt();
			switch (n) {
			case 1:
				themTaiLieu();;
				break;
			case 2:
				printTaiLieu();
				break;
			case 3:
				deleteTaiLieu();
				break;
			case 4:
				findtaiLieu();
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
