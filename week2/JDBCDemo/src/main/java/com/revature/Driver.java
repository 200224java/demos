package com.revature;

import com.revature.models.Employee;
import com.revature.services.EmployeeService;

public class Driver {

	public static void main(String[] args) {
		
//		new EmployeeService().insert(new Employee(
//				0, "Larry", "Ellison", "larry.ellison@oracle.com", 150_000_000));
		
		for(Employee e : new EmployeeService().findAll()) {
			System.out.println(e);
		}
	}
}
