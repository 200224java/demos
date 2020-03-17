package com.revature.servlets;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

      BufferedReader reader = req.getReader();
      StringBuilder sb = new StringBuilder();

      String line = "";
      while( (line = reader.readLine()) != null) {
    	  sb.append(line);
      }
      
      String body = sb.toString();
      
      LoginTemplate template = om.readValue(body, LoginTemplate.class);
      
      // Don't do this
      // You should retrieve the Employee object from your LoginService or similar
      Employee e = new Employee(1, template.getUsername(), template.getPassword(), "Matthew", "Oberlies", "matthew.oberlies@revature.com", Role.FinanceManager);
      
      res.setContentType("application/json");
      
      res.getWriter().println(om.writeValueAsString(e));
  }
}
