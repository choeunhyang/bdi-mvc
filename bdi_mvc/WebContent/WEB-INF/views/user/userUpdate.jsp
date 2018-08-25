<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp"%>
<body>
	<div class="container">
	<form>
		<h4>유저 리스트</h4>
		<table class="table table-bordered table-hover">
			<tr>
				<th width="30%">번호</th>
				<td>${user.unum}</td>
			</tr>
			<tr>
				<th>이름</th>
				<td><input type="text" name="uname" value="${user.uname}"></td>
			</tr>
			<tr>
				<th>아이디</th>
				<td><input type="text" name="uid" value="${user.uid}"></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="upwd" value="${user.upwd}"></td>
			</tr>
			<tr>
				<th>유저설명</th>
				<td><input type="text" name="udesc" value="${user.udesc}"></td>
			</tr>
			<tr>
				<th>나이</th>
				<td><input type="number" name="uage" value="${user.uage}"></td>
			</tr>
		</table>
		<button type="button" data-page="/user/userUpdate?uNum=${user.unum}">수정</button>
		<input type="hidden">
		</form>
</body>
</html>