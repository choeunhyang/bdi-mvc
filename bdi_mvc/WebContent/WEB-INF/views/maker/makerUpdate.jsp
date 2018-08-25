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
				<th width="30%">메이커명</th>
				<td><input type="text" name="mName" value="${maker.mname}"></td>
			</tr>
			<tr>
				<th>가격</th>
				<td><input type="number" name="mPrice" value="${maker.mprice}"></td>
			</tr>
			<tr>
				<th>수량</th>
				<td><input type="number" name="mCnt" value="${maker.mcnt}"></td>
			</tr>
			<tr>
				<th>메이커설명</th>
				<td><input type="text" name="mDesc" value="${maker.mdesc}"></td>
			</tr>
		</table>
		<div>
			<button data-page='/maker/makerView?mNum=${maker.mnum}'>수정</button>
			<button data-page='/maker/makerList'>취소</button>
		</div>
	</div>
</body>
</html>