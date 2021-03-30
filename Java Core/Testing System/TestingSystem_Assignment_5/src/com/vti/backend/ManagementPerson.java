package com.vti.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.vti.entity.Polymorphism.Q2.Person;
import com.vti.entity.Polymorphism.Q2.SinhVien;

public class ManagementPerson {
	private List<Person> persons;

	public ManagementPerson() {
		persons = new ArrayList<Person>();
	}

	public void AddSinhVien() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số lượng sinh viên cần thêm");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập Sinh viên thứ: " + (i+1));
			SinhVien sinhVien = new SinhVien();
			sinhVien.InputInfor();
			persons.add(sinhVien);
		}
	}

	public void PrintInfor() {
		for (Person person : persons) {
			person.ShowInfor();
			System.out.println("");
		}
	}

	public void XetHocBong() {
		for (Person person : persons) {

			if (((SinhVien) person).isXetHocBong()) {
				System.out.println("Sinh viên: "+ person.getName()+ "Điểm: " + ((SinhVien) person).getDiemTB() + "được học bổng");
			} else {
				System.out.println("Sinh viên: "+ person.getName() + "Điểm: " + ((SinhVien) person).getDiemTB() + "không đủ điều kiện được học bổng");

			}

		}
	}

	public void Menu() {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Nhập lựa chọn");
			System.out.println("1: thêm sinh viên");
			System.out.println("2: show infor");
			System.out.println("3: xét học bổng");
			System.out.println("0: exit");
			int index = scanner.nextInt();
			switch (index) {
			case 1:
				AddSinhVien();
				break;
			case 2:
				PrintInfor();
				break;
			case 3:
				XetHocBong();
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
