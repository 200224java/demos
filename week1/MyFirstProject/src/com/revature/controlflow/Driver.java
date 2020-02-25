package com.revature.controlflow;

import java.util.ArrayList;
import java.util.List;

public class Driver {
	
	/*
	 * There are many structures that can be used to modify the flow
	 * of an application.
	 * The application will always start at the main method
	 * and will execute in sequence statement by statement
	 * 
	 * Control flow structures allow us to change the flow of this sequence
	 * 
	 * if
	 * if-else (which can be chained with more if-elses)
	 * while loops
	 * for loops
	 * do-while loops
	 * switch statements
	 * enhanced for-loops
	 */

	public static void main(String[] args) {
		
		int var = 0;
		
		// You can switch switch on int, char, short, and byte, as well as their
		// wrapper classes, Enums, and Strings ONLY
		switch(var) {
		case 300:
			System.out.println("Three hundred");
			break;
		case 200:
			System.out.println("Two hundred");
//			break;
			// The switch statement "falls through" to the next case
		case 100:
			System.out.println("One hundred");
			break;
		default:
			System.out.println("Something else");
			break;
		}
		
		String s = "Larry"; // Ex: memory address 5
		s = s + "K"; // Ex: memory address 6
		// Now the object at memory address 5 is eligible for garbage collection
		String t = new String("Larry");
		
		// The enhanced for-loop can be used to iterate over any array or collection
		for(char c : s.toCharArray()) {
			System.out.println(c);
		}
		
		List<String> l = new ArrayList<>();
		l.add("Text");
		for(String k : l) {
//			l.remove(k);
			// This does not work
		}
		
		// You cannot modify the size of the collection in an enhanced for-loop
		// You would get a ConcurrentModificationException
	}
}
