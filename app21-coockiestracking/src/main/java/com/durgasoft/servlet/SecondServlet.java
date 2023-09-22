package com.durgasoft.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String scollage = request.getParameter("scollage");
		String sbranch = request.getParameter("sbranch");
		
		Cookie c3 = new Cookie("scollage", scollage);
		Cookie c4 = new Cookie("sbranch", sbranch);
		
		response.addCookie(c3);
		response.addCookie(c4);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("./final.html");
		dispatcher.forward(request, response);
		
	}

}
