<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th>title</th>
<th>content</th>
<th>id</th>
<th>date</th>
</tr>
<c:set var="dto" value="${dto}"/>
<tr>
<td><c:out value="${dto.ftitle}"/></td>
<td><c:out value="${dto.fcontent}"/></td>
<td><c:out value="${dto.fid}"/></td>
<td><c:out value="${dto.fdate}"/></td>
</tr>
</table>
<table>
<tr>작성자</tr>
<tr>내용</tr>
<tr>작성 일시</tr>
<c:forEach var="loadcomment" items="${loadcomment}">
<tr>
<td>${loadcomment.fcid}</td>
<td>${loadcomment.fccontent }</td>
<td>${loadcomment.fcdate}</td>
</tr>
</c:forEach>
</table>
<form action='comment.do'>
<input type="hidden" name="fnum" value='<c:out value="${dto.fnum}"/>'>
<input type="text" name="comment">
<input type="submit" value="작성">
</form>

</body>
</html>