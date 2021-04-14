package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import com.vti.backend.Procedure;
import com.vti.util.ScannerUtils;

/**
 * This class is . 
 * 
 * @Description: .
 * @author: TĐGiang
 * @create_date: Apr 12, 2021
 * @version: 1.0
 * @modifer: TĐGiang
 * @modifer_date: Apr 12, 2021
 */
public class Program3 {

	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: TĐGiang
	 * @create_date: Apr 12, 2021
	 * @version: 1.0
	 * @modifer: TĐGiang
	 * @modifer_date: Apr 12, 2021
	 * @param args
	 * @throws Exception 
	 * @throws IOException 
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, SQLException, IOException, Exception {
		System.out.println("Nhập vào id cần xóa: ");
		int id = ScannerUtils.inputID();
		
		Procedure procedure = new Procedure();
		procedure.DeleteDeptProcedure(id);

	}

}
