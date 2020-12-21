<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
*{
background-color:#D99B66;
}
#div1{
background-color:white;
}
</style>
</head>

<body>
<h1>데이터 입력</h1>
<form action="insert.jsp" method="post">
	부서 번호: <input id="deptno" name="deptno"><br>
	부서 이름: <input id="dname" name="dname"><br>
	부서 위치: <input id="dloc" name="dloc"><br>
	<input type="submit">
</Form>
<hr>
<h1>데이터 삭제</h1>
<form action="delete.jsp" method="post">
	부서 번호: <input id="deptno" name="deptno"><br>
	<input type="submit">
</Form>
<hr>
<h1>데이터 변경</h1>
<form action="change.jsp" method="post">
	부서 번호: <input id="deptno" name="deptno"><br>
	새로 변경할 부서 이름: <input id="dname" name="deptno"><br>
	새로 변경할 부서 위치: <input id="dloc" name="deptno"><br>
	<input type="submit">
</Form>
</body>
</html>