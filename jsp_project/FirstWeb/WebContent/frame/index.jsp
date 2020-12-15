<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- 모듈화 하는 방법 -->
	<meta charset="UTF-8">
	<title>Frame Include</title>
	<style>
		div.header{
			text-align: center;
		}
		div.nav {
			text-align: center;
		}
		div.news,div.shopping {
			width: 45%;
		}
		div.news{
		float: left;
		}
		div.shopping{
		float: right;
		}
		div.footer{
			clear : both;
			text-align:center;
		}
	</style>
	
</head>
<body>
<%@ include file="header.jsp" %>
<%@ include file="navi.jsp" %>
<div class="contents">
<%@ include file="news.jsp" %>
<%@ include file="shopping.jsp" %>
</div>
<%-- <%@ include file="footer.jsp" %> --%>
<%-- <jsp:include page="footer.jsp">
	<jsp:param value="cool@gmail.coms" name="email"/>
	<jsp:param value="010-9999-1111" name="tel"/>
</jsp:include> --%>
<!-- 아래 코드 때문에 위에 코드들이 의미없어짐 -->
<jsp:forward page="footer.jsp">
	<jsp:param value="cool@gmail.coms" name="email"/>
	<jsp:param value="010-9999-1111" name="tel"/>
</jsp:forward>

</body>
</html>