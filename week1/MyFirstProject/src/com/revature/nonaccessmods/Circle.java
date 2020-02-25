package com.revature.nonaccessmods;

public class Circle extends Shape {
	
	private double radius;
	
	public Circle() {
		super();
	}
	
	public Circle(double radius) {
		this();
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if(radius >= 0) {
			this.radius = radius;
		}
	}

	// This @Override declaration is called an annotation
	// Annotations can do many things, but in general, they provide
	// metadata, or enforce some external rules
	// @Override in particular is built in, but you can create your own annotations
	// @Override enforces that this method is in fact overriding another method
	// If it was accidentally only overloading a method, it would not compile
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
	
	// You may change the return type when you override a method ONLY IF
	// the return type was originally an object, and you may only change it
	// to a subclass of the original return type
	@Override
	public String test() {
		return "Larry";
	}
}
