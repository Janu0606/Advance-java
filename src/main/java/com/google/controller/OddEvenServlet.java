package com.google.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/OddEvenServlet")

public class OddEvenServlet extends HttpServlet{
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String numstr=(String) request.getParameter("num");
		int num=Integer.parseInt(numstr);
		
		if(num %2 ==0) {
			request.setAttribute("message","Even");
		}else {
			request.setAttribute("message","Odd");
		}
		
		request.setAttribute("num", num);
		
		RequestDispatcher rd = request.getRequestDispatcher("OddEvenOutput.jsp");
		rd.forward(request, response);
	}
}
