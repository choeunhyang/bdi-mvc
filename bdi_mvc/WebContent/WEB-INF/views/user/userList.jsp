<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp"%>
<style>
th, td, h4 {text-align:center}
</style>
<body>
	<div class="container">
		<table class="table table-bordered table-hover">
			<h4>유저 리스트</h4>
			<thead>
				<tr>
					<th>번호</th>
					<th>이름</th>
					<th>아이디</th>
					<th>비밀번호</th>
					<th>유저설명</th>
					<th>나이</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="" var="u">
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>