package com.bdi.mvc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = "/WEB-INF" + request.getRequestURI() + ".jsp";
		RequestDispatcher rd = request.getRequestDispatcher(uri);
		rd.forward(request, response);
		/*
		response.setContentType("text/html; charset=utf-8");
		PrintWriter pw = response.getWriter();
		response.getWriter().append("Served at: ").append(request.getContextPath());
		pw.println("니가 가게될 JSP : "+uri);
		pw.println("<br>enter!");
		*/
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
