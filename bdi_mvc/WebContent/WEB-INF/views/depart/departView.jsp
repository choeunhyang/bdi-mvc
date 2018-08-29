<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp"%>
<body>
	<div class="container">
		<table class="table table-bordered">
			<tr>
				<th>부서번호</th>
				<td>${depart.diNo}</td>
			</tr>
			<tr>
				<th>부서이름</th>
				<td>${depart.diName}</td>
			</tr>
			<tr>
				<th>부서설명</th>
				<td>${depart.diDesc}</td>
			</tr>
			<tr>
				<th>부서총인원</th>
				<td>${depart.diCnt}</td>
			</tr>
		</table>
		<div>
			<button>수정</button>
		</div>
	</div>
</body>
</html>