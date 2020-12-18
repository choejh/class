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




//사용자로부터 받은 데이터를 beans에 저장 beans객체 생성
FormLogin formLogin = new FormLogin();

//beans에 데이터를 저장
formLogin.setId(userid);
formLogin.setPw(userpw);

//view.js로 beans 객체를 전달(공유)
request.setAttribute("data",formLogin);
%>

<jsp:forward page="login_view.jsp"/>