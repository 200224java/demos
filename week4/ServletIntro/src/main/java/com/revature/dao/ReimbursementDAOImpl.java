package com.revature.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.models.Reimbursement;
import com.revature.util.ConnectionUtil;

public class ReimbursementDAOImpl implements ReimbursementDAO {
	
	private static Logger log = LogManager.getLogger(ReimbursementDAOImpl.class);

	@Override
	public List<Reimbursement> findAll() {
		List<Reimbursement> all = new ArrayList<>();
		
		try(Connection conn = ConnectionUtil.getConnection()) {
			
			Statement s = conn.createStatement();
			
			ResultSet rs = s.executeQuery("SELECT * FROM ERS_REIMBURSEMENT");
			
			while(rs.next()) {
//				all.add(new Reimbursement(
//						rs.getInt(0),
//						rs.getString(1),
//						rs.getString(2),
//						rs.getString(3),
//						rs.getString(4),
//						rs.getString(5),
//						role));
			}
		} catch(SQLException e) {
			log.warn("Failed to find all employees", e);
			return null;
		}
		
		return all;
	}

	@Override
	public Reimbursement findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(Reimbursement r) {
		// TODO Auto-generated method stub
		return false;
	}
}
