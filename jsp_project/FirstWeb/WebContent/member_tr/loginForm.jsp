<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!DOCTYPE html>
<html lang="ko">
</head>

<body>
    <h1>회원 로그인 </h1>
    <hr>
    <form action="login.jsp" method="post">
        <table>
            <tr>
                <th><label for="userid">아이디</label></th>
                <td>
                    <input type="text" id="userid" name="userid">
                </td>
            </tr>
            <tr>
                <th><label for="pw">비밀번호</label></th>
                <td>
                    <input type="password" id="pw" name="pw">
                </td>
            </tr>
            <tr>
                <th>
                <td>
                    <input type="checkbox" id="chk" name="chk">아이디저장
                </td>
            </tr>            
            <tr>
                <td >
                    
                </td>
                <td>
                <input type="submit" value="로그인">
                </td>
            </tr>
        </table>
    </form>

</body>

</html>