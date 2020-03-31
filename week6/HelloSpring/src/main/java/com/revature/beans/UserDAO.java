package com.revature.beans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
	
	public List<User> findAll() {
		List<User> list = new ArrayList<>();
		
		list.add(new User(1, "BobRoss", new Account(1000000)));
		list.add(new User(2, "JohnCena", new Account(350)));
		
		return list;
	}

	@Override
	public String toString() {
		return "UserDAO [findAll()=" + findAll() + "]";
	}
	
	

}
