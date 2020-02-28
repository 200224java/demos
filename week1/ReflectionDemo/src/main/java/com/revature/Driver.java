package com.revature;

import java.lang.reflect.Field;

public class Driver {
	
	/*
	 * Reflections give us the ability to inspect classes and objects at runtime.
	 * This also gives us the ability to modify them as we wish.
	 * 
	 * We can even change the accessibility of private access fields
	 * 
	 * This is one of the advanced java core topics.
	 * 
	 * It has a convenient API, with classes such as:
	 * 	classes
	 * 	interfaces
	 * 	enums
	 * 	fields
	 * 	methods
	 * 	constructors
	 * 	and more...
	 */

	public static void main(String[] args) {
		
		String s = "Strings are ALWAYS immutable, right?";
		
		Class<String> stringClass = String.class;
		
		System.out.println(stringClass);
		
		System.out.println("Original value of string: " + s);
		
		Field stringValue;
		
		try {
			
			stringValue = stringClass.getDeclaredField("value");
			
			System.out.println(stringValue);
			
			stringValue.setAccessible(true);
			
			stringValue.set(s, "HAHAHAHAHAHAHAHAHA!".toCharArray());
			
			System.out.println(s);
		} catch(Exception e) {
			e.printStackTrace();
		}

		
		s = null;
		stringClass = null;
		stringValue = null;
		
		// We suggest to the JVM to perform some garbage collection
		// Note, this is NOT forcing the garbage collector to run, just a suggestion
		System.gc();
		
		
		while("Strings are ALWAYS immutable, right?".equals("HAHAHAHAHAHAHAHAHA!")) {
			System.out.println("Strings are ALWAYS immutable, right?");
		}
		
		System.out.println("All better!");
		System.out.println("Strings are ALWAYS immutable, right?");
	}
}
