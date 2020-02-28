package com.revature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		
		strings.add("Alex");
		strings.add("Larry");
		strings.add("Bartholemew");
		strings.add("Zackeri");
		strings.add("Ezekial");
		strings.add("Karen");
		strings.add("Kimberly");
		strings.add("Karl");
		
		// A functional interface is an interface with exactly 1 abstract method
//		List<String> filteredResults = 
		strings.stream()
			.filter((str) -> (str.toUpperCase().charAt(0) == 'K'))
			.filter((str) -> (str.length() > 4))
			.forEach((str) -> { System.out.println(str); });
//			.collect(Collectors.toList());

//		for(String s : filteredResults) {
//			System.out.println(s);
//		}
		
		System.out.println(strings.stream().count());
		
		int[] numbers = new int[8];
		
		numbers[4] = 3;
		
		System.out.println(Arrays.stream(numbers).reduce(0, (x, y) -> x + y));
	}
}
