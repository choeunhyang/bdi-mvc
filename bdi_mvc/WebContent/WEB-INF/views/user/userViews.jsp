<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp"%>
<body>
	<div class="container">
	<h4>유저 리스트</h4>
		<table class="table table-bordered table-hover">
			<tr>
				<th width="30%">번호</th>
				<td>${user.unum}</td>
			</tr>
			<tr>
				<th>이름</th>
				<td>${user.uname}</td>
			</tr>
			<tr>
				<th>아이디</th>
				<td>${user.uid}</td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td>${user.upwd}</td>
			</tr>
			<tr>
				<th>유저설명</th>
				<td>${user.udesc}</td>
			</tr>
			<tr>
				<th>나이</th>
				<td>${user.uage}</td>
			</tr>
		</table>
		<!-- <form action="/user/userDelete" method="post" style="text-align:center;"> -->
			<button type="button" data-page="/user/userUpdate?uNum=${user.unum}">수정</button>
			<button type="button" data-page="/user/userList">취소</button>
			<button>삭제</button>
		<!-- </form> -->
	</div>
</body>
</html>