package com.revature;

/*
 * This is a nice example of the Singleton design pattern
 * 
 * We want to restrict the ability to create objects in order to only allow
 * a single instance of this type in memory at any given time
 * 
 * We do so with a private static instance of our class
 * as well as a private constructor
 * 
 * Then we simply make a public static method that retrieves the instance
 */
public class SingletonSample {

	private static SingletonSample instance = null;
	
	private SingletonSample() {
		super();
	}
	
	public static SingletonSample getInstance() {
		if(instance != null) {
			return instance;
		}
		
		instance = new SingletonSample();
		return instance;
	}
	
	public void print() {
		System.out.println("This method only works with our individual instance: " + instance);
	}
}
