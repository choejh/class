<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	


//데이터 받고
//sql:insert
//insert: insert_view
//한글처리해


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
String sqlInsert = "insert into dept (deptno,dname,loc) values ('"+deptno+"','"+dname+"','"+dloc+"')";

int resultCnt = stmt.executeUpdate(sqlInsert);
if(resultCnt>0) {
	System.out.println("데이터가 정상적으로 입력되었습니다.");
} 
%>
  <jsp:forward page="insert_view.jsp"/> 