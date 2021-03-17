package TestingSystem_Assignment_2;

import java.time.LocalDate;
import java.util.Random;

public class Random_Number {

	public static void main(String[] args) {
		
		Random random = new Random();
		// questtion 1
		int a = random.nextInt();
		System.out.println(a);
		// question 2
		float b = random.nextFloat();
		System.out.println(b);
		// question 3
		String[] student = {"Tran Duc Giang", "Hoang Anh", "Hien", "tran abc xyztt"};
		int index = random.nextInt(student.length);
		System.out.println(student[index]);
		// question 4
		int minDate = (int) LocalDate.of(1995, 7, 24).toEpochDay();
		int maxDate = (int) LocalDate.of(1995, 12, 20).toEpochDay();

		long randomLong = minDate + random.nextInt(maxDate - minDate);

		LocalDate randomDate = LocalDate.ofEpochDay(randomLong);
		System.out.println(randomDate);
		// question 5
		int today = (int) LocalDate.now().toEpochDay();
		long randomlong2 = today - random.nextInt(365);
		LocalDate randomDay = LocalDate.ofEpochDay(randomlong2);
		System.out.println(randomDay);
		// question 7
		int i = random.nextInt(999 - 100 + 1) + 100;
		System.out.println(i);
	}
}
