package com.revature.models;

import java.io.Serializable;
import java.util.Objects;

/*
 * This is an example of the Java Bean design pattern
 * It is generally used for Java classes that will be mapped to some
 * persistence layer. In modern day, we don't really need the Serializable interface
 * But it has carried over from previous trends
 */
public class Employee implements Serializable {

	private static final long serialVersionUID = 3511001540415559274L;
	
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private double salary;
	
	public Employee() {
		super();
	}

	public Employee(int employeeId, String firstName, String lastName, String email, double salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, employeeId, firstName, lastName, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Employee)) {
			return false;
		}
		Employee other = (Employee) obj;
		return Objects.equals(email, other.email) && employeeId == other.employeeId
				&& Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", salary=" + salary + "]";
	}
}
