<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp"%>
<c:if test="${!empty rMap}">
<script>
	alert('${rMap.msg}');
	if('${rMap.success}'=='true'){
		location.href='views/maker/makerViews';
	}
</script>
</c:if>
<body>
	<%-- ${maker} --%>
	<div class="container">
		<h4 align="center">메이커리스트</h4>
		<table class="table table-bordered table-hover">
			<%-- <c:forEach items="${list}" var="m"> --%>
			<tr>
				<th width="30%">번호</th>
				<td>${maker.mnum}</td>
			</tr>
			<tr>
				<th>메이커명</th>
				<td>${maker.mname}</td>
			</tr>
			<tr>
				<th>가격</th>
				<td>${maker.mprice}</td>
			</tr>
			<tr>
				<th>수량</th>
				<td>${maker.mcnt}</td>
			</tr>
			<tr>
				<th>총액</th>
				<td>${maker.mprice*maker.mcnt}</td>
			</tr>
			<tr>
				<th>메이커설명</th>
				<td>${maker.mdesc}</td>
			</tr>
			<%-- </c:forEach> --%>
		</table>
		<form action="/maker/makerDelete" method="post" style="text-align:center;">
			<button type="button" data-page='/maker/makerUpdate?mNum=${maker.mnum}'>메이커수정</button>
			<button type="button" data-page='/maker/makerList'>돌아가기</button>
			<button>메이커삭제</button>
			<input type="hidden" name="mNum" value="${maker.mnum}">
		</form>
	</div>
</body>
</html>