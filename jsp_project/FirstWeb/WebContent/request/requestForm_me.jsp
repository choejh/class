<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Request Form</title>
</head>
<body>


	<h1>Request Form</h1>
	<hr>
	<form action="requestResult_me.jsp" method="get">
	<table>
		<tr>
			<td>이름</td>
			<td><input type="text" name="name" id="name"></td>
		</tr>
		<tr>
			<td>학과</td>
			<td><select name="major">
				<option value="경제학과">경제학과</option>
				<option value="컴퓨터공학과">컴퓨터공학과</option>
				<option value="사회학과">사회학과</option>
				<option value="영어영문학과">영어영문학과</option>
			</select></td>
		</tr>
			<tr>
			<td>취미</td>
			<td>
				<input type="checkbox" name="hobby" value="운동">운동<br>
				<input type="checkbox" name="hobby" value="악기연주">악기연주<br>
				<input type="checkbox" name="hobby" value="독서">독서<br>
				<input type="checkbox" name="hobby" value="온라인게임">온라인게임<br>				
			</td>
		</tr>
		<tr>
			<td>학년</td>
			<td>
				<td><select name="year">
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
				</select>
				</td>
		<tr>
			<td><input type="submit" value="보내기">
			<input type="reset"></td>
		</tr>	
	</table>
	</form>
</body>
</html>