<%@page import="form.FormLogin"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//로그인 상태 확인 : session 객체의 속성에 login이름의 속성이 있는지 여부
FormLogin formLogin = (FormLogin) session.getAttribute("logininfo");
boolean logincheck = formLogin ==null? false : true;
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
if(logincheck){
	out.println("<h1>로그인 상태</h1>");
	out.println("<h3>"+formLogin+"</h3>");
	out.println("<h3><a href=\"logout.jsp\">로그아웃</a></h3>");
}else{
%>
<script>	
	alert('로그인이 필요한 페이지 입니다.');
	location.href='login.jsp';
</script>
<%
}
%>
</body>
</html>