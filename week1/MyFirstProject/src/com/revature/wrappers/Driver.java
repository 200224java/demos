package com.revature.wrappers;

public class Driver {
	
	/*
	 * As we talked about before, the 8 primitive values in Java
	 * are NOT objects
	 * 
	 * However, there are some instances, where we do want an object
	 * version of the primitive values
	 * 
	 * As such, Java has created 8 Classes that are object representations
	 * of the 8 primitive types
	 * 
	 * 
	 * int == Integer
	 * double == Double
	 * float == Float
	 * long == Long
	 * short == Short
	 * char == Character
	 * byte == Byte
	 * boolean == Boolean
	 * 
	 * Java has additionally added support for automatically converting
	 * to/from primitives with their wrapper classes
	 * 
	 * This is called autoboxing and auto-unboxing
	 * 
	 * Note, Wrapper classes ARE immutable
	 */

	public static void main(String[] args) {

		Integer x = new Integer(7);
		Integer y = new Integer(3);
		
		System.out.println(add(x, y)); // This works with no issues
		// because the Integer objects are being auto-unboxed into int primitives
		
		System.out.println(mult(3, 7)); // These primitives ints are being
		// autoboxed into Integer objects
		
//		System.out.println(mult(null, null)); // You get a NullPointerException
		// We tried to auto-unbox a Wrapper class that was null
	}
	
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static Integer mult(Integer x, Integer y) {
		return x * y; // These Integer objects are being auto-unboxed into
		// int primitives, multiplied, and then autoboxed back into an Integer object
	}
}
