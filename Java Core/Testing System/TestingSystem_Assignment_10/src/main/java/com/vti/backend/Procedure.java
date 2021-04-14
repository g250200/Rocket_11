package com.vti.backend;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

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
public class Procedure {
	public void DeleteDeptProcedure(int id) throws FileNotFoundException, ClassNotFoundException, SQLException, IOException, Exception {
		DepartmentDao dao = new DepartmentDao();
		if (!dao.isDepartmentIDExists(id)) {
			throw new Exception("Department ID is NOT Exists");
		}
		Properties properties = new Properties();
		properties.load(new FileInputStream("src/main/resources/database.properties"));
		
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		Class.forName(properties.getProperty("driver"));
		
		Connection connection = DriverManager.getConnection(url, username, password);
		
		String sql = "CALL delete_dept( ? )";
		CallableStatement callableStatement = connection.prepareCall(sql);
		callableStatement.setInt(1, id);
		callableStatement.executeUpdate();
		System.out.println("Delete success");
	}
}
