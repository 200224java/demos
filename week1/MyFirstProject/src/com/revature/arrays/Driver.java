package com.revature.arrays;

public class Driver {
	
	static int[] arr;
	
	// This is called a static initializer
	static {
		
	}
	
	
	// This is called an instance initializer
	{
		
	}
	
	
	// The control flow is as follows:
	// static variables
	// static initializers
	// ==========WHEN AN OBJECT GETS CREATED
	// instance variables
	// instance initializers
	// Constructor
	
	// Arrays in Java are a sequential list of values
	// This means that the memory is stored sequentially, with respect to their addresses
	// Memory is reserved all together in a block
	
	// One characteristic of this, is that the size of the array CANNOT be changed
	// once it is created

	public static void main(String[] args) {
		
		// Note, that arrays in Java ARE objects
		// This means that they have a reference variable, which is different
		// from the array object itself
		// As such, these reference variables CAN be null
		
		System.out.println(arr);
		
		arr = new int[5];
		
		System.out.println(arr);
		
		int[][] arr2 = new int[5][];
		
		
		for(int[] i : arr2) {
			System.out.println(i);
			i = new int[5];
			for(int k : i) {
				System.out.println(k);
			}
			System.out.println();
		}
		
		System.out.println(add(5, 10, 15));
		
		System.out.println(add(3));
	}
	
	// This is called var-args or just varargs, which supports any number of parameters
	// varargs must be the last parameter in the signature
	// Only have 1 varargs in a method signature
	// The type of the varargs (such as int in this example) are the type of
	// the needed parameters
	
	// All of the extra int parameters will be stored into an array with that
	// varargs parameter name
	// This example has an extra int paramater a, because I want a minimum of 1 input
	// parameter
	public static int add(int a, int...arr) {
		System.out.println(arr.length);
		int sum = a;
		for(int i : arr) {
			sum += i;
		}
		return sum;
	}
}
