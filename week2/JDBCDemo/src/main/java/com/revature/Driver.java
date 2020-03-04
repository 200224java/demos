package com.revature;

import com.revature.models.Employee;
import com.revature.services.EmployeeService;

public class Driver {

	public static void main(String[] args) {
		
		for(Employee e : new EmployeeService().findAll()) {
			System.out.println(e);
		}
	}
}
