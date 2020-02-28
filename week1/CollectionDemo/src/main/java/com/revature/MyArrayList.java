package com.revature;

public class MyArrayList<T extends Comparable> {

	private T[] arr = (T[]) new Comparable[10];
	private int capacity = 10;
	private int size = 0;
	
	public void add(T obj) {
		arr[size] = obj;
		size++;
	}
	
	public void example() {
		System.out.println(arr[0].compareTo(arr[1]));
	}
}
