package com.revature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.revature.comparisons.NameComparator;

public class Driver {

	public static void main(String[] args) {
		Student s = new Student("Larry", 33, "Underwater Basket Weaving");
		
		List<Student> students = new ArrayList<>(); // <---- On the right side, we have just <>
		// This is called the diamond operator, and it is performing type inference, based on
		// the information on the left side
		
		students.add(s);
		
		for(Student t : students) {
			System.out.println(t.getMajor());
		}
		
//		List<Person> persons = students; <--- This does not work!
		// Cannot convert from type List<Student> to List<Person>
		
//		List<? extends Student> students2 = students;
		List<? extends Person> persons2 = students; // <---- This DOES work!

		for(Person p : persons2) {
			System.out.println(p.getName());
		}
		
		
		MyArrayList<String> strings = new MyArrayList<>();
		
		strings.add("New String");
		strings.add("Other String");
		
		strings.example();
		
		
		Student s2 = new Student("Jerry", 18, "Standup Comedy");
		
		students.add(s2);
		
		for(Student t : students) {
			System.out.println(t);
		}
		
		Collections.sort(students);
		
		for(Student t : students) {
			System.out.println(t);
		}
		students.add(new Student("Alex", 55, "Dry Basket Weaving"));
		
		// Using an instantiation of a class that implements Comparator
//		Collections.sort(students, new NameComparator());
		
		// Using a lambda to declare the sorting logic in-line
		Collections.sort(students, (s1, s3) -> s1.getName().compareTo(s3.getName()));
		
		for(Student t : students) {
			System.out.println(t);
		}
		
		List<String> names = students.stream()
					.map((student1) -> student1.getName())
					.collect(Collectors.toList());
		
		for(String name : names) {
			System.out.println(name);
		}
	}
}
