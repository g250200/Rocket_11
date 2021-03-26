package com.vti.backend;

import java.time.LocalDate;

import com.vti.entity.Constructor.Account;
import com.vti.entity.Constructor.Group;

/**
 * This class is . 
 * 
 * @Description: .
 * @author: TĐGiang
 * @create_date: Mar 25, 2021
 * @version: 1.0
 * @modifer: TĐGiang
 * @modifer_date: Mar 25, 2021
 */
public class Contructor {
	public void Question3() {
		Group group = new Group();
		System.out.println(group);
		System.out.println("");

		Account creator = new Account(1,"g1@gmail.com","user1","TĐG1" );
		Account account2 = new Account(2, "g2@gmail.com","user2","TĐG2");
		Account account3 = new Account(3, "g3@gmail.com","user3","TĐG3");
		Account[] accounts = { creator, account2, account3 };
		Group group1 = new Group(1, "Sale", creator, accounts, LocalDate.now());
		System.out.println(group1);
		System.out.println("");

		String[] usernames = { "user1", "user2", "user3" };
		Group group2 = new Group(2, "Dev", creator, usernames, LocalDate.now());
		System.out.println(group2);
		System.out.println("");

	}
}
