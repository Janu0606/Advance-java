package com.google.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/NameServlet")
public class NameServlet extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response)throws IOException {
		String firstName=request.getParameter("firstname");
		firstName=firstName.toUpperCase();
		System.out.println(firstName);
		PrintWriter out = response.getWriter();
		out.println(firstName);
		
		
	}
}
