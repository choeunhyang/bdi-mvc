<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp"%>
<style>
th, td, h4 {text-align:center}
</style>
<c:if test="${!empty rMap}">
	<script>
		alert('${rMap.msg}');
		if ('${rMap.success}' == 'true') {
			location.href = '/user/userList';
		}
	</script>
</c:if>
<body>
	<div class="container">
	<h4>유저 리스트</h4>
		<table class="table table-bordered table-hover">
			<thead>
				<tr>
					<th>번호</th>
					<th>이름</th>
					<th>아이디</th>
					<th>비밀번호</th>
					<th>비밀번호 확인</th>
					<th>유저설명</th>
					<th>나이</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${list}" var="u">
				<tr>
					<td><a href="/user/userViews?uNum=${u.unum}">${u.unum}</a></td>
					<td>${u.uname}</td>
					<td>${u.uid}</td>
					<td>${u.upwd}</td>
					<td>${u.upwdch}</td>
					<td>${u.udesc}</td>
					<td>${u.uage}</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
		<button data-page='/user/userInsert'>등록</button>
	</div>
</body>
</html>