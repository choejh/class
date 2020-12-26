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
<%@ include file="/include/aside.jsp" %>
    <div class="contents">
		안녕하세요 wisdom's 홈페이지에 오신것을 환영합니다^^<br>
		이 곳은 메인 페이지 입니다 
    </div>
    </div>    
    <footer>
    밑밑밑밑
    </footer>
</div>   
</body>
</html>