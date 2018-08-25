package com.bdi.mvc.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bdi.mvc.service.UserService;
import com.bdi.mvc.service.impl.UserServiceImpl;
import com.bdi.mvc.vo.User;

public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService us = new UserServiceImpl(); 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = "/views" + request.getRequestURI();
		String cmd = uri.substring(uri.lastIndexOf("/") + 1);
		if (cmd.equals("userList")) {
			List<User> userList = us.getUserList(null);
			request.setAttribute("list", userList);
		} else if (cmd.equals("userViews") || cmd.equals("userUpdate")) {
			int uNum = Integer.parseInt(request.getParameter("uNum"));
			request.setAttribute("user", us.getUser(uNum));
		} else if (cmd.equals("userInsert")) {
			
		} else if (cmd.equals("userDelete")) {
			
		}
		RequestDispatcher rd = request.getRequestDispatcher(uri);
		rd.forward(request, response);
	} 

	protected void doPost(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
		String uri = "/views" + request.getRequestURI();
		String cmd = uri.substring(uri.lastIndexOf("/") + 1);
		request.setCharacterEncoding("utf-8");
		String uNum = request.getParameter("uNum");
		String uName = request.getParameter("uName");
		String uId = request.getParameter("uId");
		String uPwd = request.getParameter("uPwd");
		String uDesc = request.getParameter("uDesc");
		String uAge = request.getParameter("uAge");
		if (cmd.equals("userInsert")) {
			User ue = new User(0,uName,uId,uPwd,uDesc,Integer.parseInt(uAge));
			request.setAttribute("rMap", us.insertUser(ue));
		} else if (cmd.equals("userUpdate")) {
			User ue = new User(Integer.parseInt(uNum),uName,uId,uPwd,uDesc,Integer.parseInt(uAge));
			request.setAttribute("rMap", us.updateUser(ue));
		} else if (cmd.equals("userDelete")) {
			
			uri="/user/userList";
		}
		RequestDispatcher rd = request.getRequestDispatcher(uri);
		rd.forward(request, response);
	}

}
