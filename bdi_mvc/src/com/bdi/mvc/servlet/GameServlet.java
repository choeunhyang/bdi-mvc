package com.bdi.mvc.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bdi.mvc.service.GameService;
import com.bdi.mvc.service.impl.GameServiceImpl;
import com.bdi.mvc.vo.Game;

public class GameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private GameService gs = new GameServiceImpl();
	private String uri;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		uri = "/views" + request.getRequestURI();
		String cmd = uri.substring(uri.lastIndexOf("/") + 1);
		try {
			if (cmd.equals("gameList")) {
				List<Game> gameList = gs.selectGameList(null);
				request.setAttribute("gameList", gameList);
				/*request.setAttribute("gameList", gs.selectGameList(null));*/
			} else if (cmd.equals("gameView")||cmd.equals("gameUpdate")) {
				String gcNumStr = request.getParameter("gcNum");
				Game game = new Game();
				game.setGcNum(Integer.parseInt(gcNumStr));
				request.setAttribute("game", gs.selectGame(game));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		RequestDispatcher rd = request.getRequestDispatcher(uri);
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
		uri = "/views" + request.getRequestURI();
		String cmd = uri.substring(uri.lastIndexOf("/") + 1);
		request.setCharacterEncoding("utf-8");
		String gcNum = request.getParameter("gcNum");
		String gcName = request.getParameter("gcName");
		String gcPrice = request.getParameter("gcPrice");
		String gcVendor = request.getParameter("gcVendor");
		String gcOrder = request.getParameter("gcOrder");
		String gcDesc = request.getParameter("gcDesc");
		String gcImg = request.getParameter("gcImg");
		try {
			if (cmd.equals("gameInsert")) {
				Game game = new Game(null,gcName, Integer.parseInt(gcPrice), gcVendor, null, gcDesc, null);
				request.setAttribute("rMap", gs.insertGame(game));
			} else if (cmd.equals("gameUpdate")) {
				Game game = new Game(Integer.parseInt(gcNum),gcName, Integer.parseInt(gcPrice), gcVendor, Integer.parseInt(gcOrder), gcDesc, gcImg);
				request.setAttribute("rMap", gs.updateGame(game));
			} else if (cmd.equals("gameDelete")) {
				Game game = new Game(Integer.parseInt(gcNum),null,null, null, null, null, null);
				request.setAttribute("rMap", gs.deleteGame(game));
				uri="/game/gameList";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		RequestDispatcher rd = request.getRequestDispatcher(uri);
		rd.forward(request, response);
	}

}
