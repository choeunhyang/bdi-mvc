<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp"%>
<body>
<div class="container">
		<h4 align="center">메이커리스트</h4>
		<table class="table table-bordered table-hover">
			<c:forEach items="${list}" var="m">
				<tr>
					<th>번호</th>
					<td>${m.mnum}</td>
				</tr>
				<tr>
					<th>메이커명</th>
					<td>${m.mname}</td>
				</tr>
				<tr>
					<th>가격</th>
					<td>${m.mprice}</td>
				</tr>
				<tr>
					<th>수량</th>
					<td>${m.mcnt}</td>
				</tr>
				<tr>
					<th>총액</th>
					<td>${m.mprice*m.mcnt}</td>
				</tr>
				<tr>
					<th>메이커설명</th>
					<td>${m.mdesc}</td>
				</tr>
			</c:forEach>
	</table>
	<div>
		<button>삭제</button>
		<button>수정</button>
	</div>
</div>
</body>
</html>