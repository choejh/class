<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
	<nav>
		<ul> <%-- <c:url value="/"/> -> /op/ --%>
			<li><a href="#">HOME</a></li>

			<li><a href="#">회원가입</a></li>

			<li><c:url value="/login/login" var="login"/>
				<a href="${login}">${login}</a></li>
			<%-- <li><a href="<c:url value="/member/logout.jsp"/>">로그아웃</a></li> --%>
			
			<li><a href="#">mypage1</a></li>
			<li><a href="#">mypage2</a></li>
			<li><a href="#">회원정보</a></li>
			<li><a href="#">방명록</a></li>
		</ul>												
	</nav>