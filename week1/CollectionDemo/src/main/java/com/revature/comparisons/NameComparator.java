package com.revature.comparisons;

import java.util.Comparator;

import com.revature.Person;

/*
 * The other commonly used interface is the Comparator interface
 * This is a generic interface, and it defines a single method: compare
 * 
 * This method also returns an int, with the same output expectation as the
 * compareTo method on the Comparable interface
 * 
 * So:
 * 
 * It returns an int
 * It should be negative if parameter 1 should be *less* than parameter 2
 * It should be positive if parameter 1 should be *greater* than parameter 2
 * It should be zero if parameter 1 should be *equal* to parameter 2
 * 
 * The primary difference between these interfaces is that Comparator is implemented
 * on a different class than the type being compared
 * We will create an explicit Comparator class that just compares these types
 * 
 * The Comparator interface defines some type of ordering, but it is not necessarily the
 * *natural* ordering
 */
public class NameComparator implements Comparator<Person> {

	@Override
	public int compare(Person p0, Person p1) {
		if(p0 != null && p1 != null) {
			return p0.getName().compareTo(p1.getName());
		} else {
			return 0;
		}
	}
}
