

package com.web;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Teacher;
import com.util.HibernateSessionUtil;


@WebServlet("/list-teacher")
public class ListTeacher extends HttpServlet{

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//request.getRequestDispatcher("index.jsp").include(request, response);

		try {
			// 1. build hibernate session factory
			SessionFactory factory = HibernateSessionUtil.buildSessionFactory();
			
			// 2. create session object
			Session session = factory.openSession();
			
			// 3. read Customers
			List<Teacher> teachers = session.createQuery("from Teacher").list();
			
			//show data as table.
			out.print("<h1> Teachers List :- </h1>");
			
			out.print("<table >");
			out.print("<tr>");
				out.print("<th> Teacher Id</th>");
				out.print("<th> Teacher Name</th>");
				out.print("<th> Teacher Email</th>");
				out.print("<th> Teacher Subject </th>");
				
			out.print("</tr>");
			
			for(Teacher p : teachers) {
				out.print("<tr>");
				out.print("<td>"+p.getId()+"</td>");
				out.print("<td>"+p.getName()+"</td>");
				out.print("<td>"+p.getEmail()+"</td>");
				out.print("<td>"+p.getSubject()+"</td>");
				
				out.print("</tr>");
			}
			out.print("</table><br><br>");
			out.print("<h3><a href='add-teacher'>Back </a></h3>");
			// 3. close session
			session.close();
		} catch (Exception e) {
			out.print("<h3 style='color:red'> Hibernate session is failed ! </h3>");
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}