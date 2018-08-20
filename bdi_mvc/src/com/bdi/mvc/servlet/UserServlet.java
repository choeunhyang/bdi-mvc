package com.bdi.mvc.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bdi.mvc.service.DelService;
import com.bdi.mvc.service.impl.DelServiceImpl;

public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private DelService ds = new DelServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = "/views"+request.getRequestURI();
		List<Map<String, String>> list;
		try {
			list = ds.getDelList();
			request.setAttribute("list", list);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*List<Map<String,String>> list = new ArrayList<Map<String,String>>();
		for(int i = 1;i<=10;i++) {
			Map<String,String> map = new HashMap<String,String>();
			map.put("name", "이름"+i);
			map.put("age", i+"");
			list.add(map);
		}*/
		//request.setAttribute("list", list);
		RequestDispatcher rd = request.getRequestDispatcher(uri);
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
