<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <aside>
   	<form>
   	<table>
   		<tr>
   			<th><label for="userid">아이디</label></th>
   			<td><input type="text" id="userid" name="userid"></td>
   		</tr>
   		<tr>
   			<th><label for="pw">비밀번호</label></th>
   			<td><input type="password" id="pw" name="pw" ></td>
   		</tr>
   		<tr>
   			<th></th>
   			<td><input type="checkbox" name="chk" value="on">아이디저장</td>
   		</tr>
   	</table>
   	<input type="submit" value="로그인" id="login"> <div id="join">회원가입</div>
   	</form>
   </aside>

</body>
</html>