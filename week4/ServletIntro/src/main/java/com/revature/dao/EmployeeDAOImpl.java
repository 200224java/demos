package com.revature.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.models.Employee;
import com.revature.models.Role;
import com.revature.util.ConnectionUtil;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	private static Logger log = LogManager.getLogger(EmployeeDAOImpl.class);

	@Override
	public List<Employee> findAll() {
		List<Employee> all = new ArrayList<>();
		
		try(Connection conn = ConnectionUtil.getConnection()) {
			
			Statement s = conn.createStatement();
			
			ResultSet rs = s.executeQuery("SELECT * FROM ERS_USERS");
			
			while(rs.next()) {
				int role_id = rs.getInt(7);
				Role role;
				switch(role_id) {
				case 1:
					role = Role.Employee;
					break;
				case 2:
					role = Role.FinanceManager;
					break;
				default:
					role = Role.Employee;
					break;
				}
				all.add(new Employee(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getString(6),
						role));
			}
		} catch(SQLException e) {
			log.warn("Failed to find all employees", e);
			return null;
		}
		
		System.out.println(all);
		return all;
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(Employee e) {
		// TODO Auto-generated method stub
		return false;
	}

}
