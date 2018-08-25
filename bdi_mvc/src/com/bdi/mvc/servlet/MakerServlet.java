package com.bdi.mvc.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.DefaultEditorKit.InsertBreakAction;

import com.bdi.mvc.service.MakerService;
import com.bdi.mvc.service.impl.MakerServiceImpl;
import com.bdi.mvc.vo.Maker;
import com.sun.javafx.scene.control.skin.IntegerFieldSkin;

public class MakerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private MakerService ms = new MakerServiceImpl();
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = "/views"+request.getRequestURI();
		String cmd =  uri.substring(uri.lastIndexOf("/")+1);
		if(cmd.equals("makerList")) {
			List<Maker> makerList = ms.getMakerList(null);
			request.setAttribute("list", makerList);
		}else if(cmd.equals("makerView") || cmd.equals("makerUpdate")) {
			int mNum = Integer.parseInt(request.getParameter("mNum"));
			request.setAttribute("maker", ms.getMaker(mNum));
		}else if(cmd.equals("makerInsert")) {
			
		}else if(cmd.equals("makerUpdate")) {
			
		}else if(cmd.equals("makerDelete")) {
			
		}
		RequestDispatcher rd = request.getRequestDispatcher(uri);
		rd.forward(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = "/views"+request.getRequestURI();
		String cmd =  uri.substring(uri.lastIndexOf("/")+1);
		request.setCharacterEncoding("utf-8");
		String mNum = request.getParameter("mNum");
		String mName = request.getParameter("mName");
		String mPrice = request.getParameter("mPrice");
		String mCnt = request.getParameter("mCnt");
		String mDesc = request.getParameter("mDesc");
		if(cmd.equals("makerUpdate")) {
			Maker mk = new Maker(Integer.parseInt(mNum),mName,Integer.parseInt(mPrice),Integer.parseInt(mCnt),0,mDesc);
			request.setAttribute("rMap", ms.updateMaker(mk));
		}else if(cmd.equals("makerInsert")) {
			Maker mk = new Maker(0,mName,Integer.parseInt(mPrice),Integer.parseInt(mCnt),0,mDesc);
			request.setAttribute("rMap",ms.insertMaker(mk));
		}else if(cmd.equals("makerDelete")) {
			Maker mk = new Maker(Integer.parseInt(mNum),null,0,0,0,null);
			request.setAttribute("rMap", ms.deleteMaker(mk));
			uri="/maker/makerList";
		}
		RequestDispatcher rd = request.getRequestDispatcher(uri);
		rd.forward(request,response);
	}

}
