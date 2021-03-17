package TestingSystem_Assignment_2;

import java.time.LocalDate;

public class Exam {
	int exam_Id;
	int code;
	String title;
	CategoryQuestion categoryQuestion;
	int duration;
	Account account;
	LocalDate create_Exam_Date;
	Question[] questions;
}
