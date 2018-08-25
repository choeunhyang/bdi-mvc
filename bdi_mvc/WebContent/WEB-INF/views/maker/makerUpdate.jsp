<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp"%>
<body>
	<div class="container">
		<h4 align="center">메이커리스트 수정</h4>
		<table class="table table-bordered table-hover">
			<tr>
				<th width="30%">번호</th>
				<td>${maker.mnum}</td>
			</tr>
			<tr>
				<th>메이커명</th>
				<td><input type="text" name="mname"></td>
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
		</table>
	</div>
</body>
</html>