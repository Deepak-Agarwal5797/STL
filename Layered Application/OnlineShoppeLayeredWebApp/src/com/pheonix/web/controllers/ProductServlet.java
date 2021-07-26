package com.pheonix.web.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pheonix.data.Product;
import com.pheonix.exceptions.ServiceException;
import com.pheonix.services.ProductService;
import com.pheonix.services.ProductServiceImpl;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ProductAllServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProductServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		ProductService productService = new ProductServiceImpl();

		String flag = request.getParameter("flag");

		if (flag.equals("viewProducts")) {
			HttpSession session = request.getSession();
			List<Product> products = new ArrayList<Product>();
			try {
				products = productService.findAll();
				session.setAttribute("products", products);
				response.sendRedirect("products.jsp");
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		else if (flag.equals("delete")) {
			System.out.println("delete products");
			int id = Integer.parseInt(request.getParameter("id"));
			Product product = new Product();
			List<Product> products = new ArrayList<Product>();
			HttpSession session = request.getSession();
			product.setId(id);
			try {
				products = productService.findAll();
				session.setAttribute("products", products);
				productService.remove(product);
				response.sendRedirect("products.jsp");
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
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

		ProductService productService = new ProductServiceImpl();
		String flag = request.getParameter("flag");

		if (flag.equals("addProduct")) {
			String pName = request.getParameter("pName");
			String brand = request.getParameter("brand");
			float price = Float.parseFloat(request.getParameter("price"));
			List<Product> products = new ArrayList<Product>();
			HttpSession session = request.getSession();

			Product product = new Product();

			product.setId(3);
			product.setName(pName);
			product.setBrand(brand);
			product.setPrice(price);

			try {
				productService.add(product);
				products = productService.findAll();
				session.setAttribute("products", products);
				response.sendRedirect("products.jsp");
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (flag.equals("update")) {
			int id = Integer.parseInt(request.getParameter("id"));
			String pName = request.getParameter("pName");
			String brand = request.getParameter("brand");
			float price=Float.parseFloat(request.getParameter("price"));

			Product product = new Product();
			
			product.setId(id);
			product.setName(pName);
			product.setBrand(brand);
			product.setPrice(price);

			try {
				productService.edit(product);
				response.sendRedirect("welcome.jsp");
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
