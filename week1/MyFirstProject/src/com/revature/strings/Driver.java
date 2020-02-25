package com.revature.strings;

public class Driver {
	
	/*
	 * Java has special support for Strings
	 * 
	 * This is generally because Language is so core to how humans think/operate
	 * 
	 * In particular, we can instantiate Strings with String "literals"
	 * Ex: "Larry", "Harry", "whatever you want"
	 * 
	 * Additionally, String literals are stored in a region of the heap known
	 * as the "String Pool"
	 * Note, this only stores String literals, not Strings that were created in
	 * other ways
	 * 
	 * When you run your application, the JVM will have a record of all String literals
	 * (from when it was compiled), and the JVM will instantiate all of them
	 * in the String pool
	 * 
	 * If you were to create Strings using the String class constructor, it would NOT
	 * be in the String pool
	 * 
	 * Additionally, Strings returned from String methods such as concat(), are not in
	 * the String pool
	 * 
	 * However, the + operator for Strings (which performs String concatenation) is different,
	 * and if both inputs were String literals, then the result is also in the String pool
	 * (sort of)
	 */
	
	public static void main(String[] args) {
		String s = "Larry";
		String s2 = "Harry";
		String s3 = new String("Larry");
		String s4 = "Larry" + "Harry";
		String s5 = s + s2;
		String s6 = s.concat(s2);
		String s7 = "Larry" + s2;
		String s8 = "Larry" + "Harry";
		String s9 = "Larry".concat("Harry");
		
		System.out.println(s == s3); // false
		System.out.println(s.equals(s3)); // true
		System.out.println(s4.equals(s5)); // true
		System.out.println(s4 == s5); // false
		System.out.println(s7 == s4); // false
		System.out.println(s8 == s4); // true
		System.out.println(s6 == s9); // false
		System.out.println(s6.equals(s9)); // true
		
		// String methods that return a String ALWAYS return a String outside of the
		// String pool
		
		// Arrays have a length property
		// Strings have a length() method
		// Collections have a size() method
		
		
		StringBuilder sb = new StringBuilder("Hello");
		sb = sb.append(", ");
		sb = sb.append("world!");
		
		System.out.println(sb);
		
		String t = "Hello";
		t = t.concat(", ");
		t = t.concat("world!");
		
		System.out.println(t);
		
		System.out.println(sb.substring(3));
	}
	
	/*
	 * In order to have support for mutable Strings of some kind
	 * Java has the StringBuilder and StringBuffer classes
	 * 
	 * The difference between them is that StringBuffer is thread-safe,
	 * and is therefore a little bit slower
	 * 
	 * In more modern times, it is not recommended to use StringBuffer, as if you need
	 * thread-safety, you should just use StringBuilder and create your own
	 * thread-safety around it
	 */
}
