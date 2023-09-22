package com.durgasoft.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class FinalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Cookie [] cookies =request.getCookies();
		String semail = request.getParameter("semail");
		String sphno = request.getParameter("sphno");
		
		String sname = cookies[0].getValue();
		String sid = cookies[1].getValue();
		String scollage = cookies[2].getValue();
		String sbranch = cookies[3].getValue();
		
		out.println("<html>");
		out.println("<body bgcolor='GreenYellow'>");
		out.println("<h1 style='color:Crimson' align='center'>Student Details</h1>");
		out.println("<table align='center' border='1'>");
		out.println("<tr><td>Student Name</td><td>"+sname+"</td></tr>");
		out.println("<tr><td>Student Id</td><td>"+sid+"</td></tr>");
		out.println("<tr><td>Student Collage</td><td>"+scollage+"</td></tr>");
		out.println("<tr><td>Student Branch</td><td>"+sbranch+"</td></tr>");
		out.println("<tr><td>Student emial id</td><td>"+semail+"</td></tr>");
		out.println("<tr><td>Student Phone No</td><td>"+sphno+"</td></tr>");
		out.println("</table></body></html>");
		
	}

}
