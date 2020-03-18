package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.Employee;

public class ProfileServlet extends HttpServlet {

	private static final long serialVersionUID = -785262612458585582L;
	
	private static ObjectMapper om = new ObjectMapper();

	protected void doGet(HttpServletRequest req, HttpServletResponse res)
		throws IOException, ServletException {
		
		HttpSession session = req.getSession(false);
		
		if(session == null) {
			req.getRequestDispatcher("index.html").forward(req, res);
		} else {
			Employee e = (Employee) session.getAttribute("currentUser");
			
			res.setContentType("application/json");
			res.setStatus(200);
			
			res.getWriter().println(om.writeValueAsString(e));
		}
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException {
			
		doGet(req, res);
	}
}
