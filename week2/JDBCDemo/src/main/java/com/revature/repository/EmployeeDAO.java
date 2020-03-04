package com.revature.repository;

import java.util.List;

import com.revature.models.Employee;

public interface EmployeeDAO {

	public boolean insert(Employee emp);
	
	public List<Employee> findAll();
}
