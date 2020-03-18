package com.revature.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeHelper {

	public static void handleGet(HttpServletRequest req, HttpServletResponse res ) {
		final String URI = req.getRequestURI().substring(9);
		if(URI.length() == 0) {
			// logic to retrieve all employees
			
		} else if(URI.charAt(0) == '/'){
			int id = Integer.parseInt(URI.substring(1));
			
			// Logic to retrieve single employee from id
		}
	}
	
	public static void handlePost(HttpServletRequest req, HttpServletResponse res ) {
		final String URI = req.getRequestURI().substring(9);
		if(URI.length() == 0) {
			// Insert employee
			
		} else if(URI.charAt(0) == '/'){
			// This doesn't make sense
		}
	}
}
