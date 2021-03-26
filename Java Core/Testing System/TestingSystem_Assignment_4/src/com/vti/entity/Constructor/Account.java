package com.vti.entity.Constructor;

import java.time.LocalDate;
import java.util.Arrays;

public class Account {
	int id;
	String email;
	String userName;
	String fullName;
    LocalDate createAccountDate;
    Group[] groups;
    
    
	public Account() {
		
	}
	public Account(int id, String email, String username, String fullname) {
		this.id = id;
		this.email = email;
		this.userName = username;
		this.fullName = fullname;
	}
	/* 
	* @see java.lang.Object#toString()
	*/
	@Override
	public String toString() {
		return "Account: id = " + id + ", email = " + email + ", userName = " + userName + ", fullName = " + fullName
				+ "\n";
	}
	
}
