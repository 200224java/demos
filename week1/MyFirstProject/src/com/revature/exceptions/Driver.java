package com.revature.exceptions;

public class Driver {

	public static void main(String[] args) {
		/*
		 * try { Duck d = new Duck(-3); } catch(RuntimeException e) {
		 * e.printStackTrace(); }
		 * 
		 * System.out.println("The program did not crash");
		 * 
		 * Duck d = new Duck(7);
		 * 
		 * System.out.println(d.getNumOfEggs());
		 * 
		 * d.setNumOfEggs(-10);
		 * 
		 * System.out.println(d.getNumOfEggs());
		 */
		
		methodOne();
		
		System.out.println("methodOne invoked!");
		
		try {
			methodTwo();
		} catch (Exception e) {
//			e.printStackTrace();
		}
		
		System.out.println("methodTwo invoked!");
		
		System.out.println(methodThree());
	}

	public static void methodOne() throws NegativeEggsException {
//		throw new RuntimeException();
	}
	
	public static void methodTwo() throws Exception {
		throw new Exception();
	}
	
	public static int methodThree() {
		try {
			methodTwo();
			return 0;
		} catch(Exception e) {
//			System.exit(0);
			return 1;
		} finally {
			System.out.println("Finally!");
//			return 2;
		}
	}
}
