package com.vti.backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import com.vti.util.ScannerUtils;

public class Basic {
	public void connectMySQL() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/Testing_System?autoReconnect=true&useSSL=false";
		String username = "root";
		String password = "root";

		// Register the driver class with DriverManager
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Get a Database Connection
		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println("connect success!");
	}
	
	public void readData() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/Testing_System?autoReconnect=true&useSSL=false";
		String username = "root";
		String password = "root";

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println("connect success!");
		Statement statement = connection.createStatement();
		
		String sql = "SELECT positionID, positionName FROM position";
		
		ResultSet resultSet = statement.executeQuery(sql);
		
		while (resultSet.next()) {
			System.out.println("PositionID: " + resultSet.getInt("positionID"));
			System.out.println("Position Name: " + resultSet.getString("positionName"));
		}
		connection.close();
	} 
	public void createData() throws SQLException, ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/Testing_System?autoReconnect=true&useSSL=false";
		String username = "root";
		String password = "root";

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println("connect success!");
		
		String sql = "INSERT INTO position (positionName) Values ( ? )";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		System.out.println("Nhập vào tên Position");
		String namePosition = ScannerUtils.inputString("Tên không được để trống");
		preparedStatement.setString(1, namePosition);
		
		int result = preparedStatement.executeUpdate();
		
		System.out.println("result excutive: " + result);
		connection.close();
	}
	
	public void updateData() throws SQLException, ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/Testing_System?autoReconnect=true&useSSL=false";
		String username = "root";
		String password = "root";

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println("connect success!");
		
		String sql = "UPDATE position SET positionName = (?) WHERE positionID = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
		System.out.println("Nhập vào tên Position bạn muốn update thành");
		String namePosition = ScannerUtils.inputString("Tên không được để trống");
		preparedStatement.setString(1, namePosition);
		
		System.out.println("Nhập vào ID bạn muốn update");
		int id = ScannerUtils.inputID();
		preparedStatement.setInt(2, id);
		
		int result = preparedStatement.executeUpdate();
		
		if (result == 1) {
			System.out.println("Xử lý thành công");
		}
		else {
			System.out.println("Xử lý không thành công");
		}
		
		connection.close();
	}
	
	public void deleteData() throws SQLException, ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/Testing_System?autoReconnect=true&useSSL=false";
		String username = "root";
		String password = "root";

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println("connect success!");
		
		String sql = "DELETE FROM `Position` WHERE PositionID = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
		System.out.println("Nhập vào ID bạn muốn delete");
		int id = ScannerUtils.inputID();
		preparedStatement.setInt(1, id);
		
		int result = preparedStatement.executeUpdate();
		
		if (result == 1) {
			System.out.println("Xử lý thành công");
		}
		else {
			System.out.println("Xử lý không thành công");
		}
		
		connection.close();
	}
}
