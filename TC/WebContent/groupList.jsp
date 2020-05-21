<%@page import="com.mysql.cj.Session"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="dao.groupDAO" %>
<%@ page import="java.util.*" %>
<%@ page import="java.io.PrintWriter" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>

<body>
	<table width="500" cellpadding="0" cellspacing="0" border="1">
	<tr>
	<th>gname</th>
	<th>gintro</th>
	<th>gboss</th>
	</tr>
	<c:forEach items="${gdto}" var="asd">
	<tr>
	<td><a href='groupmain.do?gnum=${asd.gnum}'>${asd.gname}</a></td>
	<td>${asd.gintro}</td>
	<td>${asd.gboss}</td>
	<form action="groupJoin.do">
	<td><input type="checkbox" name ="list" value="${asd.gnum}"></td>
	</tr>
	</c:forEach>
	</table>
	<input type="submit" value="가입">
</form>
</body>
</html>