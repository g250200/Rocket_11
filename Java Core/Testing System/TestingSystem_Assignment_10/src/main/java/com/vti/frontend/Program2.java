/**
 * 
 */
package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.backend.DepartmentDao;
import com.vti.util.ScannerUtils;

/**
 * @author Admin
 *
 */
public class Program2 {
	public static void main(String[] args) throws Exception {
		DepartmentDao departmentDao = new DepartmentDao();
		System.out.println(departmentDao.getDepartments());
		//System.out.println(departmentDao.getDepartmentById());
		//System.out.println("Nhập vào id");
		//int id = ScannerUtils.inputID();
		//System.out.println("Nhập tên");
		//String name = ScannerUtils.inputString("tên không được để trống");
		//departmentDao.createDepartment(name);
		//departmentDao.updateDepartment(id, name);
		//departmentDao.deleteDepartment(id);
	}
}
