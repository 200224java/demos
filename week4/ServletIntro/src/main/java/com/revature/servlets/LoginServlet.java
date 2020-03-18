package com.revature.servlets;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.Employee;
import com.revature.models.LoginTemplate;
import com.revature.models.Role;

public class LoginServlet extends HttpServlet {
  private static final long serialVersionUID = -3054516715115982849L;
  
  private static final ObjectMapper om = new ObjectMapper();

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse res)
    throws IOException, ServletException {

  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse res)
    throws IOException, ServletException {

	  /*
	   * The below commented out code is used to parse data from the body when not using forms
	   */
//      BufferedReader reader = req.getReader();
//      StringBuilder sb = new StringBuilder();
//
//      String line = "";
//      while( (line = reader.readLine()) != null) {
//    	  sb.append(line);
//      }
//      
//      String body = sb.toString();
//      
//      LoginTemplate template = om.readValue(body, LoginTemplate.class);
      
      LocalDateTime timestamp = LocalDateTime.now();
      
      // Don't do this
      // You should retrieve the Employee object from your LoginService or similar
//      Employee e = new Employee(1, template.getUsername(), template.getPassword(), "Matthew", "Oberlies", "matthew.oberlies@revature.com", Role.FinanceManager);
//      Employee[] all = new Employee[1];
//      all[0] = e;
      
      res.setContentType("application/json");
      
//      res.getWriter().println(om.writeValueAsString(all));
      
      
      /*
       * This method will retrieve query parameters as well as information from a form in POST requests
       * If you put information in the body, it is NOT accessible in this way
       */
      
      LoginTemplate template = new LoginTemplate();
      template.setUsername(req.getParameter("username"));
      template.setPassword(req.getParameter("password"));
      Employee e = new Employee(1, template.getUsername(), template.getPassword(), "Matthew", "Oberlies", "matthew.oberlies@revature.com", Role.FinanceManager);
      
      HttpSession session = req.getSession();
      
      session.setAttribute("currentUser", e);
      
      res.getWriter().println(om.writeValueAsString(e));
  }
  
  /**
   * This method will allow the pre-flight request to have the correct response in order to bypass CORS
   */
	/*
	 * @Override protected void doOptions(HttpServletRequest req,
	 * HttpServletResponse res) throws IOException, ServletException {
	 * res.setHeader("Access-Control-Allow-Origin", "*");
	 * res.setHeader("Access-Control-Allow-Methods",
	 * "GET,POST,PUT,DELETE,OPTIONS,HEAD"); res.setStatus(200); }
	 */
}
