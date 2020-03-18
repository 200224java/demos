package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ErrorServlet extends HttpServlet {
	private static final long serialVersionUID = -9171487274627975323L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res)
		throws IOException, ServletException {
		req.getRequestDispatcher("error.html").forward(req, res);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException {
			doGet(req, res);
		}
}
