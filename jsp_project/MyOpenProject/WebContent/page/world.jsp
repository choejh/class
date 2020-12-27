<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
	<c:url value="/css/default1.css" var="url_Css" scope="application"/>    
<%
	request.setAttribute("now", new Date());
%>

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
<h2>세계시계</h2>
대한민국<br>
<fmt:formatDate value="${now}" pattern="yyyy-MM-dd a h:mm"/><br>
홍콩<br>
<fmt:formatDate value="${now}" pattern="yyyy-MM-dd a h:mm" timeZone="Hongkong"/><br>
독일(베를린)<br>
<fmt:formatDate value="${now}" pattern="yyyy-MM-dd a h:mm" timeZone="Europe/Berlin"/><br>

    </div>
    </div>    
<%@ include file="/include/footer.jsp" %>
</div>   
</body>
</html>