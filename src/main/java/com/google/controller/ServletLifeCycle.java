package com.google.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletLifeCycle")
public class ServletLifeCycle extends HttpServlet {

	public void init() throws ServletException {
		//connection 
		System.out.println("ServletLifeCycle::init()");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("ServletLifeCycle::service()");
	}

	public void destroy() {
		//close 
		System.out.println("ServletLifeCycle::destroy()");
	}
	
}
