<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp"%>
<body>
	유저리스트
	<br>
	<%-- <%=request.getAttribute("list")%> --%>
	<!-- ${list} -->
	<div class="container">
		<table class="table table-bordered table-hover">
			<thead>
				<tr>
					<td>이름</td>
					<td>나이</td>
				</tr>
			</thead>
			<tbody>
				<%
					List<Map<String, String>> list = (List<Map<String, String>>) request.getAttribute("list");
					for (int i = 0; i < list.size(); i++) {
						//out.println(list.get(i).get("name"));
				%>
				<tr>
					<td><%=list.get(i).get("name")%></td>
					<td><%=list.get(i).get("age")%></td>
				</tr>
				<%
					}
				%>
			</tbody>
		</table>
	</div>
</body>
</html>