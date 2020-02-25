package com.revature.math;

public class Math {

	public static int add(int x, int y) {
		return x + y;
	}
	
	public static boolean and(boolean x, boolean y) {
		return (x && y);
	}
	
	public static boolean or(boolean x, boolean y) {
		return x || y;
	}
	
	public static boolean xor(boolean x, boolean y) {
		return x ^ y;
	}
	
	public static void main(String...args) {
//		System.out.println(false && test());
		System.out.println(test() || test());
		
		// We would say that && and || are short-circuiting operators
		
		int[] arr = null;
		if(arr != null && arr[0] == 0) {
			System.out.println("Worked!");
		} else {
			System.out.println("Else");
		}
	}
	
	public static boolean test() {
		System.out.println("Test method called!");
		return true;
	}
}
