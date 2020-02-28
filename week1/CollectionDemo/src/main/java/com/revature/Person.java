package com.revature;

import java.util.Objects;

/*
 * There are 2 commonly used interfaces when defining how your custom classes should be compared to each other
 * The first is the comparable interface
 * 
 * This interface will be implemented by your custom class itself
 * 
 * The comparable interface defines a single abstract method: compareTo
 * It takes a single parameter of the same type as your class
 * 
 * It returns an int
 * It should be negative if the value calling the method should be *less* than the parameter
 * It should be positive if the value calling the method should be *greater* than the parameter
 * It should be zero if the the value calling the method is equal to the parameter
 * 
 * The comparable interface is used to define the *natural* ordering of this class
 */
public class Person implements Comparable {

	private String name;
	private int age;
	
	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	/**
	 * This method subtracts the Person's ages
	 * 
	 * @param o The second Person to be compared
	 * 
	 * @return the difference of their ages
	 */
	@Override
	public int compareTo(Object o) {
		if(!(o instanceof Person)) {
			return -1;
		}
//		
//		if(this.age < ((Person) o).age) {
//			return -1;
//		} else if(this.age == ((Person) o).age) {
//			return 0;
//		}
//		
//		return 1;
		
		return this.age - ((Person) o).age;
	}
}
