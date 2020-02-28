package com.revature.junit;

public class Arithmetic {

	public long add(int x, int y) {
		return (long) x + (long) y;
	}

	public int mult(int x, int y) {
		return x * y;
	}

	public double divide(int x, int y) {
		if(y == 0) {
			throw new MyException();
		}
		return (double) x / (double) y;
	}
	// 2 / 3 = 0.6666... -> 0
	
	public int mod(int x, int y) {
		return x % y; // Returns the remainder from performing long division
	}
}
