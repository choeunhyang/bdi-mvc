package com.bdi.mvc.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uri = "/views" + request.getRequestURI();
		String cmd = uri.substring(uri.lastIndexOf("/") + 1);
		if (cmd.equals("userList")) {

		} else if (cmd.equals("userView")) {

		} else if (cmd.equals("userInsert")) {

		} else if (cmd.equals("userUpdate")) {

		} else if (cmd.equals("userDelete")) {

		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uri = "/views" + request.getRequestURI();
		String cmd = uri.substring(uri.lastIndexOf("/") + 1);
		if (cmd.equals("userInsert")) {

		} else if (cmd.equals("userUpdate")) {

		} else if (cmd.equals("userDelete")) {

		}
	}

}
