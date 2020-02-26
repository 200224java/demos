package com.revature.interfaces;

// Interfaces are declared with the interface keyword
/*
 * interfaces are very similar to abstract classes, except they are
 * more restricted in order to be more lightweight
 * 
 * all member variables must be public static final
 * 	One characteristic of this, is that since the variables are static
 * 	they belong to the *interface* and not to the classes that implement it
 * 
 * all methods must be public abstract
 * 
 * Methods *may* use the default keyword to provide an implementation
 * 
 * In general, it is not recommended to use the default keyword to provide
 * an implementation
 * 
 * We of course can have static methods if we want
 * 
 * But considering that static methods belong to the interface itself and not
 * to the classes that implement it, we should provide an implementation for the static
 * method
 * Static methods are not abstract
 */
public interface EggLayable {

	// incubate
	// lay
	// genetics
	
	public abstract void incubate(int numOfEggs, int seconds);
	
	int lay();
}
