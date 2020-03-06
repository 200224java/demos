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

public class AccountDAOImpl implements AccountDAO {

	@Override
	public int insert(Account a) {
		
		try(Connection conn = ConnectionUtil.getConnection()) {
			
			String sql = "{ call insert_into_accounts(?, ?) }";
			
			CallableStatement stmt = conn.prepareCall(sql);
			stmt.registerOutParameter(1, Types.INTEGER);
			
			stmt.setInt(2, a.getOwner().getEmployeeId());
			
			if(stmt.execute()) {
				return (Integer) stmt.getObject(1);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return 0;
	}

	@Override
	public boolean transfer(Account source, Account target, double amount) {
		
		try(Connection conn = ConnectionUtil.getConnection()) {
			
			String sql = "{ call transfer_funds(?, ?, ?) }";
			
			CallableStatement stmt = conn.prepareCall(sql);
			
			stmt.setInt(1, source.getOwner().getEmployeeId());
			stmt.setInt(2, target.getOwner().getEmployeeId());
			stmt.setDouble(3, amount);
			
			return stmt.execute();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public List<Account> findAll() {
		List<Account> list = new ArrayList<>();
		
		try (Connection conn = ConnectionUtil.getConnection()) {
			String sql = "SELECT * FROM account";
			
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt("id");
				double balance = rs.getDouble("balance");
				int owner_id = rs.getInt("owner");
				
				Employee owner = new EmployeeDAOImpl().findById(owner_id);
				
				Account a = new Account(id, balance, owner);
				list.add(a);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public List<Account> findByOwner(Employee emp) {
		List<Account> list = new ArrayList<>();

		try (Connection conn = ConnectionUtil.getConnection()) {
			String sql = "SELECT * FROM account WHERE owner = ?";
			
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			stmt.setInt(1, emp.getEmployeeId());
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				double balance = rs.getDouble("balance");
				
				Employee owner = emp;
				
				Account a = new Account(id, balance, owner);
				list.add(a);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
}
