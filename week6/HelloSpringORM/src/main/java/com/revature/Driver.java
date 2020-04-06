package com.revature;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.models.User;
import com.revature.repositories.IUserDAO;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		IUserDAO dao = ac.getBean(IUserDAO.class);
		
		//dao.save(new User("Larry", "Ellison", new ArrayList<User>()));
		//dao.save(new User("John", "Cena", new ArrayList<User>()));
		
		User u = dao.findById(1);
		User u2 = dao.findById(2);
		
		System.out.println(u + " " + u2);
		
		List<User> l = u.getFriends();
		
		
		l.add(u2);
		
		u.setFriends(l);
		
		dao.update(u);
		
		System.out.println(dao.findAll());
	}
}
