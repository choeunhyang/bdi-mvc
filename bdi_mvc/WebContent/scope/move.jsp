<%@page import="com.bdi.mvc.vo.Maker"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp"%>
<%
List<Maker> makerList = new ArrayList<Maker>();
Maker m = new Maker(1,"갤5",10000,1,0,"갤럭시 5번째");
makerList.add(m);
makerList.add(new Maker(2,"갤7",1000,11,0,"갤럭시 7번째"));
makerList.add(new Maker(3,"V20",200,5,0,"브이이십"));
request.setAttribute("list",makerList);
RequestDispatcher rd = request.getRequestDispatcher("/scope/forward.jsp");
rd.forward(request,response);
%>

<%-- 
<%
request.setAttribute("name", "냐하하하하");
Map<String,String> test = new HashMap<String,String>();
test.put("cpu","I7");
test.put("ram","8GB");
test.put("ssd","120GB");
request.setAttribute("test", test);
pageContext.setAttribute("age", 33);
RequestDispatcher rd = request.getRequestDispatcher("/scope/forward.jsp");
rd.forward(request,response);
%>
<!-- 내부적으로 이동함 --> 
--%>