
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <%@ include file="/WEB-INF/views/include/basicset.jsp"%> 
<style>
</style>
</head>
<body>


	<%@ include file="/WEB-INF/views/include/header.jsp"%>

	<%@ include file="/WEB-INF/views/include/nav.jsp"%>

	<main class="container">
		
		<div class="d-flex align-items-center p-3 my-3 text-white bg-purple rounded shadow-sm">
   <!--  <img class="me-3" src="css/bootstrap/bootstrap-logo-white.svg" alt="" width="48" height="38"> -->
    <div class="lh-1">
      <h1 class="h6 mb-0 text-white lh-1">MEMBER</h1>
      <small>Since 2011</small>
    </div>
		</div>
		 <div class="my-3 p-3 bg-white rounded shadow-sm">
    <h3 class="border-bottom pb-2 mb-0">Please sign in</h3>
    <div class="d-flex text-muted pt-3">
    
    <form method="post">
    <label for="userid" class="visually-hidden">Email address</label>
    <input type="email" id="userid" name="userid" value="${cookie.uid.value}" class="form-control" placeholder="Email address" required autofocus>
    <label for="pw" class="visually-hidden">Password</label>
    <input type="password" id="pw" name="pw" class="form-control" placeholder="Password" required>
    <div class="checkbox mb-3">
      <label>
        <input type="checkbox" name="chk" value="on" value="remember-me" ${cookie.uid ne null? 'checked' : '' }> Remember ID(email)
      </label>
    </div>
    
    <input class="w-100 btn btn-lg btn-primary" type="submit" value="로그인">
  </form>
    
    
    
    
    
    
    
    <%-- 
    
    <form method="post">
				<table>
					<tr>
						<th><label for="userid">아이디</label></th>
						<td><input type="text" id="userid" name="userid"
							value="${cookie.uid.value}"></td>
					</tr>
					<tr>
						<th><label for="pw">비밀번호</label></th>
						<td><input type="password" id="pw" name="pw"></td>
					</tr>
					<tr>
						<th></th>
						<td><input type="checkbox" name="chk" value="on"
							${cookie.uid ne null? 'checked' : '' }> 아이디 저장</td>
					</tr>
					<tr>
						<td></td>
						<td><input type="submit" value="로그인"></td>
					</tr>
				</table>
			</form> --%>
    
    
  </div>
  </div>
	</main>






<%-- 		<div class="contents">
		<h2 class="content_title">Login Form</h2>
		<hr>
		<div class="content"> 
			<form method="post">
				<table>
					<tr>
						<th><label for="userid">아이디</label></th>
						<td><input type="text" id="userid" name="userid"
							value="${cookie.uid.value}"></td>
					</tr>
					<tr>
						<th><label for="pw">비밀번호</label></th>
						<td><input type="password" id="pw" name="pw"></td>
					</tr>
					<tr>
						<th></th>
						<td><input type="checkbox" name="chk" value="on"
							${cookie.uid ne null? 'checked' : '' }> 아이디 저장</td>
					</tr>
					<tr>
						<td></td>
						<td><input type="submit" value="로그인"></td>
					</tr>
				</table>
			</form>
		</div>
	</div> --%>

	<%@ include file="/WEB-INF/views/include/footer.jsp"%>
	
</body>
</html>