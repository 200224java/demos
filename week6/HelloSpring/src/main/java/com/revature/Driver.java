package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.beans.User;
import com.revature.beans.UserService;

public class Driver {
	
	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		//ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
		
		
		User user = (User) ac.getBean("user");
		
		System.out.println(user);
		
		user.setName("CaliforniaMatt");
		user.setId(3);
		
		System.out.println(user);
		
		User user2 = (User) ac.getBean("user");
		
		System.out.println(user2);
		
		UserService us = ac.getBean(UserService.class);
		
		System.out.println(us);
	}

}
