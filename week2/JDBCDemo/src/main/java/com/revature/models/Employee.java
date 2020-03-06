package com.revature.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
	private String title;
	
	private List<Account> accounts;
	
	public Employee() {
		super();
	}
	
	public Employee(int employeeId, String firstName, String lastName, String email, double salary, String title) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.salary = salary;
		this.title = title;
		this.accounts = new ArrayList<>();
	}

	public Employee(int employeeId, String firstName, String lastName, String email, double salary, String title,
			List<Account> accounts) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.salary = salary;
		this.title = title;
		this.accounts = accounts;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
	public boolean addAccount(Account a) {
		if(!accounts.contains(a)) {
			return accounts.add(a);
		}
		
		return false;
	}
	
	public boolean removeAccount(Account a) {
		if(accounts.contains(a)) {
			return accounts.remove(a);
		}
		
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(accounts, email, employeeId, firstName, lastName, salary, title);
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
		return Objects.equals(accounts, other.accounts) && Objects.equals(email, other.email)
				&& employeeId == other.employeeId && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary)
				&& Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", salary=" + salary + ", title=" + title + ", accounts=" + accounts + "]";
	}
}
