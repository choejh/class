<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
	<c:url value="/css/default1.css" var="url_Css" scope="application"/>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="styleSheet" href="${url_Css}">
 <style>
</style>
</head>
<body>
<div class="frame">
<%@ include file="/include/header.jsp" %>
<%@ include file="/include/nav.jsp" %>
    <div class="inside">
<%
if(session != null && session.getAttribute("loginInfo")!=null){
%>
	<%@ include file="/include/aside2.jsp" %>
<%
}else{
	%> <%@ include file="/include/aside.jsp"%>
<%
}
%>
    <div class="contents">
    <h2>회원 전용 사진관 입니다^^</h2>
	<img src="../images/2.jpg" alt="아이스베어"> <br>
	<img src="../images/3.jpg" alt="아이스베어와 그리즐리">
    </div>
    </div>    
<%@ include file="/include/footer.jsp" %>
</div>   
</body>
</html>