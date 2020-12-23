<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<fmt:formatNumber value="1000000"/> <!-- 1,000,000 -->
	<fmt:formatNumber value="1000000" groupingUsed="false"/> <!-- 1000000 -->
	
	<c:set var="number" value="10000000"/>
	<fmt:formatNumber value="${number}"/> <!-- 10,000,000 -->
	<fmt:formatNumber var="here" value="${number}"/>
	${here} <!-- 10,000,000 -->
	
	<br>
	통화: <fmt:formatNumber value="${number}" type="currency" currencySymbol="$"/> <!-- ￦$10,000,000 -->
	<br>
	퍼센트: <fmt:formatNumber value="${number/50000000}" type="percent" groupingUsed="false"/> <!-- 20% -->
	<br>
	패턴: <fmt:formatNumber value="${number}" pattern="0,000.00"/> <!-- 10,000,000.00 -->
</body>
</html>