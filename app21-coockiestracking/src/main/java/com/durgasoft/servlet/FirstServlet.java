package com.durgasoft.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sname = request.getParameter("sname");
		String sid = request.getParameter("sid");
		
		Cookie c1 = new Cookie("sname", sname);
		Cookie c2 = new Cookie("sid", sid);
		
		response.addCookie(c1);
		response.addCookie(c2);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("./second.html");
		dispatcher.forward(request, response);
		
	}

}
