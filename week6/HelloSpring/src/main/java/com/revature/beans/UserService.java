package com.revature.beans;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	private UserDAO dao;

	public UserService() {
		super();
	}

	public UserService(UserDAO dao) {
		super();
		this.dao = dao;
	}

	public UserDAO getDao() {
		return dao;
	}
	@Autowired
	public void setDao(UserDAO dao) {
		this.dao = dao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof UserService)) {
			return false;
		}
		UserService other = (UserService) obj;
		return Objects.equals(dao, other.dao);
	}

	@Override
	public String toString() {
		return "UserService [dao=" + dao + "]";
	}
	
	

}
