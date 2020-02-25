package com.revature.mypackage;
// Package declaration must be the first uncommented line in a java file

import com.revature.accessmods.Student;

import com.revature.math.Math;

public class Driver extends Student {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		System.out.println(add());
		System.out.println(Math.add(4,  4));
		
		Student s = new Student();
	}
	
	public static int add() {
		return 7;
	}
}
