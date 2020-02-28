package com.revature;

/*
 * This is an example that utilizes both the Singleton and Factory design patterns
 * 
 * We already have seen why this is a singleton, but it is also a Factory
 * because this returns many different types of Student objects that can
 * be determined at runtime
 * 
 * We accomplish this with a getStudent method that takes a String (and other inputs
 * can be taken instead, whatever you need to determine which type of object
 * to instantiate)
 */
public class College {

	private static College instance = null;
	
	private College() {
		super();
	}
	
	public static College getCollege() {
		if(instance != null) {
			return instance;
		}
		
		instance = new College();
		return instance;
	}
	
	public Student getStudent(String type, String name, int age) {
		if(type == null) {
			System.out.println("How could you!?");
			return null;
		}
		
		switch(type.toLowerCase()) {
		case "math":
			return new MathStudent(name, age, "Math");
		case "english":
			return new EnglishStudent(name, age, "English");
		case "history":
			return new HistoryStudent(name, age, "History");
		default:
			return new Student(name, age, "Liberal Arts");
		}
	}
}
