<%@page import="member.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 		 Member member = (Member) request.getAttribute("memberInfo");
 	 /* el을 사용하면 위에 것이 필요가 없어 */
 %>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원가입이 완료되었습니다.</h1>
	<h3>
		ID : ${memberInfo.userId}, <%= member.getUserId() %>, <br>
		PW : ${memberInfo.pw}, <%= member.getPw() %>, <br>
		Name : ${memberInfo.userName}, <%=member.getUserName() %> , <br>
		Photo : ${memberInfo.photo}, <%=member.getPhoto() %>
	</h3>
</body>
</html>