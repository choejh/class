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
    <c:if test="${result>0}">
		회원가입이 완료되었습니다.
		</c:if>
		<c:if test="${result eq 0}">
		회원가입이 정상 처리되지 않았습니다.
		</c:if>
		
		
    </div>
    </div>    
<%@ include file="/include/footer.jsp" %>
</div>   
</body>
</html>