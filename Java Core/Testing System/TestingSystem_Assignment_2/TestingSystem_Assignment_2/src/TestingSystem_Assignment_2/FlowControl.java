package TestingSystem_Assignment_2;

import java.time.LocalDate;
import java.util.Iterator;

public class FlowControl {

	public static void main(String[] args) {
		// Create departments
		Department department = new Department();
		department.department_Id = 1;
		department.department_Name = "Sale";

		Department department2 = new Department();
		department2.department_Id = 2;
		department2.department_Name = "Marketing";

		Department department3 = new Department();
		department3.department_Id = 3;
		department3.department_Name = "Technician";

		// Create positions
		Position position = new Position();
		position.position_Id = 1;
		position.position_Name = "DEV";

		Position position2 = new Position();
		position2.position_Id = 2;
		position2.position_Name = "Test";

		Position position3 = new Position();
		position3.position_Id = 3;
		position3.position_Name = "Tech Lead";
		
		// create account
		Account account = new Account();
		account.account_Id = 1;
		account.email = "nguyenvana@gmail.com";
		account.user_Name = "nguyenvana";
		account.full_Name = "Nguyen Van A";
		account.department = department;
		account.position = position;
		account.create_Account_Date = LocalDate.of(2021, 1, 1);

		Account account2 = new Account();
		account2.account_Id = 2;
		account2.email = "lethib@gmail.com";
		account2.user_Name = "lethib";
		account2.full_Name = "Le Thi B";
		account2.department = department2;
		account2.position = position2;
		account2.create_Account_Date = LocalDate.of(2020, 2, 2);

		Account account3 = new Account();
		account3.account_Id = 3;
		account3.email = "tranvanc@gmail.com";
		account3.user_Name = "tranvanc";
		account3.full_Name = "Tran Van C";
		account3.department = department3;
		account3.position = position3;
		account3.create_Account_Date = LocalDate.of(2020, 3, 3);

		// Create groups
		Group group = new Group();
		group.group_Id = 1;
		group.group_Name = "Group A";
		group.account = account;
		group.create_Group_Date = LocalDate.of(2021, 1, 1);
		
		Group group2 = new Group();
		group2.group_Id = 2;
		group2.group_Name = "Group B";
		group2.account = account2;
		group2.create_Group_Date = LocalDate.of(2020, 2, 2);
		
		Group group3 = new Group();
		group3.group_Id = 3;
		group3.group_Name = "Group C";
		group3.account = account3;
		group3.create_Group_Date = LocalDate.of(2020, 3, 3);
		
		
		Group[] groupsOfAccount1 = {group, group2, group3};
		account.groups = groupsOfAccount1;
		
		Group[] groupsOfAccount2 = {group2, group3};
		account2.groups = groupsOfAccount2;
		
		Group[] groupsOfAccount3 = {group3};
		account3.groups = groupsOfAccount3;
		
		Account[] accountsOfGroup1 = {account};
		group.accounts = accountsOfGroup1;
		
		Account[] accountsOfGroup2 = {account, account2, account3};
		group2.accounts = accountsOfGroup2;
		
		Account[] accountsOfGroup3 = {account2, account3};
		group3.accounts = accountsOfGroup3;
		
		// Create types of question
		TypeQuestion type= new TypeQuestion();
		type.type_Id = 1;
		type.type_Name ="ESSAY";
		
		TypeQuestion type2= new TypeQuestion();
		type2.type_Id = 2;
		type2.type_Name = "MULTIPLE_CHOICE";
		
		// Create categories of question
		CategoryQuestion category = new CategoryQuestion();
		category.category_Id = 1;
		category.category_Name = "Java";
		
		CategoryQuestion category2 = new CategoryQuestion();
		category2.category_Id = 2;
		category2.category_Name = ".NET";
		
		CategoryQuestion category3 = new CategoryQuestion();
		category3.category_Id = 3;
		category3.category_Name = "SQL";
		
		// Create questions
		Question question = new Question();
		question.question_Id = 1;
		question.content = "Question 1";
		question.categoryQuestion = category;
		question.typeQuestion = type;
		question.account = account;
		question.create_Question_Date = LocalDate.of(2021, 1, 1);
		
		Question question2 = new Question();
		question2.question_Id = 2;
		question2.content = "Question 2";
		question2.categoryQuestion = category2;
		question2.typeQuestion = type2;
		question2.account = account2;
		question2.create_Question_Date = LocalDate.of(2020, 2, 2);
	
		Question question3 = new Question();
		question3.question_Id = 3;
		question3.content = "Question 3";
		question3.categoryQuestion = category3;
		question3.typeQuestion = type;
		question3.account = account3;
		question3.create_Question_Date = LocalDate.of(2020, 3, 3);
		
		// Create answers
		Answer answer = new Answer();
		answer.answer_Id= 1;
		answer.content = "Answer 1";
		answer.question = question;
		answer.is_Correct = true;
		
		Answer answer2 = new Answer();
		answer2.answer_Id = 2;
		answer2.content = "Answer 2";
		answer2.question = question2;
		answer2.is_Correct = false;
		
		Answer answer3 = new Answer();
		answer3.answer_Id = 3;
		answer3.content = "Answer 3";
		answer3.question = question3;
		answer3.is_Correct = true;
		
		// Create exams
		Exam exam = new Exam();
		exam.exam_Id = 1;
		exam.code = 1111;
		exam.title = "Title 1";
		exam.categoryQuestion = category;
		exam.duration = 60;
		exam.account = account;
		exam.create_Exam_Date = LocalDate.of(2021, 1, 1);
		
		Exam exam2 = new Exam();
		exam2.exam_Id = 2;
		exam2.code = 2222;
		exam2.title = "Title 2";
		exam2.categoryQuestion = category2;
		exam2.duration = 90;
		exam2.account = account2;
		exam2.create_Exam_Date = LocalDate.of(2020, 2, 2);
		
		Exam exam3 = new Exam();
		exam3.exam_Id = 3;
		exam3.code = 333;
		exam3.title = "Title 3";
		exam3.categoryQuestion = category3;
		exam3.duration = 180;
		exam3.account = account3;
		exam3.create_Exam_Date = LocalDate.of(2020, 3, 3);
		
		Exam[] examsOfQuestion1 = {exam, exam2};
		question.exams = examsOfQuestion1;
		
		Exam[] examsOfQuestion2 = {exam2, exam3};
		question2.exams = examsOfQuestion2;
		
		Exam[] examsOfQuestion3 = {exam, exam3};
		question3.exams = examsOfQuestion3;
		
		Question[] questionsOfExam1 = {question, question3};
		exam.questions = questionsOfExam1;
		
		Question[] questionsOfExam2 = {question, question2};
		exam2.questions = questionsOfExam2;
		
		Question[] questionsOfExam3 = {question2, question3};
		exam3.questions = questionsOfExam3;
		Account[] arr_Account = {account,account2,account3};
		Department[] arr_Department = {department, department2, department3};
		
		}
	// question1
	public static void Check_Department_Of_Account(Account ac) {
		if(ac.department == null) {
			System.out.println("Nhân viên này chưa có phòng ban");}
		else {
			System.out.println("Phòng ban của nhân viên này là  : " + ac.department.department_Name);}
		}

