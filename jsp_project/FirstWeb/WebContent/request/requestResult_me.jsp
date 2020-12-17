<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Request result</title>
</head>
<body>


	<h1>Request result</h1>
	<hr>
	<table>
		<tr>
			<td>이름</td>
			<td><%=request.getParameter("name") %></td>
		</tr>
		<tr>
			<td>학과</td>
			<td><%=request.getParameter("major") %></td>
		</tr>
			<tr>
			<td>취미</td>
			<td>
			<% String[] hobbies = request.getParameterValues("hobby");
			for(int i=0; i<hobbies.length; i++){
				out.println(hobbies[i]+"<br>");}			
			%>
				</td>
		</tr>
		<tr>
			<td>학년</td>
			<td><%=request.getParameter("year") %></td>
		</tr>
		</table>
</body>
</html>