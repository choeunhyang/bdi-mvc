<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp"%>
<c:if test="${!empty rMap}">
<script>
	alert('${rMap.msg}');
	if(${rMap.cnt}==1){
		location.href="/game/gameList";
	}
</script>
</c:if>
<body>
	<div class="container">
		<table class="table table-bordered table-hover">
			<tr>
				<th>등록순서</th>
				<td>${game.gcNum}</td>
			</tr>
			<tr>
				<th>게임이름</th>
				<td>${game.gcName}</td>
			</tr>
			<tr>
				<th>게임가격</th>
				<td>${game.gcPrice}</td>
			</tr>
			<tr>
				<th>게임회사</th>
				<td>${game.gcVendor}</td>
			</tr>
			<tr>
				<th>게임순위</th>
				<td>${game.gcOrder}</td>
			</tr>
			<tr>
				<th>게임설명</th>
				<td>${game.gcDesc}</td>
			</tr>
			<tr>
				<th>게임이미지</th>
				<td>${game.gcImg}</td>
			</tr>
		</table>
		<form action="/game/gameDelete" method="post">
			<button data-page="/game/gameUpdate?gcNum=${game.gcNum}">게임수정</button>
			<button>게임삭제</button>
			<input type="hidden" name="gcNum" value="${game.gcNum}">
		</form>
	</div>
</body>
</html>