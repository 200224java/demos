package com.revature.scopes;

public class Driver {
	
	/*
	 * There are 4 variable scopes in Java
	 * 
	 * 	Instance -> Fields/Methods that belong to object itself (the instance)
	 * 	Static/Global -> Fields/Methods that belong to the class itself (the blueprint)
	 * 	Method -> Outermost scope of the inside of a method
	 * 	Block -> Further nested scopes inside a method
	 */
	
	public int x; // Instance scope
	public static int y; // Static/Global scope
	public static String s;

	public static void main(String[] args) {
		y = 7;
		System.out.println(y);
//		x = 3; // This does not compile since x is not visible within the static scope
		
		Driver d = new Driver();
		System.out.println(d.x); // Now, x is visible within the Driver object
//		System.out.println(d.s); // This works, but is bad practice
		System.out.println(s);
	}
}
