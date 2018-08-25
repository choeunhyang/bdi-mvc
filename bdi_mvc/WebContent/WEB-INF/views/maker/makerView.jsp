<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp"%>
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
		<div style="text-align:center;">
			<button data-page='/views/maker/makerInsert'>메이커등록</button>
			<button data-page='/maker/makerUpdate?mNum=${maker.mnum}'>메이커수정</button>
			<button data-page='/maker/makerList'>돌아가기</button>
			<button data-page='/maker/makerDelete?mNum=${maker.mnum}'>메이커삭제</button>
		</div>
	</div>
</body>
<script>
	window.onload = function() {
		var btns = document.querySelectorAll('button[data-page]');
		for (var i = 0; i < btns.length; i++) {
			btns[i].onclick = function(){
				location.href= this.getAttribute('data-page');
			}
		}
	}
</script>
</html>