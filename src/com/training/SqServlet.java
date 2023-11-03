package com.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sq")
public class SqServlet extends HttpServlet {
	
 public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
 {
//	  int k = (int)req.getAttribute("k");
//	  k = k*k;
	  
	 
	 
	 Cookie ck[] = req.getCookies();
	  
	  int k = Integer.parseInt(req.getParameter("k"));
	  
	  PrintWriter out = res.getWriter();
	  out.println("Sq is called "+k + " name is " +ck[0].getValue());
 }
}
