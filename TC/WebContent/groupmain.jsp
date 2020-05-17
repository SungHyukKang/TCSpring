<%@page import="com.mysql.cj.Session"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>

<body>
	<table width="500" cellpadding="0" cellspacing="0" border="1">
	<tr>
	<th>fnum</th>
	<th>ftitle</th>
	<th>content</th>
	<th>fdate</th>
	<th>fid</th>
	<th>fview</th>
	</tr>
	<c:forEach  var="asd" items="${result}">
	<tr>
	<td>${asd.fnum}</td>
	<td>${asd.ftitle}</td>
	<td>${asd.content}</td>
	<td>${asd.fadate}</td>
	<td>${asd.fid}</td>
	<td>${asd.fview}</td>
	</tr>
	</c:forEach>
	</table>
	<button><a href='free_write.jsp?gnum=<c:out value="${gnum }"/>'>±Û¾²±â</a></button>
	
</body>
</html>