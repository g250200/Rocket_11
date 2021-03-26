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
		return balence + amount;
	}

	public int debit(int amount) {
		return balence - amount;
	}

	public void transferTo(Account account, int amount) {
		debit(amount);
		account.credit(amount);
	}

}
