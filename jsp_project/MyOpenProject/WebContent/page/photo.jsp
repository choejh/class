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
	회원 전용 사진관입니다 ^^
    </div>
    </div>    
    <footer>
    밑밑밑밑
    </footer>
</div>   
</body>
</html>