package com.revature.util;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.services.EmployeeService;

public class EmployeeHelper {
	
	private static ObjectMapper om = new ObjectMapper();

	public static void handleGet(HttpServletRequest req, HttpServletResponse res ) throws IOException {
		final String URI = req.getRequestURI().substring(13).substring(9);
		if(URI.length() == 0) {
			res.getWriter().println(
					om.writeValueAsString(
					new EmployeeService().findAll()));
			
		} else if(URI.charAt(0) == '/'){
			int id = Integer.parseInt(URI.substring(1));
			
			res.getWriter().println(
					om.writeValueAsString(
					new EmployeeService().findById(id)));
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
