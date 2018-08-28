<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp"%>
<c:if test="${!empty rMap}">
	<script>
		alert('${rMap.msg}');
		if ('${rMap.success}' == 'true') {
			location.href = '/user/userList';
		}
	</script>
</c:if>
<body>
	<form action="/user/userUpdate" method="post">
		<div class="container">
			<h4>유저 수정 리스트</h4>
			<table class="table table-bordered table-hover">
				<tr>
					<th width="30%">번호</th>
					<td>${user.unum}</td>
				</tr>
				<tr>
					<th>이름</th>
					<td><input type="text" name="uName" value="${user.uname}"></td>
				</tr>
				<tr>
					<th>아이디</th>
					<td><input type="text" name="uId" value="${user.uid}"></td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="password" name="uPwd" value="${user.upwd}"></td>
				</tr>
				<tr>
					<th>비밀번호 확인</th>
					<td><input type="password" name="uPwdch" value="${user.upwdch}"></td>
				</tr>
				<tr>
					<th>유저설명</th>
					<td><input type="text" name="uDesc" value="${user.udesc}"></td>
				</tr>
				<tr>
					<th>나이</th>
					<td><input type="number" name="uAge" value="${user.uage}"></td>
				</tr>
			</table>
			<div>
				<button data-page="/user/userViews?uNum=${user.unum}">수정</button>
			</div>
		</div>
		<input type="hidden" type="number" name="uNum" value="${user.unum}">
	</form>
</body>
</html>