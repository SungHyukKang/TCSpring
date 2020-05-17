<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<table width="500" cellpadding="0" cellspacing="0" border="1">
<tr>
<th>gname</th>
<th>gintro</th>
<th>gboss</th>
<th>date</th>
</tr>
<c:forEach items="${gdto}" var="asd">
<tr>
<td>${asd.gname}</td>
<td>${asd.gintro}</td>
<td>${asd.gboss}</td>
<td>${asd.gdate}</td>
</tr>
</c:forEach>
</table>
</body>
</html>