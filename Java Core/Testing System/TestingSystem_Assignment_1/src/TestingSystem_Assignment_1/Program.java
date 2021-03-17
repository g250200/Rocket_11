package TestingSystem_Assignment_1;

import java.time.LocalDate;
import java.util.Date;

public class Program {

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
				
				Group[] groupsOfAccount1 = {group, group2};
				account.groups = groupsOfAccount1;
				
				Group[] groupsOfAccount2 = {group2, group3};
				account2.groups = groupsOfAccount2;
				
				Group[] groupsOfAccount3 = {group, group3};
				account3.groups = groupsOfAccount3;
				
				Account[] accountsOfGroup1 = {account, account3};
				group.accounts = accountsOfGroup1;
				
				Account[] accountsOfGroup2 = {account, account2};
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
		
		// in ra nhân viên 
		System.out.println("Thông tin Nhân Viên");
		System.out.println( "ID: " + account.account_Id);
		System.out.println("User: " + account.user_Name);
		System.out.println("Full Name: " + account.full_Name);
		System.out.println("Email: " + account.email);
		System.out.println("Department: " + account.department.department_Id);
		System.out.println("Position: " + account.position.position_Id);
		System.out.println("Ngày tạo: " + account.create_Account_Date);
		
		// in ra phòng ban
		System.out.println("Thông tin phòng ban");
		System.out.println("ID: " + department.department_Id);
		System.out.println("Name: " + department.department_Name);
		
		// in ra vi tri nhân viên
		System.out.println("Thông tin vị trí");
		System.out.println("ID: " + position.position_Id);
		System.out.println("Name: " + position.position_Name);
		
		// in ra thông tin group
		System.out.println("Thông tin group");
		System.out.println("ID: " + group.group_Id);
		System.out.println("Name: "+ group.group_Name);
		System.out.println("Người tạo: " + group.account.account_Id);
		System.out.println("Ngày tạo: " + group.create_Group_Date);
		
		// in ra user trong group
		System.out.println("Thông tin User trong group");
		System.out.println("ID group: " + group.group_Id);
		System.out.println("ID user: " + account.account_Id);
		
		// in ra thông tin question
		System.out.println("ID: " + question.question_Id);
		System.out.println("content: " + question.content);
		System.out.println("Định danh chủ đề câu hỏi: " + question.categoryQuestion.category_Id);
		System.out.println("Chủ đề câu hỏi: " + question.categoryQuestion.category_Name);
		System.out.println("Đinh danh của loại câu hỏi: " + question.typeQuestion.type_Id);;
		System.out.println("Tên của loại câu hỏi: " + question.typeQuestion.type_Name);
		System.out.println("Người tạo câu hỏi: " + question.account.account_Id);
		System.out.println("Ngày tạo câu hỏi: " + question.create_Question_Date);
		
		// in ra thông tin câu trả lời
		System.out.println("Thông tin câu trả lời");
		System.out.println("ID: " + answer.answer_Id);
		System.out.println("Conten: " + answer.content);
		System.out.println("Định danh câu hỏi: " + answer.question.question_Id);
		System.out.println("Câu trả lời đúng hay sai: " + answer.is_Correct);
		
		// in ra thông tin đề thi
		System.out.println("Thông tin đề thi");
		System.out.println("ID: "+exam.exam_Id);
		System.out.println("code: " + exam.code);
		System.out.println("Title: " + exam.title);
		System.out.println("định danh của chủ đề thi" + exam.categoryQuestion.category_Id);
		System.out.println("thời gian thi: " + exam.duration);
		System.out.println("Người ra đề: " + exam.account.account_Id);
		System.out.println("Ngày ra đề: " + exam.categoryQuestion);
	}
}
