package com.pheonix.web.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pheonix.data.User;
import com.pheonix.exceptions.ServiceException;
import com.pheonix.exceptions.UserAlreadyExistException;
import com.pheonix.exceptions.UserNotFoundException;
import com.pheonix.services.LoginService;
import com.pheonix.services.LoginServiceImpl;
import com.pheonix.web.models.LoginBean;

/**
 * Servlet implementation class ValidateServlet
 */
@WebServlet("/UserS")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		LoginService loginService = null;
		loginService = new LoginServiceImpl();
		HttpSession session = request.getSession();
		User user = new User();

		String flag = request.getParameter("flag");

		if (flag.equals("delete")) {
			String userName = (String) session.getAttribute("user");
			try {
				user.setUserName(userName);
				loginService.remove(user);
				response.sendRedirect("login.html");
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		LoginService loginService = null;
		loginService = new LoginServiceImpl();
		User user = new User();
		HttpSession session = request.getSession();

		String flag = request.getParameter("flag");

		if (flag.equals("signIn")) {
			LoginBean lbn = new LoginBean();
			request.setAttribute("ob", lbn);

			String userName = request.getParameter("un");
			String passWord = request.getParameter("pwd");

			lbn.setUserName(userName);
			lbn.setPassWord(passWord);

			try {
				if (lbn.isValid()) {
					String individualuser = loginService.findUsersById(userName).getUserName();
					session.setAttribute("user", individualuser);
					RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
					rd.forward(request, response);
				} else {
					PrintWriter out = response.getWriter();
					out.println("<h1 style=color:red>Invalid Login</h1>");
					RequestDispatcher rd = request.getRequestDispatcher("login.html");
					rd.include(request, response);
				}
			} catch (UserNotFoundException | ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		else if (flag.equals("signUp")) {

			String userName = request.getParameter("un");
			String passWord = request.getParameter("pwd");

			user.setUserName(userName);
			user.setPassWord(passWord);

			try {
				loginService.add(user);
				response.sendRedirect("login.html");
			} catch (UserAlreadyExistException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		else if (flag.equals("update")) {
			String userName = request.getParameter("un");
			String passWord = request.getParameter("pwd");

			user.setUserName(userName);
			user.setPassWord(passWord);

			try {
				loginService.changePassWord(user);
				response.sendRedirect("welcome.jsp");
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
