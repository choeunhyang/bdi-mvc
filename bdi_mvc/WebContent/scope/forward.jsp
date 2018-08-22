<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp"%>
<body>
<c:forEach items="${list}" var="m">
	${m.mnum}. ${m.mname} - ${m.mprice}<br>
</c:forEach>

<%-- ${list} --%>

<%-- 
<%=request.getAttribute("name")%><br>
이름 : ${name}<br>
나이 : ${age}<br>
${test.cpu}
${test.ram}
${test.ssd}<br>
${test}
 --%>
</body>
</html>