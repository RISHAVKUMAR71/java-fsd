

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

import com.model.Subjects;
import com.util.HibernateSessionUtil;

@WebServlet("/list-subjects")
public class ListSubjects extends HttpServlet{

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
			List<Subjects> subj = session.createQuery("from Subjects").list();
			
			//show data as table.
			out.print("<h1 style='align-center' color='green'> Subjects List :- </h1>");
			
			out.print("<table >");
			out.print("<tr>");
				out.print("<th> Subject Id</th>");
				out.print("<th> SubjectName</th>");
				out.print("<th> SubjectCode</th>");
				
				
			out.print("</tr>");
			
			for(Subjects p : subj) {
				out.print("<tr>");
				out.print("<td>"+p.getId()+"</td>");
				out.print("<td>"+p.getSubname()+"</td>");
				out.print("<td>"+p.getSubcode()+"</td>");
				//out.print("<td>"+p.getSection()+"</td>");
				
				out.print("</tr>");
			}
			out.print("</table><br><br>");
			out.print("<h3><a href='add-subject'>Back </a></h3>");
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