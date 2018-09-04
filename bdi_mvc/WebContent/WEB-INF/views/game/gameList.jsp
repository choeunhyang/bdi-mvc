<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp"%>
<body>
	<div class="container">
		<table class="table table-bordered table-hover">
			<thead>
				<tr>
					<th width="30%">등록순서</th>
					<th>게임이름</th>
					<th>게임가격</th>
					<th>게임회사</th>
					<th>게임순위</th>
					<th>게임설명</th>
					<th>게임이미지</th>
				</tr>
			</thead>
			<c:forEach items="${gameList}" var="game">
				<tbody>
					<tr>
						<td>${game.gcNum}</td>
						<td><a href="/game/gameView?gcNum=${game.gcNum}">${game.gcName}</a></td>
						<td>${game.gcPrice}</td>
						<td>${game.gcVendor}</td>
						<td>${game.gcOrder}</td>
						<td>${game.gcDesc}</td>
						<td>
							<c:if test="${!empty game.gcImg}">
								<img src="${game.gcImg}" width="50px" height="50px">
							</c:if>
						</td>
					</tr>
				</tbody>
			</c:forEach>
		</table>
			<button data-page="/views/game/gameInsert">게임등록</button>
	</div>
</body>
</html>