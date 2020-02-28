package com.revature;

public class Driver {

	public static void main(String[] args) {
		SingletonSample s = SingletonSample.getInstance();
		
		s.print();
		
//		SingletonSample.getInstance().print();
//		SingletonSample.getInstance().print();
//		SingletonSample.getInstance().print();
//		SingletonSample.getInstance().print();
//		SingletonSample.getInstance().print();
//		SingletonSample.getInstance().print();
//		SingletonSample.getInstance().print();
		
		System.out.println(College.getCollege().getStudent("math", "Matt", 113));
		System.out.println(College.getCollege().getStudent("something", "Larry", 18));
		
		Student student = College.getCollege().getStudent("math", "Matt", 113);
	}
}
