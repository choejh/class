<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 	request.setAttribute("userName", "손흥민1");
 	session.setAttribute("userName", "손흥민2");
 	application.setAttribute("userName", "손흥민3");
 	session.setAttribute("userId", "son");
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>
		requestScope.userName : ${requestScope.userName},
				${userName}
			<%=request.getAttribute("userName") %> <br>
		sessionScope.userId : ${sessionScope.userId}
			<%=session.getAttribute("userId") %> <br>
		param.code: ${param.code}
			<%=request.getParameter("code") %> <br>
		pageContext: ${pageContext.request.requestURL} <br>
			<%= pageContext.getRequest().getServletContext()
					.getContextPath() %>
			 ${pageContext.request.requestURI} <br>
			 ${pageContext.request.contextPath} <br>
	</h1>
	<a href="view1"></a>
<!-- page, request session application 순서로 userid를 찾는다. -->
</body>
</html>