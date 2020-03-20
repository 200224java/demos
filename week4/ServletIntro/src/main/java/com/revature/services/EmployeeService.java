package com.revature.services;

import java.util.List;

import com.revature.dao.EmployeeDAO;
import com.revature.dao.EmployeeDAOImpl;
import com.revature.models.Employee;

public class EmployeeService {

	private EmployeeDAO dao;

	public EmployeeService() {
		super();
		dao =  new EmployeeDAOImpl();
	}

	public EmployeeService(EmployeeDAO dao) {
		super();
		this.dao = dao;
	}
	
	public List<Employee> findAll() {
		return dao.findAll();
	}
	
	public Employee findById(int id) {
		return dao.findById(id);
	}
}
