<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%  
    

request.setCharacterEncoding("UTF-8");

String dname = request.getParameter("dname");
String dloc = request.getParameter("dloc");
String deptno =request.getParameter("deptno");



 //sql 연결
	Connection conn=null;
	//1. 드라이버 로드
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	//2. DB 연결 : Connection 객체를 얻어온다.
	String jdbcUrl = "jdbc:mysql://localhost:3306/open?serverTimezone=UTC";
	String user = "aia";
	String password = "aia";
	
	conn = DriverManager.getConnection(jdbcUrl, user, password);
	
	out.println("<h1>mysql 연결</h1>");
	
	//Statement
	Statement stmt = conn.createStatement();


//데이터 입력시키기
String sqlChange = "update dept set dname = '"+dname+"', dloc = '"+dloc+"' WHERE deptno = '"+deptno+"'";

int resultCnt = stmt.executeUpdate(sqlChange);
if(resultCnt>0) {
	System.out.println("데이터가 정상적으로 입력되었습니다.");
} 
%>
  <jsp:forward page="insert_view.jsp"/> 