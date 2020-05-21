<%@page import="com.mysql.cj.Session"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setCharacterEncoding("UTF-8"); %>
<% session.setAttribute("gnum", request.getParameter("gnum")); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<table width="500" cellpadding="0" cellspacing="0" border="1">
	<tr>
	<th>num</th>
	<th>title</th>
	<th>content</th>
	<th>date</th>
	<th>id</th>
	<th>view</th>
	</tr>
	<c:forEach  var="asd" items="${result}">
	<tr>
	<td>${asd.fnum}</td>
	<td><a href='boardlistdetail.do?fnum=<c:out value="${asd.fnum }"/>'>${asd.ftitle}</a></td>
	<td>${asd.fcontent}</td>
	<td>${asd.fdate}</td>
	<td>${asd.fid}</td>
	<td>${asd.fview}</td>
	</tr>
	</c:forEach>
	</table>
	<button><a href='free_write.jsp?gnum=<c:out value="${gnum }"/>'>글쓰기</a></button>
	
	
		
</body>
</html>