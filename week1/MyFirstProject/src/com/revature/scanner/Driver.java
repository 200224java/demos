package com.revature.scanner;

import java.util.Scanner;

public class Driver {

	/*
	 * Java has a class called Scanner that can used to Scan through
	 * many different things, for example, you can scan files,
	 * you can scan the console, or any InputStream
	 * 
	 * It is used to parse inputs for different values, or you can simply
	 * read line by line
	 * 
	 * Helpful note: Only have 1 Scanner per InputStream in your applications
	 * Scanner interacts weirdly if there are multiple Scanners for the same
	 * Input. It also struggles if one of the other Scanners is closed, then it
	 * sort of also closes the rest (for the same InputStream)
	 * 
	 * It appears that the only native way to determine if a Scanner is still open
	 * is by invoking some method and seeing if it throws a IllegalStateException
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter some user input");
//		System.out.println(s.nextLine());
		
		String text = s.nextLine();
		
		String[] words = text.split(" ");
		
		for(String word : words) {
			System.out.println(word);
		}
		
		System.out.println("Please enter an integer.");
//		int val = s.nextInt();
//		
//		System.out.println(val);
		
//		System.out.println(s.nextLine());
		
		int val = 0;
		
		try {
			val = Integer.parseInt(s.nextLine().split(" ")[0]);
			
			System.out.println(val);
		} catch(NumberFormatException e) {
			val = -1;
		}
		
		System.out.println(s.nextLine());
		
		s.close();
	}
}
