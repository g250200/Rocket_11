/**
 * 
 */
package com.vti.backend;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.vti.entity.Department;
import com.vti.util.ScannerUtils;

/**
 * @author Admin
 *
 */
public class DepartmentDao {
	public List<Department> getDepartments() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		
		List<Department> departments = new ArrayList<>();
		
		Properties properties = new Properties();
		properties.load(new FileInputStream("src/main/resources/database.properties"));
		
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		Class.forName(properties.getProperty("driver"));
		
		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println("connect success!");
		
		Statement statement = connection.createStatement();
		String sql = "SELECT departmentID, departmentname FROM department";
		
		ResultSet resultSet = statement.executeQuery(sql);
		
		while (resultSet.next()) {
			Department department = new Department();
			department.setId(resultSet.getInt("departmentID"));
			department.setName(resultSet.getString("departmentname"));
			departments.add(department);
		}
		return departments;
	}
	
	public Department getDepartmentById() throws Exception {
		Properties properties = new Properties();
		properties.load(new FileInputStream("src/main/resources/database.properties"));
		
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		Class.forName(properties.getProperty("driver"));
		
		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println("connect success!");
		
		String sql = "SELECT * FROM department WHERE departmentId = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		System.out.println("Nhập ID department bạn muốn tìm kiếm");
		int id = ScannerUtils.inputID();
		preparedStatement.setInt(1, id);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if (resultSet.next()) {
			Department department = new Department();
			department.setId(resultSet.getInt("departmentID"));
			department.setName(resultSet.getString("departmentname"));
			return department;
		}
		else {
			throw new Exception("cannotFindDepartmentById" + id);
		}
		
	}
	public boolean isDepartmentNameExists(String name) throws SQLException, FileNotFoundException, IOException, ClassNotFoundException {
		Properties properties = new Properties();
		properties.load(new FileInputStream("src/main/resources/database.properties"));
		
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		Class.forName(properties.getProperty("driver"));
		
		Connection connection = DriverManager.getConnection(url, username, password);
		
		String sql = "SELECT * FROM department WHERE departmentname = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
	
		preparedStatement.setString(1, name);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if (resultSet.next()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isDepartmentIDExists(int id) throws SQLException, FileNotFoundException, IOException, ClassNotFoundException {
		Properties properties = new Properties();
		properties.load(new FileInputStream("src/main/resources/database.properties"));
		
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		Class.forName(properties.getProperty("driver"));
		
		Connection connection = DriverManager.getConnection(url, username, password);
		
		String sql = "SELECT * FROM department WHERE departmentID = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
	
		preparedStatement.setInt(1, id);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if (resultSet.next()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void createDepartment(String name) throws Exception {
		if (isDepartmentNameExists(name)) {
			throw new Exception("Department Name IS Exists");
		}
		Properties properties = new Properties();
		properties.load(new FileInputStream("src/main/resources/database.properties"));
		
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		Class.forName(properties.getProperty("driver"));
		
		Connection connection = DriverManager.getConnection(url, username, password);
		
		String sql = "INSERT INTO department(departmentname)	VALUE (   ?	)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
	
		preparedStatement.setString(1, name);
		preparedStatement.executeUpdate();
		System.out.println("Create Success");
	}
	public void updateDepartment(int id,String name) throws Exception {
		if (!isDepartmentIDExists(id)) {
			throw new Exception("Department ID is NOT Exists");
		}
		if (isDepartmentNameExists(name)) {
			throw new Exception("Department Name IS Exists");
		}
		Properties properties = new Properties();
		properties.load(new FileInputStream("src/main/resources/database.properties"));
		
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		Class.forName(properties.getProperty("driver"));
		
		Connection connection = DriverManager.getConnection(url, username, password);
		
		String sql = "UPDATE Department SET departmentname = ? WHERE departmentId = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
	
		preparedStatement.setString(1, name);
		preparedStatement.setInt(2, id);
		preparedStatement.executeUpdate();
		System.out.println("Update Success");
	}
	
	public void deleteDepartment(int id) throws Exception {
		if (!isDepartmentIDExists(id)) {
			throw new Exception("Department ID is NOT Exists");
		}
		Properties properties = new Properties();
		properties.load(new FileInputStream("src/main/resources/database.properties"));
		
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		Class.forName(properties.getProperty("driver"));
		
		Connection connection = DriverManager.getConnection(url, username, password);
		
		String sql = "DELETE FROM Department WHERE departmentId = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		preparedStatement.executeUpdate();
		System.out.println("Delete Success");
	}
}
