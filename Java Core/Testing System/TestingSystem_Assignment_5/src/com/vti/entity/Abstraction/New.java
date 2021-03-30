package com.vti.entity.Abstraction;

import java.util.Scanner;

public class New implements INews {
	private int id;
	private String title;
	private String publishDate;
	private String author;
	private int[] rates;
	private float averageRate;
	private String content;

	public New() {
		rates = new int[3];
	}

	@Override
	public void Display() {
		System.out.println("Title: " + title);
		System.out.println("PublishDate: " + publishDate);
		System.out.println("Author: " + author);
		System.out.println("Content: " + content);
		if (averageRate != 0) {
			System.out.println("AverageRate: " + averageRate);
		}
		System.out.println("");
	}

	@Override
	public float Calculate() {
		averageRate = (float) (rates[0] + rates[1] + rates[2]) / 3;
		return averageRate;
	}

	public void Input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào title: ");
		title = scanner.nextLine();
		System.out.println("Nhập publishdate: ");
		publishDate = scanner.nextLine();
		System.out.println("Nhập author: ");
		author = scanner.nextLine();
		System.out.println("Nhập content");
		content = scanner.nextLine();
		for (int i = 0; i < 3; i++) {
			System.out.println("Nhập vào đánh giá: " + (i + 1));
			rates[i] = scanner.nextInt();
		}
	}

}
