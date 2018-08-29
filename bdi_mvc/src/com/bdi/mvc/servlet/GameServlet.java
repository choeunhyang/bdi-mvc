package com.bdi.mvc.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bdi.mvc.service.GameService;
import com.bdi.mvc.service.impl.GameServiceImpl;

public class GameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private GameService gs = new GameServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = "/views" + request.getRequestURI();
		String cmd = uri.substring(uri.lastIndexOf("/") + 1);
		try {
			if (cmd.equals("gameList")) {
				request.setAttribute("gameList", gs.selectGameList(null));
			} else if (cmd.equals("gameView")) {

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		RequestDispatcher rd = request.getRequestDispatcher(uri);
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
		String uri = "/views" + request.getRequestURI();
		String cmd = uri.substring(uri.lastIndexOf("/") + 1);
		request.setCharacterEncoding("utf-8");
		/*try {
			if (cmd.equals("gameInsert")) {
			} else if (cmd.equals("gameUpdate")) {

			} else if (cmd.equals("gameDelete")) {

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}*/
		RequestDispatcher rd = request.getRequestDispatcher(uri);
		rd.forward(request, response);
	}

}
