package TestingSystem_Assignment_3;

import java.time.LocalDate;

public class Account {
	int account_Id;
	String email;
	String user_Name;
	String full_Name;
    LocalDate create_Account_Date;
	/* 
	* @see java.lang.Object#toString()
	*/
	@Override
	public String toString() {
		return "Account [account_Id = " + account_Id + ", email = " + email + ", user_Name = " + user_Name + ", full_Name = "
				+ full_Name + ", create_Account_Date = " + create_Account_Date + "]";
	}
    
    
}
