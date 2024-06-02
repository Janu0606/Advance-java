package com.google.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String productName = request.getParameter("productname");
		String category = request.getParameter("category");
		String tmpPrice = request.getParameter("price");
		Integer price = Integer.parseInt(tmpPrice);
		

		double gstPrice = price + price * 0.18;

		PrintWriter out = response.getWriter();

		out.print("<HTML><body>");

		out.println("<br>ProductName : " + productName);
		out.println("<br>Category : " + category);
		out.print("<br>Price : " + price);
		out.print("<br>GST : " + (price * 0.18));
		out.print("<br>Final Price : " + gstPrice);
		out.print("</body></html>");

	}
}