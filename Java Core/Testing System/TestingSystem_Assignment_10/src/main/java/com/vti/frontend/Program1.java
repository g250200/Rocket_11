package com.vti.frontend;

import java.sql.SQLException;

import com.vti.backend.Basic;

public class Program1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Basic basic = new Basic();
		basic.readData();
//		basic.createData();
//		basic.updateData();
//		basic.deleteData();
	}

}
