package com.web;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")

public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		//request.getRequestDispatcher("index.jsp").include(request, response);	
		request.getRequestDispatcher("login.html").include(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String username=request.getParameter("UserName");
		String userpassword=request.getParameter("UserPassword");
		
		
		if(username.equals("")  ||  userpassword.equals(""))
		{
			out.println("Login Failed ! ** Required filed is missing </h1>");
		}
		else
			if(username.equals("admin")  && userpassword.equals("admin"))
		{
			
				request.getRequestDispatcher("admin.jsp").include(request, response);
				
				
		}
		else
		{
			out.println("<h1 style='color:red '>Login Failed ! ** Creadentails are Invalid </h1>");
		}
		
		
	}

}

