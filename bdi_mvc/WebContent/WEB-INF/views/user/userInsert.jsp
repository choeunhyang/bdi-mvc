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
	<form action="/user/userInsert" method="post">
		<div class="container">
			<h4 align="center">유저 리스트</h4>
			<table class="table table-bordered table-hover">
				<tr>
					<th>이름</th>
					<td><input type="text" name="uName"></td>
				</tr>
				<tr>
					<th>아이디</th>
					<td><input type="text" name="uId"></td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="password" name="uPwd"></td>
				</tr>
				<tr>
					<th>비밀번호 확인</th>
					<td><input type="password" name="uPwdch"></td>
				</tr>
				<tr>
					<th>유저설명</th>
					<td><input type="text" name="uDesc"></td>
				</tr>
				<tr>
					<th>나이</th>
					<td><input type="number" name="uAge"></td>
				</tr>
			</table>
		<div>
				<button>등록</button>
		</div>
		</div>
	</form>
</body>
</html>