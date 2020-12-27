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
   	<form action="<c:url value="/member/login.jsp"/>" method="post">
   	<table>
   		<tr>
   			<th><label for="userid">아이디</label></th>
   			<td><input type="text" id="userid" name="userid"
   			value="<%=saveId%>"></td>
   		</tr>
   		<tr>
   			<th><label for="pw">비밀번호</label></th>
   			<td><input type="password" id="pw" name="pw" ></td>
   		</tr>
   		<tr>
   			<th></th>
   			<td><input type="checkbox" name="chk" value="on" <%=checked%>>아이디저장</td>
   		</tr>
   	</table>
	   <input type="submit" value="로그인" id=login>
    </form>
    	<button id="join" onclick="location.href='${pageContext.request.contextPath}/member/joinForm.jsp'">회원가입</button>
   </aside>

</body>
</html>