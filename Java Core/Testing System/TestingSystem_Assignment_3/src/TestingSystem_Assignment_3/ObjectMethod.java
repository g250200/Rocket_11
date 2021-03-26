package TestingSystem_Assignment_3;

import java.time.LocalDate;

/**
 * This class is . 
 * 
 * @Description: .
 * @author: TĐGiang
 * @create_date: Mar 22, 2021
 * @version: 1.0
 * @modifer: TĐGiang
 * @modifer_date: Mar 22, 2021
 */
public class ObjectMethod {

	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: TĐGiang
	 * @create_date: Mar 22, 2021
	 * @version: 1.0
	 * @modifer: TĐGiang
	 * @modifer_date: Mar 22, 2021
	 * @param args
	 */
	public static void main(String[] args) {
		Department[] departments = new Department[5];

		Department department1 = new Department();
		department1.Id = 1;
		department1.Name = "Sale";

		Department department2 = new Department();
		department2.Id = 2;
		department2.Name = "Marketing";

		Department department3 = new Department();
		department3.Id = 3;
		department3.Name = "boss of director";

		Department department4 = new Department();
		department4.Id = 4;
		department4.Name = "Waiting room";

		Department department5 = new Department();
		department5.Id = 5;
		department5.Name = "Accounting";
		
		departments[0] = department1;
		departments[1] = department2;
		departments[2] = department3;
		departments[3] = department4;
		departments[4] = department5;
	
		Question7(departments);
	}
	
	public static void Question1(Department[] departments) {
		System.out.println(departments[0]);
	}
	public static void Question2(Department[] departments) {
		for (Department department : departments) {
			System.out.println(department);
		}
	}
	public static void Question3(Department[] departments) {
		System.out.println(departments[0].hashCode());
	}
	public static void Question4(Department[] departments) {
		if (departments[0].Name.equals("Phong A")) {
			System.out.println("là Phòng A");
		}
		System.out.println("Không phải là Phòng A");
	}
	public static boolean Question5(Department[] departments) {
		if (departments[0].equals(departments[1])) {
			return true;
		}
		return false;
	}
	public static void Question6(Department[] departments) {
		for (int i = 0; i < departments.length; i++) {
			for (int j = 0; j < departments.length;j++) {
				if (departments[i].Name.compareToIgnoreCase(departments[j].Name) < 0) {
					Department temp = departments[i];
					departments[i] = departments[j];
					departments[j] = temp;
				}
			}
		}
		Question2(departments);
	}
	public static void Question7(Department[] departments) {
		for (int i = 0; i < departments.length; i++) {
			String reserve = ReserveName(departments[i].Name);
			for (int j = 0; j < departments.length; j++) {
				String reserve2 = ReserveName(departments[j].Name);
				if (reserve.compareToIgnoreCase(reserve2)<0) {
					Department temp = departments[i];
					departments[i] = departments[j];
					departments[j] = temp;
				}
			}
			
		}
		Question2(departments);	
	}
	public static String ReserveName(String s1) {
		String[] words = s1.split("\\s+");
		String result = "";
		for (int i = words.length-1 ; i >=0 ; i--) {
			result += words[i] + " ";
		}
		return result.trim();
	}
	
}
