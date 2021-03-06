<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp"%>
<c:if test="${!empty rMap}">
<script>
	alert('${rMap.msg}');
	if('${rMap.success}'=='true'){
		location.href='/maker/makerList';
	}
</script>
</c:if>
<body>
<div class="container">
	<h4 align="center">메이커리스트 등록</h4>
	<form action="/maker/makerInsert" method="post">
		<table class="table table-bordered">
				<tr>
					<th>메이커명</th>
					<td><input type="text" name="mName"></td>
				</tr>
				<tr>
					<th>가격</th>
					<td><input type="number" name="mPrice"></td>
				</tr>
				<tr>
					<th>수량</th>
					<td><input type="number" name="mCnt"></td>
				</tr>
				<tr>
					<th>메이커설명</th>
					<td><input type="text" name="mDesc"></td>
				</tr>
		</table>
	<div>
		<button>등록</button>
	</div>
	</form>
</div>
</body>
</html>