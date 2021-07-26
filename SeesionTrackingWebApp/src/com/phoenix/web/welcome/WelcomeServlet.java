/**
 * Author :deepak.agarwal@stl.tech
 * Creation Date: 22-Jun-2021 
 * Version:1.0
 * Copyright :Sterlite Technologies Ltd.
 * **/
package com.phoenix.web.welcome;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		
		session.setMaxInactiveInterval(5);
		System.out.println("session id : " + session.getId());
		
		String username = request.getParameter("username");
		session.setAttribute("username", username);
		String encodedProductUrl = response.encodeURL("products");
		PrintWriter out = response.getWriter();
		out.println("<body bgcolor='pink'>"
				+ "<h2>Dear </h2> "+ username +"<h2>Welcome to Application</h2>"
				+"<h3> Max Session Timeout</h3>" + session.getMaxInactiveInterval() 
				+"<h3> <a href='products'>Products</a> </h3>"
				+ "</body>");
		
		//response.sendRedirect("https://www.google.com");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
