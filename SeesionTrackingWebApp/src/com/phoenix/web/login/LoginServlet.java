/**
 * Author :deepak.agarwal@stl.tech
 * Creation Date: 22-Jun-2021 
 * Version:1.0
 * Copyright :Sterlite Technologies Ltd.
 * **/
package com.phoenix.web.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginS")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//Retrieve request parameter
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		PrintWriter out = response.getWriter();
		
		if(username!=null && password!=null && username.equals("Deepak") && password.equals("Deep"))
		{
			RequestDispatcher rd = request.getRequestDispatcher("welcome");
			rd.forward(request, response);
		}
		else
		{
			out.println("<h3 style='color:red;'> INVAID LOGIN </h3>");
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);

		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
