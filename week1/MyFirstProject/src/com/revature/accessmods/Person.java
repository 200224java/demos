package com.revature.accessmods;

public class Person {

	private int age;
	protected String name;
	
	public Person() {
		super();
	}
	
	public Person(int age) {
		this();
		this.age = age;
	}
	
	// The first line of a constructor must be a call to "this" or "super"
	// If you leave out "this" or "super" then Java will add in "super()"
	public Person(int age, String name) {
		this(age); // This is called constructor chaining
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		if(age < 0) {
			System.out.println("Age cannot be zero");
			return;
		}
		
		this.age = age;
	}
}
