<%@page import="form.FormReg"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//1.사용자로부터 받은 데이터를 beans에 저장 beans객체 생성
FormReg formReg = new FormReg();

//사용자로부터 데이터 받아오기 request
String userid = request.getParameter("userid");
String userpw = request.getParameter("pw");
String username = request.getParameter("username");

//beans에 데이터 저장
formReg.setId(userid);
formReg.setPw(userpw);
formReg.setName(username);

//view.js로 beans 객체 전달
request.setAttribute("data", formReg);

%>



<jsp:forward page="reg_view.jsp"/>