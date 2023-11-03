package com.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

@WebServlet("/add")
public class AddServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i +j;
//		System.out.println("Result is "+k);
		
//		PrintWriter out = res.getWriter();
//		out.println("Addition is "+k);
		
//		req.setAttribute("k",k);
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, res);
		
		String s ="ABC";
		String s ="ABC";
		
		Cookie ck = new Cookie("name",s);
		res.addCookie(ck);
		
		res.sendRedirect("sq?k="+k);
		
	}
}
