<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp"%>
<c:if test="${!empty rMap}">
<script>
	alert('${rMap.msg}');
	if('${rMap.success}'=='true'){
		location.href='/user/userList';
	}
</script>
</c:if>
<body>
	<div class="container">
	<h4 align="center">유저 리스트</h4>
		<form action="/user/userInsert" method="post" >
			<table class="table table-bordered table-hover">
				<tr>
					<th>이름</th>
					<td><input type="text" name="uname"></td>
				</tr>
				<tr>
					<th>아이디</th>
					<td><input type="text" name="uid"></td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="password" name="upwd"></td>
				</tr>
				<tr>
					<th>유저설명</th>
					<td><input type="text" name="udesc"></td>
				</tr>
				<tr>
					<th>나이</th>
					<td><input type="number" name="uage"></td>
				</tr>
			</table>
		</form>
		<div>
			<button>등록</button>
		</div>
	</div>
</body>
</html>