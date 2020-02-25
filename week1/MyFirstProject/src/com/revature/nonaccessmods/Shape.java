package com.revature.nonaccessmods;

// With the abstract keyword, Shape cannot be instantiated
// Additionally, we may now have abstract methods
public abstract class Shape {

	public abstract double area();
	// This method does not have an implementation because it is abstract
	
	public Object test() {
		return new Object();
	}
}
