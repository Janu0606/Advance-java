package com.google.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalcPercServlet")
public class CalcPercServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String mathsStr = request.getParameter("maths");
		String sciStr = request.getParameter("science");
		String engStr = request.getParameter("english");

		boolean isError = false;
		String error = "";
		if (name == null || name.trim().length() == 0) {
			isError = true;
			error = "Enter Name";
		}
		if (mathsStr == null || mathsStr.trim().length() == 0) {
			isError = true;
			error += "<br>Enter Maths Marks";
//			error= error + "Enter Maths Marks";
		}
		if (sciStr == null || sciStr.trim().length() == 0) {
			isError = true;
			error += "<br>Enter Sci Marks";

		}
		if (engStr == null || engStr.trim().length() == 0) {
			isError = true;
			error += "<br>Enter Eng Marks";
		}

		if (isError == true) {
			// error
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print("<html><body>");
			out.print("Please Correct Below Errors<br>");
			out.print(error);
			out.print("</body></html>");

		} else {
			// go ahead
			Integer maths = Integer.parseInt(mathsStr);
			Integer sci = Integer.parseInt(sciStr);
			Integer eng = Integer.parseInt(engStr);

			Float perc = (maths + sci + eng) / 3.0f;

			// HTML ==> MIME
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print("<html><body>");
			out.print("Hey " + name + "<br>");
			out.print("Your Perc : " + perc);
			out.print("</body></html>");
		}
	}
}
