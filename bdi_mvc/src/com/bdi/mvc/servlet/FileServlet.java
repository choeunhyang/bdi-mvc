package com.bdi.mvc.servlet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class FileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		req.setCharacterEncoding("ISO-8859-1");
//		BufferedReader reader = req.getReader();
//		File sFile = new File("d:\\test.txt");
//		sFile.createNewFile();
//		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(sFile.getPath())));
//		
//		String line;
//		while ((line = reader.readLine()) != null) {
//			writer.write(line);
//			writer.newLine();
//		}
//		writer.close();
//		String data = buffer.toString();
		
		/*UploadFiles.saveFileList(request);
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = response.getWriter();
		pw.write("저장 성공");*/
	}

}
