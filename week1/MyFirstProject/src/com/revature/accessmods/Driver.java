package com.revature.accessmods;

public class Driver {
	
	/*
	 * Access modifiers can be provided to methods and instance/static variables
	 * 
	 * In Java there are 4 access modifiers:
	 * 		public
	 * 		private
	 * 		protected
	 * 		default
	 * 
	 * public access:
	 * 		Provides access from anywhere
	 * 
	 * private access:
	 * 		Can only be accessed within the same class
	 * 
	 * protected access:
	 * 		Can be accessed within the same package and subclasses
	 * 
	 * default access:
	 * 		Can only be accessed within the same package
	 * 		(Commonly referred to as package-private)
	 */

	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.name);
		s.name = "Larry";
		System.out.println(s.name);
		System.out.println(s.major);
		System.out.println(s.studentId);
		
		System.out.println(s.getAge());
	}
}
