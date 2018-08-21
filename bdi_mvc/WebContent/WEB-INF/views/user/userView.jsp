<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp"%>
<body>
	${user}
	<div class="container">
		<table class="table table-bordered table-hover">
			<tr>
				<th>번호</th>
				<td>${user.num}</td>
			</tr>
			<tr>
				<th>이름</th>
				<td>${user.name}</td>
			</tr>
			<tr>
				<th>나이</th>
				<td>${user.age}</td>
			</tr>
		</table>
		<div><button onclick="goPage()">리스트 이동</button></div>
	</div>
<script>
	function goPage(){
		location.href="/user/userList";
	}
</script>
</body>
</html>