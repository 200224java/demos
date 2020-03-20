package com.revature.servlets;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.util.EmployeeHelper;

public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 8374037545068028134L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException {
			final String URI = req.getRequestURI().substring(13);
			System.out.println(URI);
			
			System.out.println(Arrays.toString(URI.split("/")));
			
			switch(URI.split("/")[1]) {
			case "employee":
				EmployeeHelper.handleGet(req, res);
				System.out.println("Processed Employee GET");
				break;
			case "reimbursement":
				break;
			}
			
			System.out.println("Finished");
		}
		
		protected void doPost(HttpServletRequest req, HttpServletResponse res)
				throws IOException, ServletException {
			final String URI = req.getRequestURI();

			switch(URI.split("/")[0]) {
			case "employee":
				EmployeeHelper.handlePost(req, res);
				break;
			case "reimbursement":
				break;
			}
		}
}
