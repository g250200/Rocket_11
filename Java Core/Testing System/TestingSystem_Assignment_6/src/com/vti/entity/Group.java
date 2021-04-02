package com.vti.entity;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Iterator;

import com.vti.utils.ScannerUtils;

public class Group {
	private int id;
	private String name;
	private Account[] accounts;
	private LocalDate createDate;
	
	public Group() {
		accounts = new Account[1000];
		Input();
	}
	
	private void AddAccount() {
		System.out.println("Nhập số lượng account trong group");
		int n = ScannerUtils.InputPositiveInt("Số lượng account phải là số nguyên không âm");
		for (int i = 0; i < n; i++) {
			accounts[i] = new Account();
		}
	}
	private void LuaChon() {
		System.out.println("Nhập 1 để add Account; Nhập 0 để bỏ qua add Account");
		
		while (true) {
			int chose = ScannerUtils.InputInt("lựa chọn phải là 1 số nguyên");
			switch (chose) {
			case 1:
				AddAccount();
				return;
			case 0:
				return;
			default:
				System.out.println("lựa chọn của bạn không có! hãy nhập lại. \n Nhập 1 để add Account, Nhập 0 để bỏ qua");
				break;
			}
		}
	}
	private void Input() {
		System.out.println("Nhập id của group");
		id = ScannerUtils.InputPositiveInt("Id phải là số nguyên dương");
		System.out.println("Nhập tên group");
		name = ScannerUtils.InputString("Tên group không được để trống hay là khoảng trắng");
		createDate = LocalDate.now();
		LuaChon();
	}
	private int SoLuongAccountOfGroup() {
		int n = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				n ++; 
		}
	}
		return n;
	}

	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + ", createDate="
				+ createDate + ", Số Lượng Account của Group =" + SoLuongAccountOfGroup() + "]";
	}
	
}
