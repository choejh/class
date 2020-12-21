<%@page import="util.CookieBox"%>
<%@page import="form.FormLogin"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%

//사용자로부터 데이터 받아오기 request
String userid = request.getParameter("userid");
String userpw = request.getParameter("pw");
String chk = request.getParameter("chk");

if(chk!=null && chk.equals("on")&& userid!=null && !userid.isEmpty()){
	//쿠키 생성 저장
	//uid=userId
	response.addCookie(CookieBox.createCookie("uid",userid,"/", 60*60*24*36));
}else{
	response.addCookie(CookieBox.createCookie("uid", userid,"/",0));
}


//session을 이용해서 로그인 처리
//id,pw 비교해서 같으면 로그인 성공, 다르면 실패
//로그인 여부 체크하기
boolean loginChk = false;

if(userid.equals(userpw)){
	//beans생성
FormLogin formLogin = new FormLogin();

//beans에 데이터를 저장
formLogin.setId(userid);
formLogin.setPw(userpw);

//데이터 공유: request이용
request.setAttribute("data",formLogin);
//session객체 속성에 로그인정보 저장
session.setAttribute("logininfo", formLogin);
loginChk = true;
}

//login_view.jsp로 포워딩
if(loginChk){
%>
<jsp:forward page="login_view.jsp"/>
<%
} else {
%>
<script>
	alert("아이디 혹은 비밀번호가 틀립니다. 다시 로그인 하세요.");
	history.ho(-1);
</script>
<%
		}
%>