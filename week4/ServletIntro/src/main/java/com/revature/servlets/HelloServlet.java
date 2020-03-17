package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
  private static final long serialVersionUID = 5797336179647213715L;

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse res)
    throws IOException, ServletException {
      res.setContentType("text/html");

      PrintWriter out = res.getWriter();

      out.println("<h1>Hello World!</h1>");

      String configParam = getServletConfig().getInitParameter("ConfigParam");
      System.out.println(configParam);

      String contextParam = getServletContext().getInitParameter("ContextParam");
      System.out.println(contextParam);

      out.println("<h3>" + configParam + "</h3>");
      out.println("<h3>" + contextParam + "</h3>");
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse res)
    throws IOException, ServletException {


  }
}
