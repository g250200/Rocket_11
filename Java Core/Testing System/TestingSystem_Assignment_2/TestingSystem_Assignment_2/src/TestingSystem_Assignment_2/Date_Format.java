package TestingSystem_Assignment_2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;

public class Date_Format {

	public static void main(String[] args) {
		// question 1
		Exam exam = new Exam();
		exam.exam_Id = 1;
		exam.code = 1111;
		exam.title = "Title 1";
		exam.duration = 60;
		exam.create_Exam_Date = LocalDate.of(2021, 1, 1);
		System.out.println("Thong tin exam");
		System.out.println("ID: " + exam.exam_Id);
		System.out.println("code: " + exam.code);
		System.out.println("title: " + exam.title);
		System.out.println("duration: " + exam.duration);
		Locale locale = new Locale("vi", "VN");
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
		ZoneId defaultZoneId = ZoneId.systemDefault();
		Date date = Date.from(exam.create_Exam_Date.atStartOfDay(defaultZoneId).toInstant());
		String createDate1 = dateFormat.format(date);
		System.out.println("Create Date: " + createDate1);
		
		// question 2
		String pattern2 = "YYYY-MM-DD hh:mm:ss";
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(pattern2);
		String create_Date2 = simpleDateFormat2.format(date);
		System.out.println("Create Date: " + create_Date2);
		
		// question 3
		String pattern3 = "YYYY";
		SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(pattern3);
		String create_Date3 = simpleDateFormat3.format(date);
		System.out.println("Create Date: " + create_Date3);
		
		// question 4
		String pattern4 = "YYYY-MM";
		SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat(pattern4);
		String create_Date4 = simpleDateFormat4.format(date);
		System.out.println("Create Date: " + create_Date4);
		
		// question 5
		String pattern5 = "MM-DD";
		SimpleDateFormat simpleDateFormat5 = new SimpleDateFormat(pattern5);
		String create_Date5 = simpleDateFormat5.format(date);
		System.out.println("Create Date: " + create_Date5);
	}

}
