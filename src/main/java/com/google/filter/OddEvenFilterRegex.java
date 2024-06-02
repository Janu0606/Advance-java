package com.google.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
@WebFilter("/OddEvenServlet")

public class OddEvenFilterRegex implements Filter {
	public void destroy() {
		// TODO Auto-generated method stub
		
	}public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		String num=(String) request.getParameter("num");
		boolean isError=false;
		
		if(num.matches("[0-9]+")==false) {
			isError =true;
			request.setAttribute("nameError", "please enter valid number");
		}
		
		if(isError == true) {
			System.out.println("Error");
			RequestDispatcher rd=request.getRequestDispatcher("OddEvenInput.jsp");
			rd.forward(request, response);
		}else {
			System.out.println("Sucess");
			chain.doFilter(request, response);//send to next filter or servlet
		}
		// TODO Auto-generated method stub
		
	}public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
		
	}
}