	// question2
	public static void Check_Group_Of_Account(Account ac) {
		if(ac.groups.length == 0) {
			System.out.println("Nhân viên này chưa có group");
		}
		else if(ac.groups.length == 1 || ac.groups.length == 2) {
			System.out.println("Group của nhân viên này là : ");
			for (Group group : ac.groups) {
				System.out.println(group.group_Name);}
	        }
		else if(ac.groups.length == 3) {
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
		}
		else {
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
		}
        }
	// question 3
	public static void Check_Group_Of_Account_ternary (Account ac) {
		System.out.println(ac.department==null ? "Nhân viên này chưa có phòng ban" : "Phòng ban của nhân viên này là : " + ac.department.department_Name);
	}
	// question 4 
	public static void Check_Position_of_Acount(Account ac) {
		System.out.println(ac.position.position_Name.equals("DEV") ? "Đây là Developer" : "không phải developer");
	}
	// question 5 
	public static void Count_Account_In_Group(Group group) {
		switch (group.accounts.length) {
		case 1:
			System.out.println("Nhóm có 1 thành viên");
			break;
		case 2:
			System.out.println("Nhóm có 2 thành viên");
			break;
		case 3:
			System.out.println("Nhóm có 3 thành viên");
			break;
		default:
			System.out.println("Nhóm có nhiều thành viên");
			break;
		}
	}
	// question 6
	public static void Check_Group_Of_Account_Switch(Account ac) {
		switch (ac.groups.length) {
		case 0:
			System.out.println("Nhân viên này chưa có group");
			break;
		case 1:
		case 2:
			System.out.println("Group của nhân viên này là : ");
			for (Group group : ac.groups) {
				System.out.println(group.group_Name);}
			break;
		case 3:
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
			break;
		default:
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
			break;
		}
	}
	// question 7
	public static void Check_Position_of_Acount_Switch(Account ac) {
		switch (ac.position.position_Name) {
		case "DEV":
			System.out.println("Đây là developer");
			break;

		default:
			System.out.println("không phải là developer");
			break;
		}
	}
	// question 8 
	public static void Print_Account(Account[] arr_Account ){
		System.out.println("Thông tin account");
		System.out.println("");
		for(Account account : arr_Account) {
			System.out.println("Full name: " + account.full_Name);
			System.out.println("email: " + account.email);
			System.out.println("Department: " + account.department.department_Name);
			System.out.println("");
		}
	}
	// question 9
	public static void Print_Department(Department[] arr_Deapartment) {
		System.out.println("Thông tin Department");
		System.out.println("");
		for(Department department : arr_Deapartment) {
			System.out.println("ID: " + department.department_Id);
			System.out.println("Name: " + department.department_Name);
		}
	}
	// question 10
	public static void Print_Account_for(Account[] arr_ac) {
		for(int i = 0 ; i<arr_ac.length; i++) {
			System.out.println("Thông tin account thứ: " + (i+1));
			System.out.println("Email: " + arr_ac[i].email);
			System.out.println("Full name: " + arr_ac[i].full_Name);
			System.out.println("Department: " + arr_ac[i].department.department_Name);
			System.out.println("");
		}
	}
	// question 11
	public static void Print_department_for(Department[] arr_Departments) {
		for(int i = 0 ; i<arr_Departments.length; i++) {
			System.out.println("Thông tin department thứ: " + (i+1));
			System.out.println("Id: " + arr_Departments[i].department_Id);
			System.out.println("Name: " + arr_Departments[i].department_Name);
		}
	}
	// question 12
	public static void Print_2_Department(Department[] arr_Department) {
		for(int i = 0 ; i<arr_Department.length; i++) {
			if (i==2) {
				break;
			}
			System.out.println("Thông tin department thứ: " + (i+1));
			System.out.println("Id: " + arr_Department[i].department_Id);
			System.out.println("Name: " + arr_Department[i].department_Name);
			System.out.println("");
		}
	}
	// question 13
	public static void Print_A(Account[] arr_ac) {
		for(int i = 0 ; i<arr_ac.length; i++) {
			if (i==1) {
				continue;
			}
			System.out.println("Thông tin account thứ: " + (i+1));
			System.out.println("Email: " + arr_ac[i].email);
			System.out.println("Full name: " + arr_ac[i].full_Name);
			System.out.println("Department: " + arr_ac[i].department.department_Name);
			System.out.println("");
		}
	}
	// question 14
	public static void Print_A_id(Account[] arr_ac) {
		for(int i = 0 ; i<arr_ac.length; i++) {
			if (arr_ac[i].account_Id < 4) {
			
			System.out.println("Thông tin account thứ: " + (i+1));
			System.out.println("Email: " + arr_ac[i].email);
			System.out.println("Full name: " + arr_ac[i].full_Name);
			System.out.println("Department: " + arr_ac[i].department.department_Name);
			System.out.println("");
			}
		}
	}
	// question 15 
	public static void In_So_chan() {
		for (int i = 0; i < 20; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
	}
	// question16
	public static void Print_Account_While(Account[] arr_ac) {
		int i = 0;
		while (i<arr_ac.length) {
			System.out.println("Thông tin account thứ: " + (i+1));
			System.out.println("Email: " + arr_ac[i].email);
			System.out.println("Full name: " + arr_ac[i].full_Name);
			System.out.println("Department: " + arr_ac[i].department.department_Name);
			System.out.println("");
			i++;
		}
	}
	
	public static void Print_Department_while(Department[] arr_Department) {
		int i= 0;
		while (i<arr_Department.length) {
			System.out.println("Thông tin department thứ: " + (i+1));
			System.out.println("Id: " + arr_Department[i].department_Id);
			System.out.println("Name: " + arr_Department[i].department_Name);
			i++;
		}
	}
	
	public static void Print_2_Department_while(Department[] arr_Department) {
		int i =0;
		while( i<arr_Department.length) {
			if (i==2) {
				break;
			}
			System.out.println("Thông tin department thứ: " + (i+1));
			System.out.println("Id: " + arr_Department[i].department_Id);
			System.out.println("Name: " + arr_Department[i].department_Name);
			System.out.println("");
			i++;
		}
	}
	
	public static void Print_A_while(Account[] arr_ac) {
		int i=0;
		while( i<arr_ac.length) {
			if (i==1) {
				continue;
			}
			System.out.println("Thông tin account thứ: " + (i+1));
			System.out.println("Email: " + arr_ac[i].email);
			System.out.println("Full name: " + arr_ac[i].full_Name);
			System.out.println("Department: " + arr_ac[i].department.department_Name);
			System.out.println("");
			i++;
		}
	}
	
	public static void Print_A_id_while(Account[] arr_ac) {
		int i= 0;
		while(i<arr_ac.length) {
			if (arr_ac[i].account_Id < 4) {
			
			System.out.println("Thông tin account thứ: " + (i+1));
			System.out.println("Email: " + arr_ac[i].email);
			System.out.println("Full name: " + arr_ac[i].full_Name);
			System.out.println("Department: " + arr_ac[i].department.department_Name);
			System.out.println("");
			i++;
			}
		}
	}
	
	public static void In_So_chan_while() {
		int i=0;
		while ( i < 20) {
			if (i%2==0) {
				System.out.println(i);
			}
			i++;
		}
	}
	
	// question 17
	public static void Print_Account_do_while(Account[] arr_ac) {
		int i = 0;
		do{
			System.out.println("Thông tin account thứ: " + (i+1));
			System.out.println("Email: " + arr_ac[i].email);
			System.out.println("Full name: " + arr_ac[i].full_Name);
			System.out.println("Department: " + arr_ac[i].department.department_Name);
			System.out.println("");
			i++;
		}
		while(i<arr_ac.length);
	}
	
	public static void Print_department_do_while(Department[] arr_Departments) {
		int i=0;
		do {
		System.out.println("Thông tin department thứ: " + (i+1));
		System.out.println("Id: " + arr_Departments[i].department_Id);
		System.out.println("Name: " + arr_Departments[i].department_Name);
		} while (i<arr_Departments.length);
		i++;
	}
	
	public static void Print_A_do_while(Account[] arr_ac) {
		int i =0;
		do {
			if (i==1) {
				continue;
			}
			System.out.println("Thông tin account thứ: " + (i+1));
			System.out.println("Email: " + arr_ac[i].email);
			System.out.println("Full name: " + arr_ac[i].full_Name);
			System.out.println("Department: " + arr_ac[i].department.department_Name);
			System.out.println("");
			i++;
		}
		while(i<arr_ac.length);
	}
	}
