package TestingSystem_Assignment_3;

import java.time.LocalDate;

public class Default_Value {

	public static void main(String[] args) {
		Account[] accounts = new Account[5];
		for(int i = 0; i < 5; i++)
		{
			Account account = new Account();
			account.email = "Email" + (i+1);
			account.user_Name = "User" + (i+1);
			account.full_Name = "Fullname" + (i+1);
			account.create_Account_Date = LocalDate.now();
			accounts[i] = account;
		}
		for (Account account : accounts) {
			System.out.println("Thong tin account");
			System.out.println(account.email);
			System.out.println(account.user_Name);
			System.out.println(account.full_Name);
			System.out.println(account.create_Account_Date);
			System.out.println("");
		}
	}

}
