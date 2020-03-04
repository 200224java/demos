package com.revature.services;

import java.util.List;

import com.revature.models.Employee;
import com.revature.repository.EmployeeDAO;
import com.revature.repository.EmployeeDAOImpl;

public class EmployeeService {

	EmployeeDAO repository = null;

	public EmployeeService() {
		super();
		this.repository = new EmployeeDAOImpl();
	}

	public EmployeeService(EmployeeDAO repository) {
		super();
		this.repository = repository;
	}
	
	public List<Employee> findAll() {
		return repository.findAll();
	}
	
	// Methods like below should unit tested
	// While methods such as above, do not
	public boolean login(Employee e) {
		// do stuff here
		return false;
	}
}
