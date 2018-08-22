<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp"%>
<style>
	th,td{text-align:center;}
</style>
<body>
<div class="container">
		<h4 align="center">메이커리스트</h4>
		<table class="table table-bordered table-hover">
			<thead>
				<tr>
					<th>번호</th>
					<th>메이커명</th>
					<th>가격</th>
					<th>수량</th>
					<th>총액</th>
					<th>메이커설명</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${list}" var="m">
				<tr>
					<td>${m.mnum}</td>
					<td>${m.mname}</td>
					<td>${m.mprice}</td>
					<td>${m.mcnt}</td>
					<td>${m.mtotal}</td>
					<td>${m.mdesc}</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>

<%-- <c:forEach items="${list}" var="m">
	${m.mnum}. ${m.mname} - ${m.mprice}<br>
</c:forEach> --%>

<%-- ${list} --%>

<%-- 
<%=request.getAttribute("name")%><br>
이름 : ${name}<br>
나이 : ${age}<br>
${test.cpu}
${test.ram}
${test.ssd}<br>
${test}
 --%>
</body>
</html>