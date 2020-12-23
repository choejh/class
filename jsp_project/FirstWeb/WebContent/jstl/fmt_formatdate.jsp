<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
	request.setAttribute("now", new Date());
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

${now}
<%-- <fmt:timeZone value="Hongkong"/> --%>
<br>
<fmt:formatDate value="${now}"/> <!-- 2020. 12. 23 -->
<br>
<fmt:formatDate value="${now}" type="date"/> <!-- 2020. 12. 23 -->
<br>
<fmt:formatDate value="${now}" type="date" dateStyle="full"/> <!-- 2020년 12월 23일 수요일 -->
<br>
<fmt:formatDate value="${now}" type="date" dateStyle="short"/> <!-- 20. 12. 23 -->
<br>
<fmt:formatDate value="${now}" type="time"/> <!-- 오전 11:10:14 -->
<br>
<fmt:formatDate value="${now}" type="time" timeStyle="full"/> <!-- 오전 11시 11분 32초 KST -->
<br>
<fmt:formatDate value="${now}" type="time" timeStyle="short"/> <!-- 오전 11:11-->
<br>
<fmt:formatDate value="${now}" type="both"/> <!-- 2020. 12. 23 오전 11:12:14-->
<br>
<fmt:formatDate value="${now}" type="both" dateStyle="full" timeStyle="full"/> <!--2020년 12월 23일 수요일 오전 11시 13분 07초 KST-->
<br>
<fmt:formatDate value="${now}" pattern="z a h:mm"/> <!-- KST(z:존) 오전 11:14 -->
<br>
<fmt:formatDate value="${now}" pattern="yyyy-MM-dd a h:mm"/> <!--2020-12-23 오전 11:15 -->
<br>
<fmt:formatDate value="${now}" pattern="yyyy-MM-dd a h:mm" timeZone="Hongkong"/> <!--2020-12-23 오전 10:18 -->
<br>
<fmt:formatDate value="${now}" pattern="yyyy-MM-dd a h:mm" timeZone="Europe/Berlin"/> <!--2020-12-23 오전 3:24 -->
</body>
</html>