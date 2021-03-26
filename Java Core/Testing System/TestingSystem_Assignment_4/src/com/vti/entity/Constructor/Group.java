package com.vti.entity.Constructor;

import java.time.LocalDate;
import java.util.Arrays;

public class Group {
    int id;
    String name;
    Account creator;
    Account[] accounts;
    LocalDate createGroupDate;
    
	public Group() {

	}
	public Group(int id, String name, Account creator, Account[] accounts, LocalDate createDate) {
		this.id = id;
		this.name = name;
		this.creator = creator;
		this.accounts = accounts;
		this.createGroupDate = createDate;

	}
	public Group(int id, String name, Account creator, String[] usernames, LocalDate createDate) {
		this.id = id;
		this.name = name;
		this.creator = creator;
		accounts = new Account[usernames.length];
		for (int i = 0; i < usernames.length; i++) {
			accounts[i] = new Account();
			accounts[i].userName = usernames[i];
		}
		this.createGroupDate = createDate;

	}
	/* 
	* @see java.lang.Object#toString()
	*/
	@Override
	public String toString() {
		return "Group id = " + id +"\n"+ "Name = " + name +"\n"+ "Creator = " + creator + "Thành viên: \n " + Arrays.toString(accounts)+"\n"
				+ "CreateGroupDate = " + createGroupDate;
	}
	
	
}
