package com.google.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/CookieLoginServlet")
public class CookieLoginServlet extends HttpServlet {
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		
		if(password.equals("admin")) {
			Cookie c=new Cookie("username",userName);
			response.addCookie(c);
			response.sendRedirect("CookieHome.jsp");
		}else {
		response.sendRedirect("CookieLogin.jsp");
	}
		
}
}