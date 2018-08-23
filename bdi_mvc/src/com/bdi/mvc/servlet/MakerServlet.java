package com.bdi.mvc.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bdi.mvc.vo.Maker;

public class MakerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = "/views"+request.getRequestURI();
		List<Maker> makerList = new ArrayList<Maker>();
		Maker m = new Maker(1,"갤5",10000,8,0,"갤럭시 5번째");
		makerList.add(m);
		makerList.add(new Maker(2,"갤7",400,11,0,"갤럭시 7번째"));
		makerList.add(new Maker(3,"V20",500,5,0,"브이이십"));
		request.setAttribute("list",makerList);
		RequestDispatcher rd = request.getRequestDispatcher(uri);
		rd.forward(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
