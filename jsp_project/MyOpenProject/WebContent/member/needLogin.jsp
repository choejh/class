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
		<h2>회원만 입장 가능합니다. 로그인 하세요.</h2>
    </div>
    </div>    
<%@ include file="/include/footer.jsp" %>
</div>   
</body>
</html>