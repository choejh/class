<%@page import="member.Member"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%

	List<Member> members = new ArrayList<Member>();
	members.add(new Member("cool1","1111","DOOL11","photo11.jpg"));
	members.add(new Member("cool2","2222","DOOL12","photo12.jpg"));
	members.add(new Member("cool3","3333","DOOL13",null));
	members.add(new Member("cool4","4444","DOOL14","photo14.jpg"));
	members.add(new Member("cool5","5555","DOOL15","photo15.jpg"));
	members.add(new Member("cool6","6666","DOOL16","photo16.jpg"));
	members.add(new Member("cool7","7777","DOOL17","photo17.jpg"));
	members.add(new Member("cool8","8888","DOOL18",null));
	members.add(new Member("cool9","9999","DOOL19",null));
	members.add(new Member("cool10","0000","DOOL20","photo20.jpg"));

	session.setAttribute("members", members);
	
%>