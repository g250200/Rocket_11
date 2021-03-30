package com.vti.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.entity.Abstraction.New;

public class MyNews {
	private List<New> news;

	public MyNews() {
		news = new ArrayList<New>();
	}

	public void InsertNew() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào số lượng new cần insert: ");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			New new1 = new New();
			new1.Input();
			news.add(new1);
		}

	}

	public void ViewListNew() {
		for (New new1 : news) {
			if (news.size() == 0) {
				System.out.println("Không có new nào");
			} else {
				new1.Display();
			}
		}
	}

	public void AnveragerRate() {
		for (New new1 : news) {
			new1.Calculate();
			new1.Display();
		}
	}

	public void Menu() {
		Boolean isexit = false;
		while (!isexit) {
			System.out.println("Nhập lựa chọn của bạn");
			System.out.println("1: insert New");
			System.out.println("2: view list new");
			System.out.println("3: Average rate");
			System.out.println("0: exit");
			System.out.println("-------------------------------------");
			Scanner scanner = new Scanner(System.in);
			int n = scanner.nextInt();
			switch (n) {
			case 1:
				InsertNew();;
				break;
			case 2:
				ViewListNew();;
				break;
			case 3:
				AnveragerRate();
				break;
			case 0:
				isexit = true;
				break;

			default:
				System.out.println("Không có chức năng bạn lựa chọn. Mời nhập lại");
				break;
			}
		}
	}
}
