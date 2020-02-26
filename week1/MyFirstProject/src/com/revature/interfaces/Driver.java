package com.revature.interfaces;

public class Driver {

	public static void main(String[] args) {
		Duck d = new Duck();

		d.incubate(d.lay(), 3600);
	}
}
