package com.revature.nonaccessmods;

public class Driver {
	
	/*
	 * There are several non-access modifiers
	 * 
	 * They can be used in conjunction with access modifiers
	 * 
	 * The first one is the static keyword:
	 * 
	 * 		This keyword declares a method or variable to belong to the class itself
	 * 		It will have STATIC SCOPE
	 * 		Note, this cannot be used on local variables
	 * 
	 * final keyword:
	 * 		This keyword prevents something from being modified
	 * 		For variables: The value cannot be changed
	 * 		For methods: The method cannot be overridden
	 * 		For classes: The class cannot be extended
	 * 
	 * abstract keyword:
	 * 		This applies to classes and methods
	 * 		This keyword can only be used on methods if they are inside an abstract class
	 * 			or interface
	 * 		Abstract classes cannot be instantiated
	 * 			This directly conflicts with the final keyword, so nothing can be
	 * 			abstract and final, will not compile
	 *		Abstract methods do not have implementations
	 *
	 * synchronized keyword:
	 * 		The synchronized keyword can be used on variables
	 * 		It prevents multiple threads from accessing the variable at once
	 * 
	 * volatile keyword:
	 * 		This applies to variables (only instance and static scope)
	 * 		This keyword changes the location that the variable is stored to main memory
	 * 			(NOT the stack OR the heap)
	 * 		Since each Thread gets its own Stack, they cannot access anything in the stack
	 * 			from another thread
	 * 		volatile keyword would make this variable accessible to all threads
	 * 
	 * transient keyword:
	 * 		This applies to fields (only instance and static scope)
	 * 		This prevents the field from being serialized
	 * 
	 * strictfp keyword:
	 * 		This applies to classes
	 * 		This forces all methods and fields in a strictfp classes to
	 * 			make any variables declared follow strict IEEE floating point format
	 * 
	 * native keyword:
	 * 		This applies to methods
	 * 		This means that the implementation of the method will be provided
	 * 		somewhere else in a different language
	 */

	public static void main(String[] args) {
		Shape s = new Circle(1.21);
		System.out.println(s.area());
	}
}
