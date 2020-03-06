package com.revature.repository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Account;
import com.revature.models.Employee;
import com.revature.util.ConnectionUtil;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public int insert(Employee emp) {
		
		try(Connection conn = ConnectionUtil.getConnection()) {
			
			String sql = "{ call insert_into_emps(?, ?, ?, ?, ?, ?) }";
			
			CallableStatement stmt = conn.prepareCall(sql);
			stmt.registerOutParameter(1, Types.INTEGER);
			
			stmt.setString(2, emp.getFirstName());
			stmt.setString(3, emp.getLastName());
			stmt.setString(4, emp.getEmail());
			stmt.setDouble(5, emp.getSalary());
			stmt.setString(6, emp.getTitle());
			
			if(stmt.execute()) {
				return (Integer) stmt.getObject(1);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return 0;
	}

	@Override
	public List<Employee> findAll() {
		List<Employee> list = new ArrayList<>();
		
		try (Connection conn = ConnectionUtil.getConnection()) {
			String sql = "SELECT * FROM employees";
			
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt("employee_id");
				String first_name = rs.getString("first_name");
				String last_name = rs.getString("last_name");
				String email = rs.getString("email");
				double salary = rs.getDouble("salary");
				String title = rs.getString("title");
				
				Employee emp = new Employee(id, first_name, last_name, email, salary, title);
				
				List<Account> accounts = new AccountDAOImpl().findByOwner(emp);
				emp.setAccounts(accounts);
				
				list.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public Employee findById(int id) {
		try (Connection conn = ConnectionUtil.getConnection()) {
			String sql = "SELECT * FROM employees WHERE employee_id = ?";
			
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			stmt.setInt(1, id);
			
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				int emp_id = rs.getInt("employee_id");
				String first_name = rs.getString("first_name");
				String last_name = rs.getString("last_name");
				String email = rs.getString("email");
				double salary = rs.getDouble("salary");
				String title = rs.getString("title");
				
				return new Employee(emp_id, first_name, last_name, email, salary, title);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
