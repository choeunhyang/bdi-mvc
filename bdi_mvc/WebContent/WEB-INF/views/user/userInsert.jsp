<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp"%>
<body>
	<div class="container">
		<table class="table table-bordered">
			<tr>
				<th>이름</th>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<th>나이</th>
				<td><input type="number" name="age"></td>
			</tr>
			<tr>
				<th colspan="2"><button onclick="insertDel()">등록</button>
				<button onclick="goPage()">취소</button></th>
			</tr>
		</table>
	</div>
	<script>
		function insertDel(){
			
		}
		function goPage(){
			location.href='/user/userList';
		}
	</script>
</body>
</html>