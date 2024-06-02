package com.google.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {

	
		public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			String firstName=request.getParameter("firstName");
			String hobby[]=request.getParameterValues("hobby");
			String gender=request.getParameter("gender");
			String city=request.getParameter("city");
			
			PrintWriter out=response.getWriter();
			out.print("<html><body>");

			out.print("firstName:"+firstName);
			out.print("<br>gender:"+gender);
			out.print("<br>hobby:");
			for(int i=0;i<hobby.length;i++){
				 out.print(" "+hobby[i]);
			}
			out.print("<br>city:"+city);
			out.print("</body></html>");
		}
	
}
