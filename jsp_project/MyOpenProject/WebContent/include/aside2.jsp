<%@page import="util.CookieBox"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>       
<%
CookieBox cookieBox = new CookieBox(request);
String saveId=cookieBox.exists("uid")? cookieBox.getValue("uid"):"";
String checked=cookieBox.exists("uid")? "checked":"";


%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <aside>
   회원님 안녕하세요<br>
   로그인 중입니다.<br>
   <button id="logout" onclick="location.href='${pageContext.request.contextPath}/member/logout.jsp'">로그아웃</button>
   </aside>

</body>
</html>