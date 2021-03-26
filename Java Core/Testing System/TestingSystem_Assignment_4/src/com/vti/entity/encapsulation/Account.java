package com.vti.entity.encapsulation;

public class Account {
	private String id;
	private String name;
	private int balence;
	public Account(String id, String name , int balence) {
		this.id = id;
		this.name = name;
		this.balence = balence;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getBalence() {
		return balence;
	}
	public int credit(int amount) {
		return amount;
	}

	public int debit(int amount) {
		return amount;
	}

	public void tranferTo(Account account, int amount) {
		System.out.println("Tranfer " + account + " to " + account.getName());
	}

}
